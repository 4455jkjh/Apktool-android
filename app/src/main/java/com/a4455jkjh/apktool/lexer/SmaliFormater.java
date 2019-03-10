package com.a4455jkjh.apktool.lexer;

import com.myopicmobile.textwarrior.common.IndentStringBuilder;

public class SmaliFormater {

	public static void processChar(IndentStringBuilder sb, String text) {
		sb.append('\'');
		char c = text.charAt(1);
		switch (c) {
			case '\n':
				sb.append('\\');
				c = 'n';
				break;
			case '\b':
				sb.append('\\');
				c = 'b';
				break;
			case '\r':
				sb.append('\\');
				c = 'r';
				break;
			case '\t':
				sb.append('\\');
				c = 't';
				break;
			case '\f':
				sb.append('\\');
				c = 'f';
				break;
			case '\"':
				sb.append('\\');
				c = '"';
				break;
			case '\'':
				sb.append('\\');
				c = '\'';
				break;
			case '\\':
				sb.append('\\');
				c = '\\';
				break;
		}
		sb.append(c);
		sb.append('\'');
	}

	public static void processString(IndentStringBuilder sb, String text) {
		sb.append('"');
		for (int i = 1; i < text.length() - 1;i++) {
			char c = text.charAt(i);
			switch (c) {
				case '\n':
					sb.append('\\');
					c = 'n';
					break;
				case '\b':
					sb.append('\\');
					c = 'b';
					break;
				case '\r':
					sb.append('\\');
					c = 'r';
					break;
				case '\t':
					sb.append('\\');
					c = 't';
					break;
				case '\f':
					sb.append('\\');
					c = 'f';
					break;
				case '\"':
					sb.append('\\');
					c = '"';
					break;
				case '\'':
					sb.append('\\');
					c = '\'';
					break;
				case '\\':
					sb.append('\\');
					c = '\\';
					break;
			}
			sb.append(c);
		}
		sb.append('"');
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
