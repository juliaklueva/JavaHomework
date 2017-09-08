package codingbat;

import java.util.ArrayList;
import java.util.List;

public class AP_1 {
	/**
	 * Scores Increasing
	 *
	 * Given an array of scores, return true if each score is equal or greater
	 * than the one before. The array will be length 2 or more.
	 *
	 * scoresIncreasing({1, 3, 4}) -> true scoresIncreasing({1, 3, 2}) -> false
	 * scoresIncreasing({1, 1, 4}) -> true
	 */
	public boolean scoresIncreasing(int[] scores) {
		for (int i = 0; i < scores.length - 1; i++) {
			if (scores[i] > scores[i + 1]) {
				return false;
			}
		}
		return true;
	}

	/**
	 * Scores 100
	 *
	 * Given an array of scores, return true if there are scores of 100 next to
	 * each other in the array. The array length will be at least 2.
	 *
	 * scores100({1, 100, 100}) -> true scores100({1, 100, 99, 100}) -> false
	 * scores100({100, 1, 100, 100}) -> true
	 */
	public boolean scores100(int[] scores) {
		for (int i = 0; i < scores.length - 1; i++) {
			if (scores[i] == 100 && scores[i + 1] == 100) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Scores Clump
	 *
	 * Given an array of scores sorted in increasing order, return true if the
	 * array contains 3 adjacent scores that differ from each other by at most
	 * 2, such as with {3, 4, 5} or {3, 5, 5}.
	 *
	 * scoresClump({3, 4, 5}) -> true scoresClump({3, 4, 6}) -> false
	 * scoresClump({1, 3, 5, 5}) -> true
	 */
	public boolean scoresClump(int[] scores) {
		for (int i = 0; i < scores.length - 2; i++) {
			if (scores[i + 1] - scores[i] <= 2 && scores[i + 2] - scores[i + 1] <= 2
					&& scores[i + 2] - scores[i] <= 2) {
				return true;
			}
		}
		return false;
	}

	/**
	 * Scores Average
	 *
	 * Given an array of scores, compute the int average of the first half and
	 * the second half, and return whichever is larger. We'll say that the
	 * second half begins at index length/2. The array length will be at least
	 * 2. To practice decomposition, write a separate helper method <br>
	 * <code>int average(int[] scores, int start, int end) {
	 * </code> which computes the average of the elements between indexes
	 * start..end. Call your helper method twice to implement scoresAverage().
	 * Write your helper method after your scoresAverage() method in the JavaBat
	 * text area. Normally you would compute averages with doubles, but here we
	 * use ints so the expected results are exact.
	 *
	 * scoresAverage({2, 2, 4, 4}) -> 4 scoresAverage({4, 4, 4, 2, 2, 2}) -> 4
	 * scoresAverage({3, 4, 5, 1, 2, 3}) -> 4
	 */
	public int scoresAverage(int[] scores) {
		int firstArray = average(scores, 0, scores.length / 2);
		int secondArray = average(scores, scores.length / 2, scores.length);
		return Math.max(firstArray, secondArray);
	}

	int average(int[] scores, int start, int end) {
		int sum = 0;
		for (int i = start; i < end; i++) {
			sum += scores[i];
		}
		return sum / (end - start);
	}

	/**
	 * Words Count
	 *
	 * Given an array of strings, return the count of the number of strings with
	 * the given length.
	 *
	 * wordsCount({"a", "bb", "b", "ccc"}, 1) -> 2 wordsCount({"a", "bb", "b",
	 * "ccc"}, 3) -> 1 wordsCount({"a", "bb", "b", "ccc"}, 4) -> 0
	 */
	public int wordsCount(String[] words, int len) {
		int count = 0;
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() == len) {
				count++;
			}
		}
		return count;
	}

	/**
	 * Words Front
	 *
	 * Given an array of strings, return a new array containing the first N
	 * strings. N will be in the range 1..length.
	 *
	 * wordsFront({"a", "b", "c", "d"}, 1) -> {"a"} wordsFront({"a", "b", "c",
	 * "d"}, 2) -> {"a", "b"} wordsFront({"a", "b", "c", "d"}, 3) -> {"a", "b",
	 * "c"}
	 */
	public String[] wordsFront(String[] words, int n) {
		String[] array = new String[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = words[i];
		}
		return array;
	}

	/**
	 * Words Without List
	 *
	 * Given an array of strings, return a new List (e.g. an ArrayList) where
	 * all the strings of the given length are omitted. See wordsWithout() below
	 * which is more difficult because it uses arrays.
	 *
	 * wordsWithoutList({"a", "bb", "b", "ccc"}, 1) -> {"bb", "ccc"}
	 * wordsWithoutList({"a", "bb", "b", "ccc"}, 3) -> {"a", "bb", "b"}
	 * wordsWithoutList({"a", "bb", "b", "ccc"}, 4) -> {"a", "bb", "b", "ccc"}
	 */
	public List<String> wordsWithoutList(String[] words, int len) {
		ArrayList<String> result = new ArrayList<String>();
		for (int i = 0; i < words.length; i++) {
			if (words[i].length() != len) {
				result.add(words[i]);
			}
		}
		return result;
	}

