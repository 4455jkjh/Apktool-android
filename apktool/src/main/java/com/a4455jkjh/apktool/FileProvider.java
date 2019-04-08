package com.a4455jkjh.apktool;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class FileProvider extends ContentProvider {
	private static final String[] COLUMNS = {"_display_name","_size"};
	@Override
	public boolean onCreate() {
		return true;
	}

	@Override
	public Cursor query(Uri p1, String[] strArr, String p3, String[] p4, String p5) {
		File file = decodeToFile(p1);
		if (strArr == null) {
            strArr = COLUMNS;
        }
        String[] strArr3 = new String[strArr.length];
        Object[] objArr = new Object[strArr.length];
        int idx = 0;
        for (String str:strArr) {
            if ("_display_name".equals(str)) {
                strArr3[idx] = "_display_name";
                objArr[idx++] = file.getName();
            } else if ("_size".equals(str)) {
                strArr3[idx] = "_size";
                objArr[idx++] = Long.valueOf(file.length());
            }
        }
        String[] copyOf = Arrays.copyOf(strArr3, idx);
        Object[] copyOf2 = Arrays.copyOf(objArr, idx);
        MatrixCursor matrixCursor = new MatrixCursor(copyOf, 1);
        matrixCursor.addRow(copyOf2);
        return matrixCursor;
	}

	@Override
	public String getType(Uri p1) {
		String name = decodeToFile(p1).getName();
		int p = name.lastIndexOf('.');
		if (p == -1)
			return "application/octet-stream";
		return MimeTypeMap.getSingleton().
			getMimeTypeFromExtension(name.substring(p + 1));
	}

	@Override
	public Uri insert(Uri p1, ContentValues p2) {
		throw new UnsupportedOperationException("No external inserts");
	}

	@Override
	public int delete(Uri p1, String p2, String[] p3) {
		decodeToFile(p1).delete();
		return 0;
	}

	@Override
	public ParcelFileDescriptor openFile(Uri uri, String mode) throws FileNotFoundException {
		return ParcelFileDescriptor.open(decodeToFile(uri), modeToMode(mode));
	}

    private static int modeToMode(String str) {
        if ("r".equals(str)) {
            return 268435456;
        }
        if ("w".equals(str) || "wt".equals(str)) {
            return 738197504;
        }
        if ("wa".equals(str)) {
            return 704643072;
        }
        if ("rw".equals(str)) {
            return 939524096;
        }
        if ("rwt".equals(str)) {
            return 1006632960;
        }
        throw new IllegalArgumentException("Invalid mode: " + str);
    }


	@Override
	public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new UnsupportedOperationException("No external updates");
    }
	private static String decode(Uri uri) {
		byte[] buf = Base64.decode(uri.getPath().substring(1), Base64.NO_WRAP);
		return new String(buf);
	}
	private static File decodeToFile(Uri uri) {
		String decode = decode(uri);
		//Log.i("APKTOOL","Path:"+decode);
		return new File(decode);
	}
}
