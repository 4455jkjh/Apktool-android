package com.a4455jkjh.apktool.task;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import brut.util.Logger;
import com.a4455jkjh.apktool.R;
import com.a4455jkjh.apktool.util.Settings;
import com.android.apksig.ApkSigner;
import com.android.apksig.ApkVerifier;
import com.google.common.collect.ImmutableList;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyStore;
import java.security.MessageDigest;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.DSAKey;
import java.security.interfaces.DSAParams;
import java.security.interfaces.ECKey;
import java.security.interfaces.RSAKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.util.List;
import java.util.logging.Level;
import org.apache.commons.io.IOUtils;

public class SignUtil {
	public static void loadKey(Context context, LoadKeyCallback callback) {
		msgId = 0;
		msgObj = null;
		SharedPreferences sp = PreferenceManager.getDefaultSharedPreferences(context);
		boolean custom = sp.getBoolean("custom_signature_file", false);
		if (custom) {
			int type = sp.getInt("key_type", 0);
			String keyPath = sp.getString("key_path", "");
			String cert_or_alias = sp.getString("cert_or_alias", "");
			String store_pass = sp.getString("store_pass", "");
			String key_pass = sp.getString("key_pass", "");
			try {
				if (type == 3) 
					custom = loadKey(callback, keyPath, cert_or_alias);
				else
					custom = loadKey(context, callback, keyPath, type, cert_or_alias, store_pass, key_pass);
			} catch (Exception e) {
				error(context, keyPath);
			}
		}
		if (!custom) {
			SignUtil st = new SignUtil();
			st.privateKey = Settings.privateKey;
			st.certificate = Settings.certificate;
			callback.call(st);
		}
	}

	private static void error(Context context, String keyPath) {
		String msg = context.getResources().getString(R.string.load_signature_file_fail, keyPath);
		new AlertDialog.Builder(context).
			setTitle("Error").
			setMessage(msg).
			setPositiveButton("ok", null).
			show();
	}
	private static final String[] types = {"JKS", "PKCS12", "BKS"};
	private static boolean loadKey(Context context, SignUtil.LoadKeyCallback callback, String keyPath, int type, String alias, String store_pass, String key_pass) throws Exception {
		if (!exists(keyPath))
			return false;
		String keyType = types[type];
		final KeyStore ks = KeyStore.getInstance(keyType);
		if (store_pass.isEmpty()) {
			showPasswd(context, callback, ks, keyPath, alias);
		} else {
			char[] storePass = store_pass.toCharArray();
			char[] keyPass;
			if (key_pass.isEmpty())
				keyPass = storePass;
			else
				keyPass = key_pass.toCharArray();
			loadKey(callback, ks, keyPath, alias, storePass, keyPass);
		}
		return true;
	}

	private static void showPasswd(final Context context, final SignUtil.LoadKeyCallback callback, final KeyStore ks, final String keyPath, final String alias) {
		View view = LayoutInflater.from(context).
			inflate(R.layout.password, null);
		final EditText storePass = view.findViewById(R.id.storePass);
		final EditText keyPass = view.findViewById(R.id.keyPass);
		TextView msg = view.findViewById(R.id.msg);
		msg.setVisibility(View.VISIBLE);
		msg.setText(keyPath);
		new AlertDialog.Builder(context).
			setTitle(R.string.enter_password).
			setView(view).
			setPositiveButton(android.R.string.ok, new DialogInterface.OnClickListener(){
				@Override
				public void onClick(DialogInterface p1, int p2) {
					String store_pass = storePass.getText().toString();
					String key_pass = keyPass.getText().toString();
					if (key_pass.isEmpty())
						key_pass = store_pass;
					try {
						loadKey(callback, ks, keyPath, alias, store_pass.toCharArray(), key_pass.toCharArray());
					} catch (Exception e) {
						error(context, keyPath);
					}
				}
			}).
			setNegativeButton(android.R.string.cancel, null).
			show();
	}

	private static void loadKey(SignUtil.LoadKeyCallback callback, KeyStore ks, String keyPath, String alias, char[] storePass, char[] keyPass) throws Exception {
		InputStream i = new FileInputStream(keyPath);
		ks.load(i, storePass);
		if (alias.isEmpty())
			alias = ks.aliases().nextElement();
		PrivateKey prk = (PrivateKey) ks.getKey(alias, keyPass);
		X509Certificate cert = (X509Certificate) ks.getCertificate(alias);
		SignUtil st = new SignUtil();
		st.privateKey = prk;
		st.certificate = cert;
		callback.call(st);
	}

	private static boolean loadKey(SignUtil.LoadKeyCallback callback, String keyPath, String certPath) throws Exception {
		if (!exists(keyPath))
			return false;
		if (!exists(certPath))
			return false;
		InputStream pk = new FileInputStream(keyPath);
		byte[] data = IOUtils.toByteArray(pk);
		pk.close();
		InputStream cer = new FileInputStream(certPath);
		X509Certificate cert = (X509Certificate) CertificateFactory.getInstance("X.509").
			generateCertificate(cer);
		cer.close();
		PKCS8EncodedKeySpec spec = new PKCS8EncodedKeySpec(data);
		PrivateKey prk = KeyFactory.getInstance(cert.getPublicKey().getAlgorithm()).generatePrivate(spec);
		SignUtil st = new SignUtil();
		st.privateKey = prk;
		st.certificate = cert;
		callback.call(st);
		return true;
	}

