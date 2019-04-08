package com.myopicmobile.textwarrior.common;

import java.util.List;

public class NonProgLexTask extends LexTask {

	@Override
	protected void tokenize(List<Pair<ColorScheme.Colorable>> _tokens, String text) {
		_tokens.add(new Pair<ColorScheme.Colorable>(0, ColorScheme.Colorable.NAME));
	}

	public static NonProgLexTask instance = new NonProgLexTask();
	private NonProgLexTask() {
		super(LanguageNonProg.getInstance());
	}

}
