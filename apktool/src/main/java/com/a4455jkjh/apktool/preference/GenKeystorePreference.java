package com.a4455jkjh.apktool.preference;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.DialogPreference;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.a4455jkjh.apktool.R;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Random;
import sun1.security.x509.AlgorithmId;
import sun1.security.x509.CertificateAlgorithmId;
import sun1.security.x509.CertificateExtensions;
import sun1.security.x509.CertificateIssuerName;
import sun1.security.x509.CertificateSerialNumber;
import sun1.security.x509.CertificateSubjectName;
import sun1.security.x509.CertificateValidity;
import sun1.security.x509.CertificateVersion;
import sun1.security.x509.CertificateX509Key;
import sun1.security.x509.KeyIdentifier;
import sun1.security.x509.PrivateKeyUsageExtension;
import sun1.security.x509.SubjectKeyIdentifierExtension;
import sun1.security.x509.X500Name;
import sun1.security.x509.X509CertImpl;
import sun1.security.x509.X509CertInfo;

public class GenKeystorePreference extends DialogPreference implements TextWatcher, AdapterView.OnItemSelectedListener {

	private EditText alias;
    private TextView cert;
    private EditText commonName;
    private EditText country;
    private Button create;
    private Button createAndUse;
    private EditText date;
    private Spinner format;
    private boolean isChanging = false;
    private EditText keyPass;
    private EditText keySize;
    private EditText localityName;
    private EditText organizationName;
    private EditText organizationUnit;
    private View password;
    private EditText path;
    private EditText stateName;
    private EditText storePass;

    public static class KeyParam {
        public String certOrAlias;
        public String commonName;
        public String country;
        public long days;
        public String keyPass;
        public String keyPath;
        public int keySize;
        public String localityName;
        public String organizationName;
        public String organizationUnit;
        public String stateName;
        public String storePass;
        public int type;
    }

	public GenKeystorePreference(Context ctx, AttributeSet a) {
		super(ctx, a);
		setDialogLayoutResource(R.layout.genkey);
	}

	@Override
	protected void showDialog(Bundle state) {
		super.showDialog(state);
		AlertDialog dialog = (AlertDialog) getDialog();
		dialog.getWindow().
			setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
		create = dialog.getButton(DialogInterface.BUTTON_POSITIVE);
		createAndUse = dialog.getButton(DialogInterface.BUTTON_NEUTRAL);
	}

	@Override
	protected View onCreateDialogView() {
		View view = super.onCreateDialogView();
		this.format = view.findViewById(R.id.format);
		this.path = view.findViewById(R.id.path);
		this.alias = view.findViewById(R.id.alias);
		this.storePass = view.findViewById(R.id.storePass);
		this.keyPass = view.findViewById(R.id.keyPass);
		this.commonName = view.findViewById(R.id.name);
		this.organizationUnit = view.findViewById(R.id.organizationUnit);
		this.organizationName =  view.findViewById(R.id.organizationName);
		this.localityName =  view.findViewById(R.id.localityName);
		this.stateName =  view.findViewById(R.id.stateName);
		this.country =  view.findViewById(R.id.country);
		this.date =  view.findViewById(R.id.date);
		this.cert = view.findViewById(R.id.cert);
		this.keySize =  view.findViewById(R.id.keySize);
		this.password = view.findViewById(R.id.password);
		this.format.setOnItemSelectedListener(this);
		this.path.addTextChangedListener(this);
		this.alias.addTextChangedListener(this);
		this.storePass.addTextChangedListener(this);
		this.date.addTextChangedListener(this);
		return view;
	}

	@Override
	public void onNothingSelected(AdapterView<?> p1) {
		// TODO: Implement this method
	}