	private static boolean exists(String path) {
		if (new File(path).exists())
			return true;
		msgId = R.string.signature_file_missing;
		msgObj = path;
		return false;
	}
	private static int msgId;
	private static Object msgObj;
	private PrivateKey privateKey;
	private X509Certificate certificate;
	private SignUtil() {}
	public boolean sign(File in, File out, int minSdk, Logger logger) {
		if (msgId > 0)
			logger.warning(msgId, msgObj);
		ApkSigner.SignerConfig.Builder builder = new ApkSigner.SignerConfig.Builder("CERT", privateKey, ImmutableList.of(certificate));
		ApkSigner.SignerConfig signerConfig = builder.build();
		ApkSigner.Builder builder1 = new ApkSigner.Builder(ImmutableList.of(signerConfig));
		builder1.setInputApk(in);
		builder1.setOutputApk(out);
		builder1.setCreatedBy("Apktool");
		builder1.setMinSdkVersion(minSdk);
		builder1.setV1SigningEnabled(true);
		builder1.setV2SigningEnabled(true);
		ApkSigner signer = builder1.build();
		logger.info(R.string.text, String.format("SignApk:%s", in));
		try {
			signer.sign();
			logger.info(R.string.sign_done, out);
			return true;
		} catch (Exception e) {
			logger.log(Level.WARNING, "签名失败！", e);
			return false;
		}
	}
	public static boolean verify(File apk, Logger logger) {
		ApkVerifier.Builder builder = new ApkVerifier.Builder(apk);
		ApkVerifier verifier = builder.build();
		try {
			ApkVerifier.Result result = verifier.verify();
			logger.info(R.string.text, apk);
			boolean isVerify = result.isVerified();
			if (isVerify) {
				if (result.isVerifiedUsingV1Scheme()) 
					logger.info(R.string.verify_v1_success);
				else
					logger.warning(R.string.verify_v1_fail);
				if (result.isVerifiedUsingV2Scheme())
					logger.info(R.string.verify_v2_success);
				else
					logger.warning(R.string.verify_v2_fail);
				int i = 0;
				List<X509Certificate> signerCertificates = result.getSignerCertificates();
				logger.info(R.string.verify_cert_count,signerCertificates.size());
				for (X509Certificate logCert : signerCertificates) {
                    i++;
                    logCert(logCert, "签名" + i, logger);
                }
			}
			for (ApkVerifier.IssueWithParams warn : result.getWarnings()) {
				logger.warning(R.string.text, warn);
			}
			for (ApkVerifier.IssueWithParams err : result.getErrors()) {
				logger.error(R.string.text, err);
			}
			for (ApkVerifier.Result.V1SchemeSignerInfo signer : result.getV1SchemeIgnoredSigners()) {
				String name = signer.getName();
				for (ApkVerifier.IssueWithParams err:signer.getErrors()) {
					logger.error(R.string.verify_jar, name, err);
				}
				for (ApkVerifier.IssueWithParams err:signer.getWarnings()) {
					logger.warning(R.string.verify_jar, name, err);
				}
			}
			return isVerify;
		} catch (Exception e) {
			logger.log(Level.WARNING, "验证失败！", e);
			return false;
		}
	}
	public static void logCert(X509Certificate x509Certificate, CharSequence charSequence, Logger logger) throws CertificateEncodingException {
        int bitLength;
        Principal subjectDN = x509Certificate.getSubjectDN();
        logger.info(R.string.verify_log_cert, charSequence, subjectDN);
        logEncoded(charSequence, x509Certificate.getEncoded(), logger);
        PublicKey publicKey = x509Certificate.getPublicKey();
        if (publicKey instanceof RSAKey) {
            bitLength = ((RSAKey) publicKey).getModulus().bitLength();
        } else if (publicKey instanceof ECKey) {
            bitLength = ((ECKey) publicKey).getParams().getOrder().bitLength();
        } else {
            if (publicKey instanceof DSAKey) {
                DSAParams params = ((DSAKey) publicKey).getParams();
                if (params != null) {
                    bitLength = params.getP().bitLength();
                }
            }
            bitLength = -1;
        }
        logger.info(R.string.verify_log_keySize, charSequence, bitLength != -1 ? String.valueOf(bitLength) : "Unknown");
        logKey(publicKey, charSequence, logger);
    }
	private static void logEncoded(CharSequence charSequence, byte[] bArr, Logger apktoolLog) {
        log(charSequence + " SHA-256: ", sha256.digest(bArr), apktoolLog);
        log(charSequence + " SHA-1: ", sha1.digest(bArr), apktoolLog);
        log(charSequence + " MD5: ", md5.digest(bArr), apktoolLog);
    }

    private static CharSequence encode(byte[] bArr) {
        StringBuilder stringBuilder = new StringBuilder();
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            stringBuilder.append(String.format(":%02X", bArr[i]));
        }
        stringBuilder.deleteCharAt(0);
        return stringBuilder;
    }
	public static void logKey(Key key, CharSequence charSequence, Logger apktoolLog) {
        String algorithm = key.getAlgorithm();
        apktoolLog.info(R.string.verify_log_key_algorithm, charSequence, algorithm);
        logEncoded(charSequence, key.getEncoded(), apktoolLog);
    }

    private static void log(String str, byte[] bArr, Logger apktoolLog) {
        apktoolLog.info(R.string.text, str);
        CharSequence encode = encode(bArr);
        apktoolLog.warning(R.string.text, encode);
    }
	public interface LoadKeyCallback {
		void call(SignUtil signTool);
	}
	static {
        try {
            sha256 = MessageDigest.getInstance("SHA-256");
            sha1 = MessageDigest.getInstance("SHA-1");
            md5 = MessageDigest.getInstance("MD5");
        } catch (Exception e) {
        }
    }
	private static MessageDigest md5;
    private static MessageDigest sha1;
    private static MessageDigest sha256;
}
