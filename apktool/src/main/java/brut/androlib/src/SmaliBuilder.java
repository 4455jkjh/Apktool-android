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
package brut.androlib.src;

import brut.androlib.AndrolibException;
import brut.androlib.mod.SmaliMod;
import brut.directory.DirectoryException;
import brut.directory.ExtFile;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Logger;
import org.jf.dexlib2.Opcodes;
import org.jf.dexlib2.iface.ClassDef;
import org.jf.dexlib2.writer.builder.DexBuilder;
import org.jf.dexlib2.writer.io.FileDataStore;
import org.jf.dexlib2.writer.pool.DexPool;

/**
 * @author Ryszard Wiśniewski <brut.alll@gmail.com>
 */
public class SmaliBuilder {
    public static void build(ExtFile smaliDir, File dexFile, int apiLevel) throws AndrolibException {
        new SmaliBuilder(smaliDir, dexFile, apiLevel).build();
    }

    public static void build(ExtFile smaliDir, File dexFile) throws AndrolibException {
        new SmaliBuilder(smaliDir, dexFile, 0).build();
    }

    private SmaliBuilder(ExtFile smaliDir, File dexFile, int apiLevel) {
        mSmaliDir = smaliDir;
        mDexFile = dexFile;
        if (apiLevel > 0) {
			opcodes = Opcodes.forApi(apiLevel);
		} else {
			opcodes = Opcodes.getDefault();
		}
    }

    private void build() throws AndrolibException {
        try {
            DexPool pool = new DexPool(opcodes);
            for (String fileName : mSmaliDir.getDirectory().getFiles(true)) {
                buildFile(fileName, pool);
            }
            pool.writeTo(new FileDataStore(new File(mDexFile.getAbsolutePath())));
        } catch (IOException | DirectoryException ex) {
            throw new AndrolibException(ex);
        }
    }

    private void buildFile(String fileName, DexPool pool)
	throws AndrolibException, IOException {
        File inFile = new File(mSmaliDir, fileName);
        InputStream inStream = new FileInputStream(inFile);

        if (fileName.endsWith(".smali")) {
            try {
                ClassDef cls = SmaliMod.assembleSmaliFile(inFile, opcodes, false, false);
				if (cls != null)
					pool.internClass(cls);
            } catch (IOException ex) {
                throw new AndrolibException(ex);
            }
        } else {
            LOGGER.warning("Unknown file type, ignoring: " + inFile);
        }
        inStream.close();
    }

    private final ExtFile mSmaliDir;
    private final File mDexFile;
    private Opcodes opcodes = null;

    private final static Logger LOGGER = Logger.getLogger(SmaliBuilder.class.getName());
}
