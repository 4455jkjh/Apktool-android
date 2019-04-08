package com.a4455jkjh.apktool.lexer;
import com.a4455jkjh.apktool.service.FileItem;
import com.myopicmobile.textwarrior.common.LexTask;
import com.myopicmobile.textwarrior.common.NonProgLexTask;
import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.Vocabulary;

public class LexerUtil {

	public static boolean isText(String type) {
		return type.equals("json") ||
			type.equals("smali") ||
			type.equals("m") ||
			type.equals("mm")||
			type.equals("js");
	}
	public static String[] getKeywords(Vocabulary tokens) {
		String keywordPattern = "'[a-z_]+'";
		int len = tokens.getMaxTokenType();
		List<String> keywords = new ArrayList<>(len);
		for (int i = 0; i < len; i++) {
			String name = tokens.getLiteralName(i);
			if (name != null && name.matches(keywordPattern))
				keywords.add(name.substring(1, name.length() - 1));
		}
		String[] keywordsArr = new String[keywords.size()];
		return keywords.toArray(keywordsArr);
		//return keywordsArr;
	}
	public static LexTask createLexer(String name, FileItem item) {
		if (name.endsWith(".java"))
			return new JavaLexTask();
		if (name.endsWith(".smali")) {
			return new SmaliLexTask(item);
		}if (name.endsWith(".c") ||
			 name.endsWith(".h") ||
			 name.endsWith(".cc") ||
			 name.endsWith(".cpp") ||
			 name.endsWith(".cxx"))
			return new CppLexTask();
		if (name.endsWith(".xml")||
		name.endsWith(".html"))
			return new XmlLexTask(item);
		if (name.endsWith(".json"))
			return new JsonLexTask();
		if (name.endsWith(".m") ||
			name.endsWith(".mm"))
			return new ObjcLexTask();
		if(name.endsWith(".css"))
			return new CssLexTask();
		if(name.endsWith(".js"))
			return new JavascriptLexTask();
		return NonProgLexTask.instance;
	}
}
