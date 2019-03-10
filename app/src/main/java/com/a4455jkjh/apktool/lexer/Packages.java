package com.a4455jkjh.apktool.lexer;

import android.content.res.AssetManager;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.IOUtils;
import org.jf.dexlib2.AccessFlags;
import org.jf.dexlib2.Opcodes;
import org.jf.dexlib2.dexbacked.DexBackedDexFile;
import org.jf.dexlib2.iface.ClassDef;
import org.jf.dexlib2.iface.DexFile;
import org.jf.dexlib2.iface.Field;
import org.jf.dexlib2.iface.Method;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Packages {
	private static final Map<String,Member> baseTypes;
	private static final Map<String,Member> types;
	private static final Map<String,Member> allTypes;

	public static boolean load(File cacheDir, String projectPath) {
		String t = String.format("%d.json", projectPath.hashCode());
		File c = new File(cacheDir, t);
		if (c.exists()) {
			try {
				InputStream i = new FileInputStream(c);
				String data = IOUtils.toString(i);
				JSONObject json = new JSONObject(data);
				Iterator<String> keys = json.keys();
				while (keys.hasNext()) {
					String key = keys.next();
					Member m = new Member(json.getJSONObject(key));
					types.put(key, m);
				}
				done();
				return true;
			} catch (Exception e) {}
		}
		return false;
	}
	public static void save(File cacheDir, String projectPath) {
		String t = String.format("%d.json", projectPath.hashCode());
		File c = new File(cacheDir, t);
		try {
			OutputStream o = new FileOutputStream(c);
			JSONObject json = new JSONObject();
			for (Map.Entry<String, Member> entry : types.entrySet()) {
				json.put(entry.getKey(), entry.getValue().toJson());
			}
			String data = json.toString(1);
			IOUtils.write(data, o);
			o.close();
		} catch (Exception e) {
			Log.i("APKTOOL", e.getMessage());
		}
	}
	static{
		baseTypes = new LinkedHashMap<>();
		types = new LinkedHashMap<>();
		allTypes = new LinkedHashMap<>();
	}
	private Packages() {}
	public static void loadDex(AssetManager assets) throws IOException {
		InputStream dex = assets.open("android.dex");
		byte[] data = IOUtils.toByteArray(dex);
		DexBackedDexFile dexFile = new DexBackedDexFile(Opcodes.forApi(26), data);
		Packages.setBaseDex(dexFile);
	}

	public static synchronized void addClass(String type, Member m, boolean edit) {
		if (edit)
			allTypes.put(type, m);
		else
			types.put(type, m);
	}
	private static void addClass(ClassDef cls, Map<String,Member> types) {
		String type = cls.getType();
		List<String> members = new LinkedList<>();
		int privateFlag = AccessFlags.PRIVATE.getValue();
		StringBuilder sb = new StringBuilder(100);
		for (Field field : cls.getFields()) {
			if ((field.getAccessFlags() & privateFlag) > 0)
				continue;
			sb.append(field.getName());
			sb.append(':');
			sb.append(field.getType());
			members.add(sb.toString());
			sb.setLength(0);
		}
		for (Method method : cls.getMethods()) {
			if ((method.getAccessFlags() & privateFlag) > 0)
				continue;
			if (method.getName().equals("<clinit>"))
				continue;
			sb.append(method.getName());
			sb.append('(');
			for (CharSequence s : method.getParameterTypes())
				sb.append(s);
			sb.append(')');
			sb.append(method.getReturnType());
			members.add(sb.toString());
			sb.setLength(0);
		}
		Member m = new Member();
		m.superType = cls.getSuperclass();
		m.impls = cls.getInterfaces();
		m.members = members;
		types.put(type, m);
	}
	public static void setBaseDex(DexFile dex) {
		baseTypes.clear();
		for (ClassDef cls : dex.getClasses())
			addClass(cls, baseTypes);
	}
	public static void reset() {
		types.clear();
		allTypes.clear();
	}

	private static void findParent(Member m, Map<String,Member> types, List<String> members) {
		findParent(m.superType, members, types);
		for (String impl : m.impls)
			findParent(impl, members, types);
		Collections.sort(members, memberComparator);
	}

	private static void findParent(String superType, List<String> members, Map<String,Member> types) {
		if (superType == null)
			return;
		Member m = get(superType);
		if (m == null)
			return;
		findParent(m, types, members);
		for (String mm : m.members) {
			if (members.contains(mm))
				continue;
			if (mm.startsWith("<init>("))
				continue;
			members.add(mm);
		}
	}
	private static Comparator<String> memberComparator = new Comparator<String>(){
		@Override
		public int compare(String p1, String p2) {
			if (p1.contains(":") && p2.contains("("))
				return -1;
			if (p1.contains("(") && p2.contains(":"))
				return 1;
			return p1.toLowerCase().compareTo(
				p2.toLowerCase());
		}
	};
	public static Iterable<String> getTypes() {
		return allTypes.keySet();
	}
	public static List<String> getMembers(String type) {
		if (type.startsWith("["))
			type = "Ljava/lang/Object;";
		synchronized (allTypes) {
			Member m = get(type);
			if (m == null)
				return EMPTY;
			List<String> ms = new ArrayList<String>(m.members);
			findParent(m, types, ms);
			return ms;
		}
	}
	public static void done() {
		Map<String,Member> allTypes = Packages.allTypes;
		synchronized (allTypes) {
			allTypes.clear();
			allTypes.putAll(baseTypes);
			allTypes.putAll(types);
		}
	}
	private static Packages.Member get(String type) {
		return allTypes.get(type);
	}
	public static boolean isEmpty() {
		return allTypes.size() <= 1;
	}
	protected static String getString(JSONObject obj, String key) throws JSONException {
		if (obj.isNull(key))
			return null;
		return obj.getString(key);
	}
	private static final List<String> EMPTY = new ArrayList<>(0);
	public static class Member {
		public String superType;
		public List<String> members;
		public List<String> impls;
		public Member() {}
		Member(JSONObject obj) throws JSONException {
			superType = getString(obj, "super");
			JSONArray mem = obj.getJSONArray("members");
			members = new LinkedList<>();
			for (int i = 0; i < mem.length();i++) {
				members.add(mem.getString(i));
			}
			JSONArray impl = obj.getJSONArray("impls");
			impls = new LinkedList<>();
			for (int i = 0; i < impl.length();i++) {
				impls.add(impl.getString(i));
			}
		}

		public JSONObject toJson() throws JSONException {
			JSONObject obj = new JSONObject();
			obj.put("super", superType);
			obj.put("members", new JSONArray(members));
			obj.put("impls", new JSONArray(impls));
			return obj;
		}

	}
}