	public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        switch (i) {
            case 0:
            case 1:
            case 2:
                this.cert.setText(R.string.key_alias);
                this.password.setVisibility(0);
                if (this.alias.getText().toString().startsWith("/")) {
                    this.alias.setText("");
                    return;
                }
                return;
            case 3:
                setAlias();
                this.cert.setText(R.string.cert_path);
                this.password.setVisibility(8);
                this.keyPass.setText("");
                this.storePass.setText("");
                return;
            default:
                return;
        }
    }

	@Override
	protected void onPrepareDialogBuilder(AlertDialog.Builder builder) {
		super.onPrepareDialogBuilder(builder);
		builder.setNeutralButton(R.string.create_and_use, this);
	}

	@Override
	public void onClick(DialogInterface dialog, int which) {
		if (which == DialogInterface.BUTTON_NEGATIVE)
			return;
		KeyParam par = save();
		if (par == null || which == DialogInterface.BUTTON_POSITIVE)
			return;
		SharedPreferences.Editor editor = getSharedPreferences().edit();
		editor.putInt("key_type", par.type);
		editor.putString("key_path", par.keyPath);
		editor.putString("cert_or_alias", par.certOrAlias);
		editor.putString("store_pass", par.storePass);
		editor.putString("key_pass", par.keyPass);
		editor.commit();
	}

	public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
	public void afterTextChanged(Editable editable) {
        setButton();
        if (this.format.getSelectedItemPosition() == 3) {
            setAlias();
        }
    }
	public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
	private void setButton() {
        boolean z = true;
        if (checkEmpty(this.path) || checkEmpty(this.alias) || checkEmpty(this.date) || (this.format.getSelectedItemPosition() != 3 && checkEmpty(this.storePass))) {
            z = false;
        }
        this.create.setEnabled(z);
        this.createAndUse.setEnabled(z);
    }
	private boolean checkEmpty(EditText editText) {
        return editText.getText().length() == 0;
    }
	private void setAlias() {
        if (!this.isChanging) {
            CharSequence charSequence;
            this.isChanging = true;
            String obj = this.path.getText().toString();
            if (obj.isEmpty()) {
                charSequence = "";
            } else if (obj.endsWith(".pk8")) {
                charSequence = obj.substring(0, obj.length() - 3) + "x509.pem";
            } else {
                charSequence = obj + ".x509.pem";
            }
            this.alias.setText(charSequence);
            this.isChanging = false;
        }
    }
	private KeyParam save() {
        int i = 0;
        KeyParam keyParam = new KeyParam();
        int selectedItemPosition = this.format.getSelectedItemPosition();
        String obj = this.keySize.getText().toString();
        if (obj.equals("")) {
            keyParam.keySize = 2048;
        } else {
            keyParam.keySize = Integer.parseInt(obj);
        }
        keyParam.type = selectedItemPosition;
        keyParam.keyPath = this.path.getText().toString();
        keyParam.certOrAlias = this.alias.getText().toString();
        keyParam.storePass = this.storePass.getText().toString();
        keyParam.keyPass = this.keyPass.getText().toString();
        keyParam.commonName = this.commonName.getText().toString();
        keyParam.organizationUnit = this.organizationUnit.getText().toString();
        keyParam.organizationName = this.organizationName.getText().toString();
        keyParam.localityName = this.localityName.getText().toString();
        keyParam.stateName = this.stateName.getText().toString();
        keyParam.country = this.country.getText().toString();
        keyParam.days = Long.parseLong(this.date.getText().toString()) * 365;
        try {
            generateKey(keyParam);
            Toast.makeText(getContext(), "创建成功", 0).show();
            return keyParam;
        } catch (Exception e) {
            StringBuilder certificateEncodingException = new StringBuilder(e.getMessage());
            StackTraceElement[] stackTrace = e.getStackTrace();
            int length = stackTrace.length;
            for (int i2 = 0; i2 < length; i2++) {
                certificateEncodingException.append('\n').append(stackTrace[i2]);
            }
            error(certificateEncodingException);
            return null;
        }
    }
	private X509Certificate generateCert(PrivateKey privateKey, PublicKey publicKey, X500Name x500Name, Date date, Date date2, CertificateExtensions certificateExtensions) throws CertificateEncodingException, CertificateException, IOException, NoSuchAlgorithmException, NoSuchProviderException, SignatureException, InvalidKeyException {
        String str = "SHA512withRSA";
        try {
            CertificateValidity certificateValidity = new CertificateValidity(date, date2);
            X509CertInfo x509CertInfo = new X509CertInfo();
            x509CertInfo.set("version", new CertificateVersion(2));
            x509CertInfo.set("serialNumber", new CertificateSerialNumber(new Random().nextInt() & Integer.MAX_VALUE));
            x509CertInfo.set("algorithmID", new CertificateAlgorithmId(AlgorithmId.get(str)));
            x509CertInfo.set("subject", new CertificateSubjectName(x500Name));
            x509CertInfo.set("key", new CertificateX509Key(publicKey));
            x509CertInfo.set("validity", certificateValidity);
            x509CertInfo.set("issuer", new CertificateIssuerName(x500Name));
            if (certificateExtensions != null) {
                x509CertInfo.set("extensions", certificateExtensions);
            }
            X509CertImpl x509CertImpl = new X509CertImpl(x509CertInfo);
            x509CertImpl.sign(privateKey, str);
            return x509CertImpl;
        } catch (IOException e) {
            throw new CertificateEncodingException("getSelfCert: " + e.getMessage());
        }
    }
	private void write(PrivateKey privateKey, X509Certificate x509Certificate, KeyParam keyParam) throws KeyStoreException, CertificateException, NoSuchAlgorithmException, IOException {
        File keyFile = new File(keyParam.keyPath);
        if (!keyFile.getParentFile().exists()) {
            keyFile.getParentFile().mkdirs();
        }
        int i = keyParam.type;
        if (i < 3) {
            KeyStore instance = i == 0 ? KeyStore.getInstance("JKS") : i == 1 ? KeyStore.getInstance("PKCS12") : KeyStore.getInstance("BKS");
            if (keyFile.exists()) {
                instance.load(new FileInputStream(keyFile), keyParam.storePass.toCharArray());
            } else {
                instance.load(null);
            }
            instance.setKeyEntry(keyParam.certOrAlias, privateKey, keyParam.keyPass.toCharArray(), new X509Certificate[]{x509Certificate});
            instance.store(new FileOutputStream(keyFile), keyParam.storePass.toCharArray());
        } else if (i == 3) {
            FileOutputStream key = new FileOutputStream(keyFile);
            key.write(privateKey.getEncoded());
            key.close();
            FileOutputStream cery = new FileOutputStream(keyParam.certOrAlias);
            cery.write("-----BEGIN CERTIFICATE-----\n".getBytes());
			byte[] encoded = Base64.encode(x509Certificate.getEncoded(), Base64.DEFAULT);
            cery.write(encoded);
            cery.write("\n-----END CERTIFICATE-----\n".getBytes());
            cery.flush();
        }
    }
	private void generateKey(KeyParam keyParam) throws Exception {
        KeyPairGenerator instance = KeyPairGenerator.getInstance("RSA");
        instance.initialize(keyParam.keySize, SecureRandom.getInstance("SHA1PRNG"));
        KeyPair generateKeyPair = instance.generateKeyPair();
        PublicKey publicKey = generateKeyPair.getPublic();
        PrivateKey privateKey = generateKeyPair.getPrivate();
        CertificateExtensions certificateExtensions = new CertificateExtensions();
        certificateExtensions.set("SubjectKeyIdentifier", new SubjectKeyIdentifierExtension(new KeyIdentifier(publicKey).getIdentifier()));
        X500Name x500Name = new X500Name(keyParam.commonName, keyParam.organizationUnit, keyParam.organizationName, keyParam.localityName, keyParam.stateName, keyParam.country);
        Date date = new Date();
        long j = (keyParam.days * 24) * 3600000;
        Date date2 = new Date();
        date2.setTime(j + date.getTime());
        certificateExtensions.set("PrivateKeyUsage", new PrivateKeyUsageExtension(date, date2));
        write(privateKey, generateCert(privateKey, publicKey, x500Name, date, date2, certificateExtensions), keyParam);
    }
	protected final void error(CharSequence charSequence) {
        new AlertDialog.Builder(getContext()).
			setTitle("Error").
			setMessage(charSequence).
			setPositiveButton(R.string.ok, null).
			setCancelable(false).
			show();
    }
}
