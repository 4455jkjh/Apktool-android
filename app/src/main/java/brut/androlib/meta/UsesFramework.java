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

import java.util.List;
import org.json.JSONObject;
import org.json.JSONException;
import org.json.JSONArray;
import java.util.LinkedList;

public class UsesFramework {
    public List<Integer> ids;
    public String tag;

	public static void save(JSONObject json, UsesFramework usesFramework) throws JSONException {
		if(usesFramework==null){
			json.put("UsesFramework",JSONObject.NULL);
			return;
		}
		usesFramework.save(json);
	}

	public static UsesFramework load(JSONObject json) throws JSONException {
		UsesFramework f = new UsesFramework();
		if (!json.isNull("UsesFramework")) {
			JSONObject framework = json.getJSONObject("UsesFramework");
			f.tag = framework.getString("tag");
			JSONArray arr = framework.getJSONArray("ids");
			List<Integer> ids = new LinkedList<>();
			int s = arr.length();
			for (int i=0;i < s;i++)
				ids.add(arr.getInt(i));
			f.ids = ids;
		}
		return f;
	}


	public void save(JSONObject json) throws JSONException {
		JSONObject framework = new JSONObject();
		MetaInfo.putList(framework, ids, "ids");
		MetaInfo.putString(framework, "tag", tag);
		json.put("UsesFramework", framework);
	}
}
