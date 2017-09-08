package codingbat;

public class String_3 {

	/**
	 * CountYZ
	 *
	 * Given a string,count the number of words ending in 'y' or 'z' -- so the
	 * 'y' in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow"
	 * (not case sensitive). We'll say that a y or z is at the end of a word if
	 * there is not an alphabetic letter immediately following it. (Note:
	 * Character.isLetter(char) tests if a char is an alphabetic letter.)
	 *
	 * countYZ("fez day") → 2 countYZ("day fez") → 2 countYZ("day fyyyz") → 2
	 */
	public int countYZ(String str) {
		str = str.toLowerCase() + " ";
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) == 'y' || str.charAt(i) == 'z') && !Character.isLetter(str.charAt(i + 1))) {
				count++;
			}
		}
		return count;
	}

	/**
	 * Without String
	 *
	 * Given two strings, base and remove, return a version of the base string
	 * where all instances of the remove string have been removed (not case
	 * sensitive). You may assume that the remove string is length 1 or more.
	 * Remove only non-overlapping instances, so with "xxx" removing "xx" leaves
	 * "x".
	 *
	 * withoutString("Hello there", "llo") → "He there" withoutString("Hello
	 * there", "e") → "Hllo thr" withoutString("Hello there", "x") → "Hello
	 * there"
	 */
	public String withoutString(String base, String remove) {
		String result = "";
		int i = 0;

		while (i <= (base.length() - remove.length())) {
			if (base.substring(i, i + remove.length()).equalsIgnoreCase(remove)) {
				i = i + remove.length();
				continue;
			}
			result = result + base.charAt(i);
			i++;
		}
		result = result + base.substring(i);
		return result;
	}

	/**
	 * Equal Is Not
	 *
	 * Given a string, return true if the number of appearances of "is" anywhere
	 * in the string is equal to the number of appearances of "not" anywhere in
	 * the string (case sensitive).
	 *
	 * equalIsNot("This is not") → false equalIsNot("This is notnot") → true
	 * equalIsNot("noisxxnotyynotxisi") → true
	 */
	public boolean equalIsNot(String str) {
		int is = 0;
		int not = 0;
		for (int i = 0; i <= str.length() - 3; i++) {
			if (str.substring(i, i + 2).equals("is")) {
				is++;
			} else if (str.substring(i, i + 3).equals("not")) {
				not++;
			}
		}
		if (str.length() >= 2 && str.substring(str.length() - 2).equals("is")) {
			is++;
		}
		return is == not;
	}

	/**
	 * G Happy
	 *
	 * We'll say that a lowercase 'g' in a string is "happy" if there is another
	 * 'g' immediately to its left or right. Return true if all the g's in the
	 * given string are happy.
	 *
	 * gHappy("xxggxx") → true gHappy("xxgxx") → false gHappy("xxggyygxx") →
	 * false
	 */
	public boolean gHappy(String str) {
		str = " " + str + " ";
		for (int i = 1; i <= str.length() - 1; i++) {
			if (str.charAt(i) == 'g' && str.charAt(i + 1) != 'g' && str.charAt(i - 1) != 'g') {
				return false;
			}
		}
		return true;
	}

	/**
	 * Count Triple
	 *
	 * We'll say that a "triple" in a string is a char appearing three times in
	 * a row. Return the number of triples in the given string. The triples may
	 * overlap.
	 *
	 * countTriple("abcXXXabc") → 1 countTriple("xxxabyyyycd") → 3
	 * countTriple("a") → 0
	 */
	public int countTriple(String str) {
		int count = 0;
		for (int i = 0; i <= str.length() - 3; i++) {
			if (str.charAt(i) == str.charAt(i + 1) && str.charAt(i) == str.charAt(i + 2)) {
				count++;
			}
		}
		return count;
	}

	/**
	 * Sum Digits
	 *
	 * Given a string, return the sum of the digits 0-9 that appear in the
	 * string, ignoring all other characters. Return 0 if there are no digits in
	 * the string. (Note: Character.isDigit(char) tests if a char is one of the
	 * chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an
	 * int.)
	 *
	 * sumDigits("aa1bc2d3") → 6 sumDigits("aa11b33") → 8 sumDigits("Chocolate")
	 * → 0
	 */
	public int sumDigits(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				sum += Integer.parseInt(str.substring(i, i + 1));
			}
		}
		return sum;
	}

	/**
	 * Same Ends
	 *
	 * Given a string, return the longest substring that appears at both the
	 * beginning and end of the string without overlapping. For example,
	 * sameEnds("abXab") is "ab".
	 *
	 * sameEnds("abXYab") → "ab" sameEnds("xx") → "x" sameEnds("xxx") → "x"
	 */
	public String sameEnds(String string) {
		String result = "";
		for (int i = 0; i <= string.length() / 2; i++) {
			for (int j = string.length() / 2; j < string.length(); j++) {
				if (string.substring(0, i).equals(string.substring(j))) {
					result = string.substring(0, i);
				}
			}
		}
		return result;
	}

	/**
	 * Mirror Ends
	 *
	 * Given a string, look for a mirror image (backwards) string at both the
	 * beginning and end of the given string. In other words, zero or more
	 * characters at the very begining of the given string, and at the very end
	 * of the string in reverse order (possibly overlapping). For example, the
	 * string "abXYZba" has the mirror end "ab".
	 *
	 * mirrorEnds("abXYZba") → "ab" mirrorEnds("abca") → "a" mirrorEnds("aba") →
	 * "aba"
	 */
	public String mirrorEnds(String string) {
		String result = "";
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == string.charAt(string.length() - i - 1)) {
				result += string.charAt(i);
			} else {
				break;
			}
		}
		return result;
	}

	/**
	 * Max Block
	 *
	 * Given a string, return the length of the largest "block" in the string. A
	 * block is a run of adjacent chars that are the same.
	 *
	 * maxBlock("hoopla") → 2 maxBlock("abbCCCddBBBxx") → 3 maxBlock("") → 0
	 */
	public int maxBlock(String str) {
		int max = 0;
		int current = 1;

		if (str.length() == 0) {
			return 0;
		}
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) != str.charAt(i - 1)) {
				if (current > max) {
					max = current;
				}
				current = 1;
			} else {
				current++;
			}
		}
		return Math.max(max, current);
	}

	/**
	 * Sum Numbers
	 *
	 * Given a string, return the sum of the numbers appearing in the string,
	 * ignoring all other characters. A number is a series of 1 or more digit
	 * chars in a row. (Note: Character.isDigit(char) tests if a char is one of
	 * the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to
	 * an int.)
	 *
	 * sumNumbers("abc123xyz") → 123 sumNumbers("aa11b33") → 44 sumNumbers("7
	 * 11") → 18
	 */
	public int sumNumbers(String str) {
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				int count = 0;
				for (int j = i; j < str.length(); j++) {
					if (Character.isDigit(str.charAt(j))) {
						count++;
					} else {
						break;
					}
				}
				sum += Integer.parseInt(str.substring(i, i + count));
				i += count;
			}
		}
		return sum;
	}

	/**
	 * Not Replace
	 *
	 * Given a string, return a string where every appearance of the lowercase
	 * word "is" has been replaced with "is not". The word "is" should not be
	 * immediately preceeded or followed by a letter -- so for example the "is"
	 * in "this" does not count. (Note: Character.isLetter(char) tests if a char
	 * is a letter.)
	 *
	 * notReplace("is test") → "is not test" notReplace("is-is") → "is not-is
	 * not" notReplace("This is right") → "This is not right"
	 */
	public String notReplace(String str) {
		String result = "";
		str = " " + str + "  ";

		for (int i = 0; i < str.length() - 2; i++) {
			if (str.charAt(i) == 'i') {
				if (str.charAt(i + 1) == 's' && !Character.isLetter(str.charAt(i + 2))
						&& !Character.isLetter(str.charAt(i - 1))) {
					result += "is not";
					i += 1;
				} else {
					result += "i";
				}
			} else {
				result += str.charAt(i);
			}
		}
		return result.substring(1);
	}
}
