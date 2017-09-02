package home170627;

import java.util.Scanner;

public class ConvertUtils {

	public static String str = "";

	@SuppressWarnings("resource")
	public static int initDec() {

		Scanner sc;

		System.out.println("Enter a decimal integer:");

		do {
			sc = new Scanner(System.in);

			if (!sc.hasNextInt()||sc.nextInt()<0) {
				System.out.println("It's not a decimal integer. Enter a decimal integer:");
			}
		} while (!sc.hasNextInt()||sc.nextInt()<0);

		return sc.nextInt();

	}

	public static String decToBinConverter(int number) {

		if (number >= 0 && number < 2) {
			return str += number;
		}

		str += number % 2;

		while (number / 2 != 0) {
			number = number / 2;
			str += number % 2;
		}

		return reverseString(str);

	}

	public static String decToOctConverter(int number) {

		if (number >= 0 && number < 8) {
			return str += number;
		}

		str += number % 8;

		while (number / 8 != 0) {
			number = number / 8;
			str += number % 8;
		}

		return reverseString(str);
	}

	public static String decToHexConverter(int number) {

		if (number >= 0 && number < 16) {
			return str += number;
		}

		str += number % 16;

		while (number / 16 != 0) {
			number = number / 16;
			str += number % 16;
		}

		return reverseString(str);
	}

	public static String reverseString(String inputString) {

		int stringLength = inputString.length();
		String result = "";
		for (int i = 0; i < stringLength; i++) {
			result = inputString.charAt(i) + result;
		}
		return result;
	}

}
