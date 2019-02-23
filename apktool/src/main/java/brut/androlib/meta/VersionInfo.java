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
import org.json.JSONObject;
import org.json.JSONException;

public class VersionInfo {
    public String versionCode;
    public String versionName;

	public static void save(JSONObject json, VersionInfo versionInfo) throws JSONException {
		if(versionInfo==null){
			json.put("VersionInfo", JSONObject.NULL);
			return;
		}
		versionInfo.save(json);
	}

	public static VersionInfo load(JSONObject json) throws JSONException {
		VersionInfo v = new VersionInfo();
		if (!json.isNull("VersionInfo")) {
			JSONObject ver = json.getJSONObject("VersionInfo");
			v.versionCode = MetaInfo.getString(ver, "versionCode");
			v.versionName = MetaInfo.getString(ver, "versionName");
		}
		return v;
	}


	public void save(JSONObject json) throws JSONException {
		JSONObject ver = new JSONObject();
		MetaInfo.putString(ver, "versionCode", versionCode);
		MetaInfo.putString(ver, "versionName", versionName);
		json.put("VersionInfo", ver);
	}
}
