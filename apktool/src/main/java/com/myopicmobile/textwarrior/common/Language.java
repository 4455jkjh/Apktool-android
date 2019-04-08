/*
 * Copyright (c) 2013 Tah Wei Hoon.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License Version 2.0,
 * with full text available at http://www.apache.org/licenses/LICENSE-2.0.html
 *
 * This software is provided "as is". Use at your own risk.
 */
package com.myopicmobile.textwarrior.common;

import java.util.HashMap;
import java.util.*;

/**
 * Base class for programming language syntax.
 * By default, C-like symbols and operators are included, but not keywords.
 */
public abstract class Language
{
	public final static char EOF = '\uFFFF';
	public final static char NULL_CHAR = '\u0000';
	public final static char NEWLINE = '\n';
	public final static char BACKSPACE = '\b';
	public final static char TAB = '\t';
	public final static String GLYPH_NEWLINE = "\u21b5";
	public final static String GLYPH_SPACE = "\u00b7";
	public final static String GLYPH_TAB = "\u00bb";


	private final static char[] BASIC_C_OPERATORS = {
		'(', ')', '{', '}', '.', ',', ';', '=', '+', '-',
		'/', '*', '&', '!', '|', ':', '[', ']', '<', '>',
		'?', '~', '%', '^'
	};
	private String[] _keyword;

	public CharSequence complete(ArrayList<String> buf, CharSequence constraint) {
		String word = constraint.toString().toLowerCase();
		for(String k : _keyword){
			if(k.toLowerCase().startsWith(word))
				buf.add(k);
		}
		return constraint;
	}
	public void setKeywords(String[] keywords)
	{
		_keyword = keywords;
	}

	public boolean isWhitespace(char c)
	{
		return (c == ' ' || c == '\n' || c == '\t' ||
			c == '\r' || c == '\f' || c == EOF);
	}

	public boolean isSentenceTerminator(char c)
	{
		return (c == '.');
	}

	/**
	 * Derived classes that do not do represent C-like programming languages
	 * should return false; otherwise return true
	 */
	public boolean isProgLang()
	{
		return true;
	}

}
