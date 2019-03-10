/*
 * Copyright (c) 2013 Tah Wei Hoon.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License Version 2.0,
 * with full text available at http://www.apache.org/licenses/LICENSE-2.0.html
 *
 * This software is provided "as is". Use at your own risk.
 */
package com.myopicmobile.textwarrior.common;

/**
 * Singleton class containing the symbols and operators of the Java language
 */
public class LanguageJava extends Language{
	
	private final static String[] keywords = {
		"void", "boolean", "byte", "char", "short", "int", "long", "float", "double", "strictfp",
		"import", "package", "new", "class", "interface", "extends", "implements", "enum",
		"public", "private", "protected", "static", "abstract", "final", "native", "volatile",
		"assert", "try", "throw", "throws", "catch", "finally", "instanceof", "super", "this",
		"if", "else", "for", "do", "while", "switch", "case", "default",
		"continue", "break", "return", "synchronized", "transient",
		"true", "false", "null"
		};

	public LanguageJava(){
		super.setKeywords(keywords);
	}
	
	/**
	 * Java has no preprocessors. Override base class implementation
	 */
	public boolean isLineAStart(char c){
		return false;
	}
}
