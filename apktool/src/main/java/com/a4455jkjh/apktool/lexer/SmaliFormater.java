package com.a4455jkjh.apktool.lexer;

import com.myopicmobile.textwarrior.common.IndentStringBuilder;

public class SmaliFormater {

	public static void processStringOrChar(IndentStringBuilder sb, String text, boolean isString) {
		char[] chars = text.toCharArray();
		int max = chars.length;
		for (int i = 0; i < max;i++) {
			char c = chars[i];
			if (c == '\\') {
				i += appendChar(sb, chars, i + 1, isString);
				continue;
			}
			sb.append(c);
		}
	}

	private static int appendChar(IndentStringBuilder sb, char[] chars, int i, boolean isString) {
		char c = chars[i];
		if (c == 'u') {
			String text = new String(chars, i + 1, 4);
			int codepoint = Integer.parseInt(text);
			appendChar(sb, (char)codepoint, isString);
			return 5;
		}
		sb.append('\\');
		sb.append(c);
		return 1;
	}

	private static void appendChar(IndentStringBuilder sb, char ch, boolean isString) {
		switch (ch) {
			case '\b':
				sb.append("\\b");
				break;
			case '\f':
				sb.append("\\f");
				break;
			case '\n':
				sb.append("\\n");
				break;
			case '\r':
				sb.append("\\r");
				break;
			case '\t':
				sb.append("\\t");
				break;
			case '\'':
				if (isString)
					sb.append('\'');
				else
					sb.append("\\'");
				break;
			case '"':
				if (isString)
					sb.append("\\\"");
				else
					sb.append('"');
				break;
			case '\\':
				sb.append("\\\\");
				break;
			default:
				sb.append(ch);
				break;
		}
	}

	public static void processWhiteSpace(IndentStringBuilder sb, String text) {
		if (text.contains("\n")) {
			for (char c : text.toCharArray())
				if (c == '\n')
					sb.append(c);
		} else {
			sb.append(" ");
		}
	}
}
