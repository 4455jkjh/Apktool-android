/*
 * Copyright (c) 2013 Tah Wei Hoon.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Apache License Version 2.0,
 * with full text available at http://www.apache.org/licenses/LICENSE-2.0.html
 *
 * This software is provided "as is". Use at your own risk.
 */

package com.myopicmobile.textwarrior.common;



public abstract class ColorScheme {
	public static enum Colorable {
		FOREGROUND(0xFF000000, 0xFFFFFFFF),
		BACKGROUND(0xFFFFFFFF, 0xFF000000),
		SELECTION_FOREGROUND(0xFFFFFFFF, 0xFFFFFFFF),
		SELECTION_BACKGROUND(0xff0099cc,0xff0099cc),
		CARET_BACKGROUND(0xff0099cc, 0xff0099cc),
		CARET_DISABLED(0xFF000000, 0xFFFFFFFF),
		LINE_HIGHLIGHT(0xfff5f5f5, 0xff111c22),
		NON_PRINTING_GLYPH(0xffd0d0d0, 0xff6ab0e2),
		COMMENT(0xff009b00, 0xff50bb50),
		KEYWORD(0xff2c82c8, 0xff6ab0e2),
		NAME(0xff000000, 0xffeeeeee),
		LITERAL(0xffbc0000, 0xffff8e8e),
		OPERATOR(0xff007c1f, 0xff8ab0e2),
		SEPARATOR(0xff0096ff, 0xff8ab0e2),
		PACKAGE(0xff5d5d5d, 0xffaaaaaa),
		TYPE(0xff0096ff, 0xff99ccee),
		ERROR(0xffff0000, 0xffff0000);

		private Colorable(int light, int dark)
		{
			this.light = light;
			this.dark = dark;
		};
		final int light,dark;
	}


	public int getColor(Colorable colorable) {
		if (isDark())
			return colorable.dark;
		return colorable.light;
	}

	// Currently, color scheme is tightly coupled with semantics of the token types
	public int getTokenColor(int tokenType) {
		Colorable element;
		switch (tokenType) {
			case Lexer.NORMAL:
				element = Colorable.FOREGROUND;
				break;
			case Lexer.KEYWORD:
				element = Colorable.KEYWORD;
				break;
			case Lexer.NAME:
				element = Colorable.NAME;
				break;
			case Lexer.COMMENT: 
				element = Colorable.COMMENT;
				break;
			case Lexer.SEPARATOR:
				element = Colorable.SEPARATOR;
				break;
			case Lexer.LITERAL:
				element = Colorable.LITERAL;
				break;
			case Lexer.OPERATOR:
				element = Colorable.OPERATOR;
				break;
			case Lexer.UNKNOWN:
				element = Colorable.ERROR;
				break;
			case Lexer.PACKAGE:
				element = Colorable.PACKAGE;
				break;
			default:
				TextWarriorException.fail("Invalid token type");
				element = Colorable.FOREGROUND;
				break;
		}
		return getColor(element);
	}

	/**
	 * Whether this color scheme uses a dark background, like black or dark grey.
	 */
	public abstract boolean isDark();
}