	/**
	 * Has One
	 *
	 * Given a positive int n, return true if it contains a 1 digit. Note: use %
	 * to get the rightmost digit, and / to discard the rightmost digit.
	 *
	 * hasOne(10) -> true hasOne(22) -> false hasOne(220) -> false
	 */
	public boolean hasOne(int n) {
		while (n > 0) {
			if (n % 10 == 1) {
				return true;
			} else {
				n /= 10;
			}
		}
		return false;
	}

	/**
	 * Divides Self
	 *
	 * We'll say that a positive int divides itself if every digit in the number
	 * divides into the number evenly. So for example 128 divides itself since
	 * 1, 2, and 8 all divide into 128 evenly. We'll say that 0 does not divide
	 * into anything evenly, so no number with a 0 digit divides itself. Note:
	 * use % to get the rightmost digit, and / to discard the rightmost digit.
	 *
	 * dividesSelf(128) -> true dividesSelf(12) -> true dividesSelf(120) ->
	 * false
	 */
	public boolean dividesSelf(int n) {
		int number = n;
		while (n > 0) {
			if (n % 10 == 0 || number % (n % 10) != 0) {
				return false;
			} else {
				n /= 10;
			}
		}
		return true;
	}

	/**
	 * Copy Evens
	 *
	 * Given an array of positive ints, return a new array of length "count"
	 * containing the first even numbers from the original array. The original
	 * array will contain at least "count" even numbers.
	 *
	 * copyEvens({3, 2, 4, 5, 8}, 2) -> {2, 4} copyEvens({3, 2, 4, 5, 8}, 3) ->
	 * {2, 4, 8} copyEvens({6, 1, 2, 4, 5, 8}, 3) -> {6, 2, 4}
	 */
	public int[] copyEvens(int[] nums, int count) {
		int[] result = new int[count];
		int index = 0;

		for (int i = 0; index < count; i++) {
			if (nums[i] % 2 == 0) {
				result[index] = nums[i];
				index++;
			}
		}
		return result;
	}

	/**
	 * Copy Endy
	 *
	 * We'll say that a positive int n is "endy" if it is in the range 0..10 or
	 * 90..100 (inclusive). Given an array of positive ints, return a new array
	 * of length "count" containing the first endy numbers from the original
	 * array. Decompose out a separate isEndy(int n) method to test if a number
	 * is endy. The original array will contain at least "count" endy numbers.
	 *
	 * copyEndy({9, 11, 90, 22, 6}, 2) -> {9, 90} copyEndy({9, 11, 90, 22, 6},
	 * 3) -> {9, 90, 6} copyEndy({12, 1, 1, 13, 0, 20}, 2) -> {1, 1}
	 */
	public int[] copyEndy(int[] nums, int count) {
		int[] result = new int[count];
		int index = 0;

		for (int i = 0; index < count; i++) {
			if (isEndy(nums[i])) {
				result[index] = nums[i];
				index++;
			}
		}
		return result;
	}

	public boolean isEndy(int n) {
		return n >= 0 && n <= 10 || n >= 90 && n <= 100;
	}

