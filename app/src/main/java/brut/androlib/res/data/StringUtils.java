package brut.androlib.res.data;

public class StringUtils {
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
