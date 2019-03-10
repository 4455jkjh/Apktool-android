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
package brut.util;

import brut.common.BrutException;
import brut.util.Logger;
import com.a4455jkjh.apktool.R;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.IOUtils;

/**
 * @author Ryszard Wiśniewski <brut.alll@gmail.com>
 */
public class OS {

    public static void rmdir(File dir) {
        if (! dir.exists()) {
            return;
        }
        File[] files = dir.listFiles();
        for (int i = 0; i < files.length; i++) {
            File file = files[i];
            if (file.isDirectory()) {
                rmdir(file);
            } else {
                file.delete();
            }
        }
        dir.delete();
    }

    public static void rmfile(String file) {
    	File del = new File(file);
    	del.delete();
    }

    public static void rmdir(String dir) throws BrutException {
        rmdir(new File(dir));
    }

    public static void cpdir(File src, File dest) throws BrutException {
        dest.mkdirs();
        File[] files = src.listFiles();
        for (int i = 0; i < files.length; i++) {
            File file = files[i];
            File destFile = new File(dest.getPath() + File.separatorChar
									 + file.getName());
            if (file.isDirectory()) {
                cpdir(file, destFile);
                continue;
            }
            try {
                InputStream in = new FileInputStream(file);
                OutputStream out = new FileOutputStream(destFile);
                IOUtils.copy(in, out);
                in.close();
                out.close();
            } catch (IOException ex) {
                throw new BrutException("Could not copy file: " + file, ex);
            }
        }
    }

    public static void cpdir(String src, String dest) throws BrutException {
        cpdir(new File(src), new File(dest));
    }

    public static void exec(List<String> cmd, Logger LOGGER) throws BrutException {
        Process ps = null;
        int exitValue = -99;
        try {
            ProcessBuilder builder = new ProcessBuilder(cmd);
            ps = builder.start();
            new StreamForwarder(ps.getErrorStream(), "ERROR", LOGGER).start();
            new StreamForwarder(ps.getInputStream(), "OUTPUT", LOGGER).start();
            exitValue = ps.waitFor();
            if (exitValue != 0)
                throw new BrutException("could not exec (exit code = " + exitValue + "): " + cmd);
        } catch (IOException ex) {
            throw new BrutException("could not exec: " + cmd, ex);
        } catch (InterruptedException ex) {
            throw new BrutException("could not exec : " + cmd, ex);
        }
    }

    public static String execAndReturn(String[] cmd) {
        ExecutorService executor = Executors.newCachedThreadPool();
        try {
            ProcessBuilder builder = new ProcessBuilder(cmd);
            builder.redirectErrorStream(true);

            Process process = builder.start();
            StreamCollector collector = new StreamCollector(process.getInputStream());
            executor.execute(collector);

            process.waitFor();
            if (! executor.awaitTermination(15, TimeUnit.SECONDS)) {
                executor.shutdownNow();
                if (! executor.awaitTermination(5, TimeUnit.SECONDS)) {
                    System.err.println("Stream collector did not terminate.");
                }
            }
            return collector.get();
        } catch (IOException | InterruptedException e) {
            return null;
        }
    }

    public static File createTempDirectory() throws BrutException {
        try {
            File tmp = File.createTempFile("BRUT", null);
            tmp.deleteOnExit();
            if (!tmp.delete()) {
                throw new BrutException("Could not delete tmp file: " + tmp.getAbsolutePath());
            }
            if (!tmp.mkdir()) {
                throw new BrutException("Could not create tmp dir: " + tmp.getAbsolutePath());
            }
            return tmp;
        } catch (IOException ex) {
            throw new BrutException("Could not create tmp dir", ex);
        }
    }

    static class StreamForwarder extends Thread {


        StreamForwarder(InputStream is, String type, Logger LOGGER) {
            mIn = is;
            mType = type;
			this.LOGGER = LOGGER;
        }

        @Override
        public void run() {
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(mIn));
                String line;
                while ((line = br.readLine()) != null) {
                    if (mType.equals("OUTPUT")) {
                        LOGGER.info(R.string.text, line);
                    } else {
                        LOGGER.warning(R.string.text, line);
                    }
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }

        private final InputStream mIn;
        private final String mType;
		private final Logger LOGGER;
    }

    static class StreamCollector implements Runnable {
        private final StringBuffer buffer = new StringBuffer();
        private final InputStream inputStream;

        public StreamCollector(InputStream inputStream) {
            super();
            this.inputStream = inputStream;
        }

        @Override
        public void run() {
            String line;
            try {
				BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
                while ((line = reader.readLine()) != null) {
                    buffer.append(line).append('\n');
                }
				reader.close();
            } catch (IOException ignored) {}
        }

        public String get() {
            return buffer.toString();
        }
    }
}
