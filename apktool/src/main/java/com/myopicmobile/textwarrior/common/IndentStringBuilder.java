package com.myopicmobile.textwarrior.common;

public class IndentStringBuilder implements CharSequence {
	private final StringBuilder sb;
	protected int indentLevel = 0;
    private boolean beginningOfLine = false;
    private static final String newLine = "\n";
	protected final char[] buffer = new char[24];

	public IndentStringBuilder() {
		sb = new StringBuilder();
	}
	public IndentStringBuilder(int capacity) {
		sb = new StringBuilder(capacity);
	}

	public int length() {
		return sb.length();
	}

	public void println() {
		append('\n');
	}
	public void print(char c) {
		append(c);
	}
	public void print(String text) {
		append(text);
	}

	
	public char charAt(int p1) {
		return sb.charAt(p1);
	}


	public CharSequence subSequence(int p1, int p2) {
		return sb.subSequence(p1, p2);
	}


	public String toString() {
		return sb.toString();
	}

    protected void writeIndent() {
        for (int i=0; i < indentLevel; i++) {
            sb.append(' ');
        }
    }
	public void write(char chr) {
        if (chr == '\n') {
            sb.append(newLine);
            beginningOfLine = true;
        } else {
            if (beginningOfLine) {
                writeIndent();
            }
            beginningOfLine = false;
            sb.append(chr);
        }
    }

    /**
     * Writes out a block of text that contains no newlines
     */
    private void writeLine(char[] chars, int start, int len) {
        if (beginningOfLine && len > 0) {
            writeIndent();
            beginningOfLine = false;
        }
        sb.append(chars, start, len);
    }
	public void write(char[] chars) {
        write(chars, 0, chars.length);
    }

	private void write(char[] chars, int start, int len) {
		final int end = start + len;
        int pos = start;
        while (pos < end) {
            if (chars[pos] == '\n') {
                writeLine(chars, start, pos - start);
                sb.append(newLine);
                beginningOfLine = true;
                pos++;
                start = pos;
            } else {
                pos++;
            }
        }
        writeLine(chars, start, pos - start);
	}
	public void write(String s) {
        write(s.toCharArray());
    }


    public IndentStringBuilder append(CharSequence charSequence)  {
        write(charSequence.toString());
        return this;
    }


    public IndentStringBuilder append(CharSequence charSequence, int start, int len)  {
        write(charSequence.subSequence(start, len).toString());
        return this;
    }


    public IndentStringBuilder append(char c)  {
        write(c);
        return this;
    }

    public void indent(int indentAmount) {
        this.indentLevel += indentAmount;
        if (indentLevel < 0) {
            indentLevel = 0;
        }
    }

    public void deindent(int indentAmount) {
        this.indentLevel -= indentAmount;
        if (indentLevel < 0) {
            indentLevel = 0;
        }
    }

    public void printUnsignedLongAsHex(long value)  {
        int bufferIndex = 23;
        do {
            int digit = (int)(value & 15);
            if (digit < 10) {
                buffer[bufferIndex--] = (char)(digit + '0');
            } else {
                buffer[bufferIndex--] = (char)((digit - 10) + 'a');
            }

            value >>>= 4;
        } while (value != 0);

        bufferIndex++;

        writeLine(buffer, bufferIndex, 24 - bufferIndex);
    }

    public void printSignedLongAsDec(long value)  {
        int bufferIndex = 23;

        if (value < 0) {
            value *= -1;
            write('-');
        }

        do {
            long digit = value % 10;
            buffer[bufferIndex--] = (char)(digit + '0');

            value = value / 10;
        } while (value != 0);

        bufferIndex++;

        writeLine(buffer, bufferIndex, 24 - bufferIndex);
    }

    public void printSignedIntAsDec(int value)  {
        int bufferIndex = 15;

        if (value < 0) {
            value *= -1;
            write('-');
        }

        do {
            int digit = value % 10;
            buffer[bufferIndex--] = (char)(digit + '0');

            value = value / 10;
        } while (value != 0);

        bufferIndex++;

        writeLine(buffer, bufferIndex, 16 - bufferIndex);
    }

    public void printUnsignedIntAsDec(int value)  {
        int bufferIndex = 15;

        if (value < 0) {
            printSignedLongAsDec(value & 0xFFFFFFFFL);
        } else {
            printSignedIntAsDec(value);
        }
    }
}
