/**
 *  Copyright (C) 2018 Ryszard Wiśniewski <brut.alll@gmail.com>
 *  Copyright (C) 2018 Connor Tumbleson <connor.tumbleson@gmail.com>
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package brut.androlib.meta;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.commons.io.IOUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.util.LinkedList;

public class MetaInfo {
    public String version;
    public String apkFileName;
    public boolean isFrameworkApk;
    public UsesFramework usesFramework;
    public Map<String, String> sdkInfo;
    public PackageInfo packageInfo;
    public VersionInfo versionInfo;
    public boolean compressionType;
    public boolean sharedLibrary;
    public boolean sparseResources;
    public Map<String, String> unknownFiles;
    public Collection<String> doNotCompress;

    public void save(Writer output) throws JSONException, IOException {
		JSONObject json = new JSONObject();
		putString(json, "version", version);
		putString(json, "apkFileName", apkFileName);
		json.put("isFrameworkApk", isFrameworkApk);
		json.put("compressionType", compressionType);
		json.put("sharedLibrary", sharedLibrary);
		json.put("sparseResources", sparseResources);
		putMap(json, sdkInfo, "sdkInfo");
		putMap(json, unknownFiles, "unknownFiles");
		putList(json, doNotCompress, "doNotCompress");
		UsesFramework.save(json, usesFramework);
		if (packageInfo == null)
			json.put("PackageInfo", JSONObject.NULL);
		else
			packageInfo.save(json);
		VersionInfo.save(json, versionInfo);
		output.write(json.toString(2));
    }
	public static void putString(JSONObject json, String name, String val) throws JSONException {
		json.put(name, val == null ?JSONObject.NULL: val);
	}
	public static String getString(JSONObject json, String key) throws JSONException {
		String s;
		if (json.isNull(key))
			s = null;
		else
			s = json.getString(key);
		return s;
	}

	private void load(JSONObject json) throws JSONException {
		version = getString(json, "version");
		apkFileName = getString(json, "apkFileName");
		isFrameworkApk = json.getBoolean("isFrameworkApk");
		compressionType = json.getBoolean("compressionType");
		sparseResources = json.getBoolean("sparseResources");
		sdkInfo = readMap(json, "sdkInfo");
		unknownFiles = readMap(json, "unknownFiles");
		doNotCompress = readList(json, "doNotCompress");
		usesFramework = UsesFramework.load(json);
		packageInfo = PackageInfo.load(json);
		versionInfo = VersionInfo.load(json);
	}

	private List<String> readList(JSONObject json, String name) throws JSONException {
		if (json.isNull(name))
			return null;
		JSONArray arr = json.getJSONArray(name);
		List<String> list = new LinkedList<>();
		int l = arr.length();
		for (int i = 0; i < l; i++)
			list.add(arr.getString(i));
		return list;
	}

	public static Map<String, String> readMap(JSONObject json, String name) throws JSONException {
		if (json.isNull(name))
			return null;
		JSONObject map = json.getJSONObject(name);
		Map<String, String> val = new HashMap<>();
		Iterator<String> keys = map.keys();
		while (keys.hasNext()) {
			String key = keys.next();
			val.put(key, map.getString(key));
		}
		return val;
	}

	public static void putList(JSONObject json, Collection list, String name) throws JSONException {
		if (list == null) {
			json.put(name, JSONObject.NULL);
			return;
		}
		JSONArray array = new JSONArray(list);
		json.put(name, array);
	}

	private static void putMap(JSONObject json, Map<String,String> map, String name) throws JSONException {
		if (map == null) {
			json.put(name, JSONObject.NULL);
			return;
		}
		JSONObject sdk = new JSONObject(map);
		json.put(name, sdk);
	}

    public void save(File file) throws IOException, JSONException {
		FileOutputStream fos = new FileOutputStream(file);
		OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
		Writer writer = new BufferedWriter(outputStreamWriter);
		save(writer);
        writer.close();
		outputStreamWriter.close();
		fos.close();
    }

    public static MetaInfo load(InputStream is) throws IOException, JSONException {
		String content = IOUtils.toString(is);
		JSONObject json = new JSONObject(content);
		MetaInfo meta = new MetaInfo();
		meta.load(json);
        return meta;
    }

    public static MetaInfo load(File file) throws IOException, JSONException {
        try (
		InputStream fis = new FileInputStream(file)
        ) {
            return load(fis);
        }
    }
}
