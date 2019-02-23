package org.antlr.v4.runtime;
import java.nio.charset.Charset;

public class StandardCharsets
{
	public static final Charset ISO_8859_1;
	public static final Charset UTF_8;
	static{
		ISO_8859_1 = Charset.forName("ISO-8859-1");
		UTF_8 = Charset.forName("UTF-8");
	}
}
