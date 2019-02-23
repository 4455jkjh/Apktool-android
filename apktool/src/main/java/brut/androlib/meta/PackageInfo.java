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

public class PackageInfo {
    public String forcedPackageId;
    public String renameManifestPackage;

	public static PackageInfo load(JSONObject json) throws JSONException {
		if (json.isNull("PackageInfo"))
			return null;
		JSONObject pkg = json.getJSONObject("PackageInfo");
		PackageInfo p = new PackageInfo();
		p.forcedPackageId = MetaInfo.getString(pkg, "forcedPackageId");
		p.renameManifestPackage = MetaInfo.getString(pkg, "renameManifestPackage");
		return p;
	}


	public void save(JSONObject json) throws JSONException {
		JSONObject pkg = new JSONObject();
		MetaInfo.putString(pkg, "forcedPackageId", forcedPackageId);
		MetaInfo.putString(pkg, "renameManifestPackage", renameManifestPackage);
		json.put("PackageInfo", pkg);
	}
}