	/**
	 * Match Up
	 *
	 * Given 2 arrays that are the same length containing strings, compare the
	 * 1st string in one array to the 1st string in the other array, the 2nd to
	 * the 2nd and so on. Count the number of times that the 2 strings are
	 * non-empty and start with the same char. The strings may be any length,
	 * including 0.
	 *
	 * matchUp({"aa", "bb", "cc"}, {"aaa", "xx", "bb"}) -> 1 matchUp({"aa",
	 * "bb", "cc"}, {"aaa", "b", "bb"}) -> 2 matchUp({"aa", "bb", "cc"}, {"",
	 * "", "ccc"}) -> 1
	 */
	public int matchUp(String[] a, String[] b) {
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i].length() > 0 && b[i].length() > 0 && a[i].charAt(0) == b[i].charAt(0)) {
				count++;
			}
		}
		return count;
	}

	/**
	 * Score Up
	 *
	 * The "key" array is an array containing the correct answers to an exam,
	 * like {"a", "a", "b", "b"}. the "answers" array contains a student's
	 * answers, with "?" representing a question left blank. The two arrays are
	 * not empty and are the same length. Return the score for this array of
	 * answers, giving +4 for each correct answer, -1 for each incorrect answer,
	 * and +0 for each blank answer.
	 *
	 * scoreUp({"a", "a", "b", "b"}, {"a", "c", "b", "c"}) -> 6 scoreUp({"a",
	 * "a", "b", "b"}, {"a", "a", "b", "c"}) -> 11 scoreUp({"a", "a", "b", "b"},
	 * {"a", "a", "b", "b"}) -> 16
	 */
	public int scoreUp(String[] key, String[] answers) {
		int scores = 0;
		for (int i = 0; i < answers.length; i++) {
			if (key[i].charAt(0) == answers[i].charAt(0)) {
				scores += 4;
			} else if (answers[i].charAt(0) != '?') {
				scores -= 1;
			}
		}
		return scores;
	}

	/**
	 * Words Without
	 *
	 * Given an array of strings, return a new array without the strings that
	 * are equal to the target string. One approach is to count the occurrences
	 * of the target string, make a new array of the correct length, and then
	 * copy over the correct strings.
	 *
	 * wordsWithout({"a", "b", "c", "a"}, "a") -> {"b", "c"} wordsWithout({"a",
	 * "b", "c", "a"}, "b") -> {"a", "c", "a"} wordsWithout({"a", "b", "c",
	 * "a"}, "c") -> {"a", "b", "a"}
	 */
	public String[] wordsWithout(String[] words, String target) {
		int count = 0;
		int index = 0;

		for (int i = 0; i < words.length; i++) {
			if (!words[i].equals(target)) {
				count++;
			}
		}
		String[] result = new String[count];
		for (int i = 0; index < count; i++) {
			if (!words[i].equals(target)) {
				result[index] = words[i];
				index++;
			}
		}
		return result;
	}

	/**
	 * Scores Special
	 *
	 * Given two arrays, A and B, of non-negative int scores. A "special" score
	 * is one which is a multiple of 10, such as 40 or 90. Return the sum of
	 * largest special score in A and the largest special score in B. To
	 * practice decomposition, write a separate helper method which finds the
	 * largest special score in an array. Write your helper method after your
	 * scoresSpecial() method in the JavaBat text area.
	 *
	 * scoresSpecial({12, 10, 4}, {2, 20, 30}) -> 40 scoresSpecial({20, 10, 4},
	 * {2, 20, 10}) -> 40 scoresSpecial({12, 11, 4}, {2, 20, 31}) -> 20
	 */
	public int scoresSpecial(int[] a, int[] b) {
		int aMax = 0;
		int bMax = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 10 == 0 && a[i] > aMax) {
				aMax = a[i];
			}
		}
		for (int i = 0; i < b.length; i++) {
			if (b[i] % 10 == 0 && b[i] > bMax) {
				bMax = b[i];
			}
		}
		return aMax + bMax;
	}

	/**
	 * Sum Heights
	 *
	 * We have an array of heights, representing the altitude along a walking
	 * trail. Given start/end indexes into the array, return the sum of the
	 * changes for a walk beginning at the start index and ending at the end
	 * index. For example, with the heights {5, 3, 6, 7, 2} and start=2, end=4
	 * yields a sum of 1 + 5 = 6. The start end end index will both be valid
	 * indexes into the array with start <= end.
	 *
	 * sumHeights({5, 3, 6, 7, 2}, 2, 4) -> 6 sumHeights({5, 3, 6, 7, 2}, 0, 1)
	 * -> 2 sumHeights({5, 3, 6, 7, 2}, 0, 4) -> 11
	 */
	public int sumHeights(int[] heights, int start, int end) {
		int sumHeights = 0;
		for (int i = start; i < end; i++) {
			sumHeights += Math.abs(heights[i] - heights[i + 1]);
		}
		return sumHeights;
	}

	/**
	 * Sum Heights 2
	 *
	 * (A variation on the sumHeights problem.) We have an array of heights,
	 * representing the altitude along a walking trail. Given start/end indexes
	 * into the array, return the sum of the changes for a walk beginning at the
	 * start index and ending at the end index, however increases in height
	 * count double. For example, with the heights {5, 3, 6, 7, 2} and start=2,
	 * end=4 yields a sum of 1*2 + 5 = 7. The start end end index will both be
	 * valid indexes into the array with start <= end.
	 *
	 * sumHeights2({5, 3, 6, 7, 2}, 2, 4) -> 7 sumHeights2({5, 3, 6, 7, 2}, 0,
	 * 1) -> 2 sumHeights2({5, 3, 6, 7, 2}, 0, 4) -> 15
	 */
	public int sumHeights2(int[] heights, int start, int end) {
		int sumHeights = 0;

		for (int i = start; i < end; i++) {
			if (heights[i] < heights[i + 1]) {
				sumHeights += 2 * Math.abs(heights[i] - heights[i + 1]);
			} else {
				sumHeights += Math.abs(heights[i] - heights[i + 1]);
			}
		}
		return sumHeights;
	}

	/**
	 * Big Heights
	 *
	 * (A variation on the sumHeights problem.) We have an array of heights,
	 * representing the altitude along a walking trail. Given start/end indexes
	 * into the array, return the number of "big" steps for a walk starting at
	 * the start index and ending at the end index. We'll say that step is big
	 * if it is 5 or more up or down. The start end end index will both be valid
	 * indexes into the array with start <= end.
	 *
	 * bigHeights({5, 3, 6, 7, 2}, 2, 4) -> 1 bigHeights({5, 3, 6, 7, 2}, 0, 1)
	 * -> 0 bigHeights({5, 3, 6, 7, 2}, 0, 4) -> 1
	 */
	public int bigHeights(int[] heights, int start, int end) {
		int count = 0;
		for (int i = start; i < end; i++) {
			if (Math.abs(heights[i] - heights[i + 1]) >= 5) {
				count++;
			}
		}
		return count;
	}

	/**
	 * User Compare
	 *
	 * We have data for two users, A and B, each with a String name and an int
	 * id. The goal is to order the users such as for sorting. Return -1 if A
	 * comes before B, 1 if A comes after B, and 0 if they are the same. Order
	 * first by the string names, and then by the id numbers if the names are
	 * the same. Note: with Strings str1.compareTo(str2) returns an int value
	 * which is negative/0/positive to indicate how str1 is ordered to str2 (the
	 * value is not limited to -1/0/1). (On the AP, there would be two User
	 * objects, but here the code simply takes the two strings and two ints
	 * directly. The code logic is the same.)
	 *
	 * userCompare("bb", 1, "zz", 2) -> -1 userCompare("bb", 1, "aa", 2) -> 1
	 * userCompare("bb", 1, "bb", 1) -> 0
	 */
	public int userCompare(String aName, int aId, String bName, int bId) {
		if (aName.compareTo(bName) > 0) {
			return 1;
		} else if (aName.compareTo(bName) < 0) {
			return -1;
		} else if (aId > bId) {
			return 1;
		} else if (aId < bId) {
			return -1;
		} else {
			return 0;
		}
	}

	/**
	 * Merge Two
	 *
	 * Start with two arrays of strings, A and B, each with its elements in
	 * alphabetical order and without duplicates. Return a new array containing
	 * the first N elements from the two arrays. The result array should be in
	 * alphabetical order and without duplicates. A and B will both have a
	 * length which is N or more. The best "linear" solution makes a single pass
	 * over A and B, taking advantage of the fact that they are in alphabetical
	 * order, copying elements directly to the new array.
	 *
	 * mergeTwo({"a", "c", "z"}, {"b", "f", "z"}, 3) -> {"a", "b", "c"}
	 * mergeTwo({"a", "c", "z"}, {"c", "f", "z"}, 3) -> {"a", "c", "f"}
	 * mergeTwo({"f", "g", "z"}, {"c", "f", "g"}, 3) -> {"c", "f", "g"}
	 */
	public String[] mergeTwo(String[] a, String[] b, int n) {
		String[] result = new String[n];
		int index = 0;

		for (int i = 0, j = 0; index < n; index++) {
			if (a[i].compareTo(b[j]) < 0) {
				result[index] = a[i];
				i++;
			} else if (a[i].compareTo(b[j]) > 0) {
				result[index] = b[j];
				j++;
			} else {
				result[index] = a[i];
				i++;
				j++;
			}
		}
		return result;
	}

	/**
	 * Common Two
	 *
	 * Start with two arrays of strings, a and b, each in alphabetical order,
	 * possibly with duplicates. Return the count of the number of strings which
	 * appear in both arrays. The best "linear" solution makes a single pass
	 * over both arrays, taking advantage of the fact that they are in
	 * alphabetical order.
	 *
	 * commonTwo({"a", "c", "x"}, {"b", "c", "d", "x"}) -> 2 commonTwo({"a",
	 * "c", "x"}, {"a", "b", "c", "x", "z"}) -> 3 commonTwo({"a", "b", "c"},
	 * {"a", "b", "c"}) -> 3
	 */
	public int commonTwo(String[] a, String[] b) {
		int count = 0;
		String result = "";
		int i = 0, j = 0;

		while (i < a.length && j < b.length) {
			if (result.contains(a[i]) && i != a.length - 1) {
				i++;
			}
			int comparison = a[i].compareTo(b[j]);
			if (comparison < 0) {
				result += a[i];
				i++;
			} else if (comparison > 0) {
				j++;
			} else if (comparison == 0 && !result.contains(a[i])) {
				result += a[i];
				count++;
				i++;
				j++;
			}
		}
		return count;
	}

}
