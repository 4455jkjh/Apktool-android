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
import brut.directory.DirectoryException;
import brut.directory.ExtFile;
import brut.util.Logger;
import com.a4455jkjh.apktool.R;
import com.a4455jkjh.smali.ClassMaker;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import org.jf.dexlib2.Opcodes;
import org.jf.dexlib2.iface.ClassDef;
import org.jf.dexlib2.writer.io.FileDataStore;
import org.jf.dexlib2.writer.pool.DexPool;

/**
 * @author Ryszard Wiśniewski <brut.alll@gmail.com>
 */
public class SmaliBuilder {
    public static void build(ExtFile smaliDir, File dexFile, int apiLevel, Logger l) throws AndrolibException {
        new SmaliBuilder(smaliDir, dexFile, apiLevel, l).build();
    }

    public static void build(ExtFile smaliDir, File dexFile, Logger l) throws AndrolibException {
        new SmaliBuilder(smaliDir, dexFile, 0, l).build();
    }

    private SmaliBuilder(ExtFile smaliDir, File dexFile, int apiLevel, Logger l) {
		LOGGER = l;
        mSmaliDir = smaliDir;
        mDexFile = dexFile;
        mApiLevel = apiLevel;
		mDexDir = getDexDir(dexFile);
    }

	private File getDexDir(File dexFile) {
		File dir =new File(dexFile.getParentFile().getParentFile(), "dex");
		return new File(dir, dexFile.getName());
	}

    private void build() throws AndrolibException {
        try {
			final Opcodes codes;
            if (mApiLevel > 0) {
                codes = Opcodes.forApi(mApiLevel);
            } else {
                codes = Opcodes.getDefault();
            }
			DexPool pool = new DexPool(codes);
			List<Future<ClassDef>> tasks = new LinkedList<>();
            for (final String fileName : mSmaliDir.getDirectory().getFiles(true))
				tasks.add(threads.submit(new Callable<ClassDef>(){
								  @Override
								  public ClassDef call() throws Exception {
									  return buildFile(fileName, codes);
								  }
							  }));
			boolean fail = false;
			for (Future<ClassDef> task : tasks) {
				if(fail)
					task.cancel(false);
				else if (!get(task, pool))
					fail = true;
			}
			if (fail) {
				throw new AndrolibException("smali failed!");
			}
            pool.writeTo(new FileDataStore(new File(mDexFile.getAbsolutePath())));
        } catch (IOException | DirectoryException ex) {
            throw new AndrolibException(ex);
        }
    }

	private boolean get(Future<ClassDef> task, DexPool pool) {
		for (;;)
			try {
				ClassDef cls = task.get();
				if (cls != null)
					pool.internClass(cls);
				return true;
			} catch (InterruptedException e) {
				continue;
			} catch (ExecutionException e) {
				return false;
			}
	}

    private ClassDef buildFile(String fileName, Opcodes codes)
	throws AndrolibException, IOException {
        File inFile = new File(mSmaliDir, fileName);

        if (fileName.endsWith(".smali")) {
			ClassDef cls = ClassMaker.make(inFile.getAbsolutePath(), codes);
			if (cls == null) {
				throw new AndrolibException("Parse '" + inFile + "' field!");
			}
			return cls;
		} else {
            LOGGER.warning(R.string.text, "Unknown file type, ignoring: " + inFile);
        }
		return null;
    }

    private final ExtFile mSmaliDir;
    private final File mDexFile;
	private final File mDexDir;
    private int mApiLevel = 0;

    private final Logger LOGGER;
	private static ThreadPoolExecutor threads;
	static{
		;
		threads = (ThreadPoolExecutor) Executors.newFixedThreadPool(4);
	}
}
