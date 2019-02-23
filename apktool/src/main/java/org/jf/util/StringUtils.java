/*
 * Copyright 2012, Google Inc.
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are
 * met:
 *
 *     * Redistributions of source code must retain the above copyright
 * notice, this list of conditions and the following disclaimer.
 *     * Redistributions in binary form must reproduce the above
 * copyright notice, this list of conditions and the following disclaimer
 * in the documentation and/or other materials provided with the
 * distribution.
 *     * Neither the name of Google Inc. nor the names of its
 * contributors may be used to endorse or promote products derived from
 * this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR
 * A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT
 * OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 * THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */

package org.jf.util;

import java.io.IOException;
import java.io.Writer;

public class StringUtils {
    public static void writeEscapedChar(Writer writer, char c) throws IOException {
        if ((c >= ' ') && (c < 0x7f)) {
            if ((c == '\'') || (c == '\"') || (c == '\\')) {
                writer.write('\\');
            }
            writer.write(c);
            return;
        } else if (c <= 0x7f) {
            switch (c) {
                case '\n': writer.write("\\n"); return;
                case '\r': writer.write("\\r"); return;
                case '\t': writer.write("\\t"); return;
            }
        }

        writer.write("\\u");
        writer.write(Character.forDigit(c >> 12, 16));
        writer.write(Character.forDigit((c >> 8) & 0x0f, 16));
        writer.write(Character.forDigit((c >> 4) & 0x0f, 16));
        writer.write(Character.forDigit(c & 0x0f, 16));
    }

    public static void writeEscapedString(Writer writer, String value) throws IOException {
        for (int i = 0; i < value.length(); i++) {
            char c = value.charAt(i);

            if ((c >= ' ') && (c < 0x7f)) {
                if ((c == '\'') || (c == '\"') || (c == '\\')) {
                    writer.write('\\');
                }
                writer.write(c);
                continue;
            } else if (c <= 0x7f) {
                switch (c) {
                    case '\n': writer.write("\\n"); continue;
                    case '\r': writer.write("\\r"); continue;
                    case '\t': writer.write("\\t"); continue;
                }
            }

            writer.write("\\u");
            writer.write(Character.forDigit(c >> 12, 16));
            writer.write(Character.forDigit((c >> 8) & 0x0f, 16));
            writer.write(Character.forDigit((c >> 4) & 0x0f, 16));
            writer.write(Character.forDigit(c & 0x0f, 16));
        }
    }

    public static String escapeString(String value) {
        int len = value.length();
        StringBuilder sb = new StringBuilder(len * 3 / 2);

        for (int i = 0; i < len; i++) {
            char c = value.charAt(i);

            if ((c >= ' ') && (c < 0x7f)) {
                if ((c == '\'') || (c == '\"') || (c == '\\')) {
                    sb.append('\\');
                }
                sb.append(c);
                continue;
            } else if (c <= 0x7f) {
                switch (c) {
                    case '\n': sb.append("\\n"); continue;
                    case '\r': sb.append("\\r"); continue;
                    case '\t': sb.append("\\t"); continue;
                }
            }

            sb.append("\\u");
            sb.append(Character.forDigit(c >> 12, 16));
            sb.append(Character.forDigit((c >> 8) & 0x0f, 16));
            sb.append(Character.forDigit((c >> 4) & 0x0f, 16));
            sb.append(Character.forDigit(c & 0x0f, 16));
        }

        return sb.toString();
    }
	public static int countMatches(String text, String c) {
		int cLen = c.length();
		if (text.length() < cLen)
			return 0;
		int count = 0;
		int s;
		while ((s = text.indexOf(c)) > 0) {
			count++;
			text = text.substring(s + cLen);
		}
		return count;
	}

	public static String replace(String text, String searchString, String replacement) {
		return replace(text, searchString, replacement, -1);
	}

	private static String replace(String text, String searchString, String replacement, int max) {
		return replace(text, searchString, replacement, max, false);
	}

	private static String replace(String text, String searchString, String replacement, int max, boolean ignoreCase) {
		int i2 = 64;
        if (isEmpty(text) || isEmpty(searchString) || replacement == null || max == 0) {
            return text;
        }
        String searchText = text;
        if (ignoreCase) {
            searchText = text.toLowerCase();
            searchString = searchString.toLowerCase();
        }
        int start = 0;
        int end = searchText.indexOf(searchString, 0);
        if (end == -1) {
            return text;
        }
        int replLength = searchString.length();
        int increase = replacement.length() - replLength;
        if (increase < 0) {
            increase = 0;
        }
        if (max < 0) {
            i2 = 16;
        } else if (max <= 64) {
            i2 = max;
        }
        StringBuilder buf = new StringBuilder(text.length() + (increase * i2));
        while (end != -1) {
            buf.append(text.substring(start, end)).append(replacement);
            start = end + replLength;
            max--;
            if (max == 0) {
                break;
            }
            end = searchText.indexOf(searchString, start);
        }
        buf.append(text.substring(start));
        return buf.toString();
	}

	private static boolean isEmpty(CharSequence text) {
		return text == null || text.length() == 0;
	}
}
