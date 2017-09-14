package home170707;

import testframework.Asserts;

public class StringMethodsPractice {

	public static void main(String[] args) {

		String s1 = "   Hello ";
		String s2 = "Hello";
		String s3 = "  Hello";
		String s4 = "Hello  ";
		String s5 = "  He l l o  ";
		String s6 = "";
		String s7 = "  Hello  ";

		System.out.println(Asserts.assertEquals(trim(s6), ""));
		System.out.println(Asserts.assertEquals(trim(s2), s2));
		System.out.println(Asserts.assertEquals(trim(s4), s2));
		System.out.println(Asserts.assertEquals(trim(s7), s2));
		System.out.println(Asserts.assertEquals(trim(s3), s2));
		System.out.println(Asserts.assertEquals(trim(s5), "He l l o"));
		System.out.println(Asserts.assertEquals(trim(s1), s2));

		System.out.println(Asserts.assertEquals(replace(s6, 'a', 'b'), ""));
		System.out.println(Asserts.assertEquals(replace(s2, 'H', 'D'), "Dello"));
		System.out.println(Asserts.assertEquals(replace(s2, 'o', 'o'), s2));
		System.out.println(Asserts.assertEquals(replace(s6, 'a', 'b'), ""));
	}

	private static String trim(String s) {

		if (s == null || s.length() == 0) {
			return s;
		}

		if (hasNoTrailingOrLeadingSpaces(s)) {
			return s;
		}

		char[] chars = s.toCharArray();
		int counterStart = 0;

		for (int i = 0; i < chars.length; i++) {
			if (chars[i] != ' ') {
				counterStart = i;
				break;
			}
			counterStart = 0;
		}

		int counterEnd = 0;

		for (int i = chars.length - 1; i > counterStart; i--) {
			if (chars[i] != ' ') {
				counterEnd = i;
				break;
			}
		}

		char[] result = new char[counterEnd - counterStart + 1];

		for (int i = counterStart; i <= counterEnd; i++) {
			result[i - counterStart] = chars[i];
		}

		return String.copyValueOf(result);
	}

	private static String replace(String str, char oldChar, char newChar) {
		char[] chars = str.toCharArray();
		int index = -1;

		for (int i = chars.length - 1; i >= 0; i--) {
			if (chars[i] == oldChar) {
				index = i;
			}
		}

		if (index == -1) {
			return str;
		} else {
			chars[index] = newChar;
			return String.valueOf(chars);
		}
	}

	private static boolean hasNoTrailingOrLeadingSpaces(String s) {
		return s.indexOf(' ') != 0 && s.lastIndexOf(' ') != s.length() - 1;
	}

}
