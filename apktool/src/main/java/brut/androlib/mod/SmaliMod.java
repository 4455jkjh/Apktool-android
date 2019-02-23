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
package brut.androlib.mod;

import com.a4455jkjh.lexer.SmaliLexer;
import com.a4455jkjh.lexer.SmaliParser;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Token;
import org.apache.commons.io.IOUtils;
import org.jf.dexlib2.writer.builder.DexBuilder;
import org.jf.dexlib2.Opcodes;
import org.jf.dexlib2.iface.ClassDef;
import com.a4455jkjh.smali.SmaliBuilder;

/**
 * @author Ryszard Wiśniewski <brut.alll@gmail.com>
 */
public class SmaliMod {

    public static ClassDef assembleSmaliFile(String smali, Opcodes opcodes, boolean verboseErrors,
                                            boolean printTokens, File smaliFile) throws IOException, RuntimeException, RecognitionException {

        InputStream is = new ByteArrayInputStream(smali.getBytes());
        return assembleSmaliFile(is, opcodes, verboseErrors, printTokens, smaliFile);
    }

    public static ClassDef assembleSmaliFile(InputStream is, Opcodes opcodes, boolean verboseErrors,
                                            boolean printTokens, File smaliFile) throws IOException, RecognitionException {

        // copy our filestream into a tmp file, so we don't overwrite
        File tmp = File.createTempFile("BRUT",".bak");
        tmp.deleteOnExit();

        OutputStream os = new FileOutputStream(tmp);
        IOUtils.copy(is, os);
        os.close();

        return assembleSmaliFile(tmp, opcodes, verboseErrors, printTokens);
    }

    public static ClassDef assembleSmaliFile(File smaliFile, Opcodes opcodes, boolean verboseErrors,
                                            boolean printTokens) throws IOException, RecognitionException {

        CommonTokenStream tokens;
        Lexer lexer;

        CharStream input = CharStreams.fromFile(smaliFile);

        lexer = new SmaliLexer(input);
        tokens = new CommonTokenStream(lexer);

        if (printTokens) {
            tokens.getTokens();

            for (int i=0; i<tokens.size(); i++) {
                Token token = tokens.get(i);
                if (token.getChannel() == Token.HIDDEN_CHANNEL) {
                    continue;
                }

                System.out.println(SmaliLexer.VOCABULARY.getDisplayName(token.getType()) + ": " + token.getText());
            }
        }

        SmaliParser parser = new SmaliParser(tokens);

        SmaliParser.Smali_fileContext result = parser.smali_file();

        if (parser.getNumberOfSyntaxErrors() > 0) {
            return null;
        }

        ClassDef cls = SmaliBuilder.build(result, tokens);

        return cls;
    }
}
