package codingbat;

public class String_2 {

	/**
	 * Double Char
	 *
	 * Given a string, return a string where for every char in the original,
	 * there are two chars.
	 *
	 * doubleChar("The") -> "TThhee" doubleChar("AAbb") -> "AAAAbbbb"
	 * doubleChar("Hi-There") -> "HHii--TThheerree"
	 */
	public String doubleChar(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			result = result + str.charAt(i) + str.charAt(i);
		}
		return result;
	}

	/**
	 * Count Hi
	 *
	 * Return the number of times that the string "hi" appears anywhere in the
	 * given string.
	 *
	 * countHi("abc hi ho") -> 1 countHi("ABChi hi") -> 2 countHi("hihi") -> 2
	 */
	public int countHi(String str) {
		int times = 0;
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.substring(i, i + 2).equals("hi")) {
				times++;
			}
		}
		return times;
	}

	/**
	 * Cat Dog
	 *
	 * Return true if the string "cat" and "dog" appear the same number of times
	 * in the given string.
	 *
	 * catDog("catdog") -> true catDog("catcat") -> false catDog("1cat1cadodog")
	 * -> true
	 */
	public boolean catDog(String str) {
		int countCat = 0, countDog = 0;
		for (int i = 0; i < str.length() - 2; i++) {
			if (str.substring(i, i + 3).equals("cat")) {
				countCat++;
			}
			if (str.substring(i, i + 3).equals("dog")) {
				countDog++;
			}
		}
		return (countCat == countDog);
	}

	/**
	 * Count Code
	 *
	 * Return the number of times that the string "code" appears anywhere in the
	 * given string, except we'll accept any letter for the 'd', so "cope" and
	 * "cooe" count.
	 *
	 * countCode("aaacodebbb") -> 1 countCode("codexxcode") -> 2
	 * countCode("cozexxcope") -> 2
	 */
	public int countCode(String str) {
		int count = 0;
		for (int i = 0; i < str.length() - 3; i++) {
			if (str.substring(i, i + 2).equals("co") && str.substring(i + 3, i + 4).equals("e")) {
				count++;
			}
		}
		return count;
	}

	/**
	 * End Other
	 *
	 * Given two strings, return true if either of the strings appears at the
	 * very end of the other string, ignoring upper/lower case differences (in
	 * other words, the computation should not be "case sensitive"). Note:
	 * str.toLowerCase() returns the lowercase version of a string.
	 *
	 * endOther("Hiabc", "abc") -> true endOther("AbC", "HiaBc") -> true
	 * endOther("abc", "abXabc") -> true
	 */
	public boolean endOther(String a, String b) {
		String str1 = a.toLowerCase();
		String str2 = b.toLowerCase();

		if (a.length() <= b.length()) {
			if (str1.equals(str2.substring(str2.length() - str1.length(), str2.length()))) {
				return true;
			}
		}
		if (a.length() > b.length()) {
			if (str2.equals(str1.substring(str1.length() - str2.length(), str1.length()))) {
				return true;
			}
		}
		return false;
	}

	/**
	 * xyz There
	 *
	 * Return true if the given string contains an appearance of "xyz" where the
	 * xyz is not directly preceeded by a period (.). So "xxyz" counts but
	 * "x.xyz" does not.
	 *
	 * xyzThere("abcxyz") -> true xyzThere("abc.xyz") -> false
	 * xyzThere("xyz.abc") -> true
	 */
	public boolean xyzThere(String str) {
		if (str.length() < 3) {
			return false;
		}
		if (str.substring(0, 3).equals("xyz")) {
			return true;
		}
		for (int i = 0; i < str.length() - 3; i++) {
			if (str.substring(i + 1, i + 4).equals("xyz") && str.charAt(i) != '.') {
				return true;
			}
		}
		return false;
	}

	/**
	 * Bob There
	 *
	 * Return true if the given string contains a "bob" string, but where the
	 * middle 'o' char can be any char.
	 *
	 * bobThere("abcbob") -> true bobThere("b9b") -> true bobThere("bac") ->
	 * false
	 */
	public boolean bobThere(String str) {
		if (str.length() < 3) {
			return false;
		}
		for (int i = 0; i < str.length() - 2; i++) {
			if (str.substring(i, i + 1).equals("b") && str.substring(i + 2, i + 3).equals("b")) {
				return true;
			}
		}
		return false;
	}

	/**
	 * xy Balance
	 *
	 * We'll say that a String is xy-balanced if for all the 'x' chars in the
	 * string, there exists a 'y' char somewhere later in the string. So "xxy"
	 * is balanced, but "xyx" is not. One 'y' can balance multiple 'x's. Return
	 * true if the given string is xy-balanced.
	 *
	 * xyBalance("aaxbby") -> true xyBalance("aaxbb") -> false
	 * xyBalance("yaaxbb") -> false
	 */
	public boolean xyBalance(String str) {
		int xPosition = str.lastIndexOf("x");
		int yPosition = str.lastIndexOf("y");
		return xPosition == -1 && yPosition == -1 || xPosition < yPosition;
	}

	/**
	 * Mix String
	 *
	 * Given two strings, A and B, create a bigger string made of the first char
	 * of A, the first char of B, the second char of A, the second char of B,
	 * and so on. Any leftover chars go at the end of the result.
	 *
	 * mixString("abc", "xyz") -> "axbycz" mixString("Hi", "There") -> "HTihere"
	 * mixString("xxxx", "There") -> "xTxhxexre"
	 */
	public String mixString(String a, String b) {
		String result = "";
		for (int i = 0; i < Math.min(a.length(), b.length()); i++) {
			result += "" + a.charAt(i) + b.charAt(i);
		}
		if (a.length() > b.length()) {
			result += "" + a.substring(b.length());
		} else {
			result += "" + b.substring(a.length());
		}
		return result;
	}

	/**
	 * Repeat End
	 *
	 * Given a string and an int N, return a string made of N repetitions of the
	 * last N characters of the string. You may assume that N is between 0 and
	 * the length of the string, inclusive.
	 *
	 * repeatEnd("Hello", 3) -> "llollollo" repeatEnd("Hello", 2) -> "lolo"
	 * repeatEnd("Hello", 1) -> "o"
	 */
	public String repeatEnd(String str, int n) {
		String result = "";
		for (int i = 0; i < n; i++) {
			result += str.substring(str.length() - n);
		}
		return result;
	}

	/**
	 * Repeat Front
	 *
	 * Given a string and an int n, return a string made of the first n
	 * characters of the string, followed by the first n-1 characters of the
	 * string, and so on. You may assume that n is between 0 and the length of
	 * the string, inclusive (i.e. n >= 0 and n <= str.length()).
	 *
	 * repeatFront("Chocolate", 4) -> "ChocChoChC" repeatFront("Chocolate", 3)
	 * -> "ChoChC" repeatFront("Ice Cream", 2) -> "IcI"
	 */
	public String repeatFront(String str, int n) {
		String result = "";
		for (int i = n; i > 0; i--) {
			result += str.substring(0, i);
		}
		return result;
	}

	/**
	 * Repeat Separator
	 *
	 * Given two strings, word and a separator, return a big string made of
	 * count occurences of the word, separated by the separator string.
	 *
	 * repeatSeparator("Word", "X", 3) -> "WordXWordXWord"
	 * repeatSeparator("This", "And", 2) -> "ThisAndThis"
	 * repeatSeparator("This", "And", 1) -> "This"
	 */
	public String repeatSeparator(String word, String sep, int count) {
		String result = "";
		for (int i = 0; i < count - 1; i++) {
			result += word + sep;
		}
		if (count != 0) {
			result += word;
		}
		return result;
	}

	/**
	 * Prefix Again
	 *
	 * Given a string, consider the prefix string made of the first N chars of
	 * the string. Does that prefix string appear somewhere else in the string?
	 * Assume that the string is not empty and that N is in the range
	 * 1..str.length().
	 *
	 * prefixAgain("abXYabc", 1) -> true prefixAgain("abXYabc", 2) -> true
	 * prefixAgain("abXYabc", 3) -> false
	 */
	public boolean prefixAgain(String str, int n) {
		String result = str.substring(0, n);
		boolean isAgain = false;
		for (int i = n; i <= str.length() - n; i++) {
			if (result.equals(str.substring(i, i + n))) {
				isAgain = true;
			}
		}
		return isAgain;
	}

	/**
	 * xyz Middle
	 *
	 * Given a string, does "xyz" appear in the middle of the string? To define
	 * middle, we'll say that the number of chars to the left and right of the
	 * "xyz" must differ by at most one. This problem is harder than it looks.
	 *
	 * xyzMiddle("AAxyzBB") -> true xyzMiddle("AxyzBB") -> true
	 * xyzMiddle("AxyzBBB") -> false
	 */
	public boolean xyzMiddle(String str) {
		int length = str.length();
		if (length < 3) {
			return false;
		}
		if (length % 2 == 1) {
			return str.substring(length / 2 - 1, length / 2 + 2).equals("xyz");
		}
		return str.substring(length / 2 - 2, length / 2 + 1).equals("xyz")
				|| str.substring(length / 2 - 1, length / 2 + 2).equals("xyz");
	}

	/**
	 * Get Sandwich
	 *
	 * A sandwich is two pieces of bread with something in between. Return the
	 * string that is between the first and last appearance of "bread" in the
	 * given string, or return the empty string "" if there are not two pieces
	 * of bread.
	 *
	 * getSandwich("breadjambread") -> "jam" getSandwich("xxbreadjambreadyy") ->
	 * "jam" getSandwich("xxbreadyy") -> ""
	 */
	public String getSandwich(String str) {
		String result = "";
		int first = str.indexOf("bread");
		int last = str.lastIndexOf("bread");
		if (last == first) {
			return "";
		}
		result = str.substring(first + 5, last);
		return result;
	}

	/**
	 * Same Star Char
	 *
	 * Returns true if for every '*' (star) in the string, if there are chars
	 * both immediately before and after the star, they are the same.
	 *
	 * sameStarChar("xy*yzz") -> true sameStarChar("xy*zzz") -> false
	 * sameStarChar("*xa*az") -> true
	 */
	public boolean sameStarChar(String str) {
		for (int i = 1; i < str.length() - 1; i++) {
			if (str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1)) {
				return false;
			}
		}
		return true;
	}

	/**
	 * One Two
	 *
	 * Given a string, compute a new string by moving the first char to come
	 * after the next two chars, so "abc" yields "bca". Repeat this process for
	 * each subsequent group of 3 chars, so "abcdef" yields "bcaefd". Ignore any
	 * group of fewer than 3 chars at the end.
	 * 
	 * oneTwo("abc") → "bca" oneTwo("tca") → "cat" oneTwo("tcagdo") → "catdog"
	 */
	public String oneTwo(String str) {
		String result = "";

		if (str.length() < 3) {
			return "";
		}
		int length = str.length() / 3;
		int i = 0;
		do {
			result += "" + str.charAt(i + 1) + str.charAt(i + 2) + str.charAt(i);
			i = i + 3;
			length--;
		} while (length > 0);
		return result;
	}

	/**
	 * Zip Zap
	 *
	 * Look for patterns like "zip" and "zap" in the string -- length-3,
	 * starting with 'z' and ending with 'p'. Return a string where for all such
	 * words, the middle letter is gone, so "zipXzap" yields "zpXzp".
	 *
	 * zipZap("zipXzap") -> "zpXzp" zipZap("zopzop") -> "zpzp"
	 * zipZap("zzzopzop") -> "zzzpzp"
	 */
	public String zipZap(String str) {
		for (int i = 0; i < str.length() - 2; i++) {
			if (str.charAt(i) == 'z' && str.charAt(i + 2) == 'p') {
				str = str.substring(0, i + 1) + str.substring(i + 2);
			}
		}
		return str;
	}

	/**
	 * Star Out
	 *
	 * Return a version of the given string, where for every star (*) in the
	 * string the star and the chars immediately to its left and right are gone.
	 * So "ab*cd" yields "ad" and "ab**cd" also yields "ad".
	 *
	 * starOut("ab*cd") -> "ad" starOut("ab**cd") -> "ad" starOut("sm*eilly") ->
	 * "silly"
	 */
	public String starOut(String str) {
		String result = "";

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '*') {
			} else if (i != 0 && str.charAt(i - 1) == '*') {
			} else if (i != str.length() - 1 && str.charAt(i + 1) == '*') {
			} else {
				result += str.charAt(i);
			}
		}
		return result;
	}

	/**
	 * Plus Out
	 *
	 * Given a string and a non-empty word string, return a version of the
	 * original String where all chars have been replaced by pluses ("+"),
	 * except for appearances of the word string which are preserved unchanged.
	 *
	 * plusOut("12xy34", "xy") -> "++xy++" plusOut("12xy34", "1") -> "1+++++"
	 * plusOut("12xy34xyabcxy", "xy") -> "++xy++xy+++xy"
	 */
	public String plusOut(String str, String word) {
		String result = "";
		int i = 0;

		while (i < str.length()) {
			if (str.substring(i).startsWith(word)) {
				result += word;
				i += word.length();
			} else {
				result += "+";
				i++;
			}
		}
		return result;
	}

	/**
	 * Word Ends
	 *
	 * Given a string and a non-empty word string, return a string made of each
	 * char just before and just after every appearance of the word in the
	 * string. Ignore cases where there is no char before or after the word, and
	 * a char may be included twice if it is between two words.
	 *
	 * wordEnds("abcXY123XYijk", "XY") -> "c13i" wordEnds("XY123XY", "XY") ->
	 * "13" wordEnds("XY1XY", "XY") -> "11"
	 */
	public String wordEnds(String str, String word) {
		String result = "";
		int i = 1;

		if (word.equals(str)) {
			return result;
		}
		if (str.startsWith(word)) {
			result += str.charAt(word.length());
		}
		while (i < (str.length() - word.length())) {
			if (str.substring(i).startsWith(word)) {
				result += "" + str.charAt(i - 1) + str.charAt(i + word.length());
				i += word.length();
			} else {
				i++;
			}
		}
		if (str.endsWith(word)) {
			result += "" + str.charAt(str.length() - word.length() - 1);
		}
		return result;
	}

}
