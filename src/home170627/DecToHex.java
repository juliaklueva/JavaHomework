package home170627;

public class DecToHex {

	public static String toHex(int decNumber) {
		if (decNumber == 0) {
			return "0";
		}
		String result = "";
		int hexNumber;
		char c = '\u0000';
		while (decNumber != 0) {
			hexNumber = decNumber % 16;
			if (hexNumber > 9) {
				if (hexNumber == 10) {
					c = 'a'; // a
				}
				if (hexNumber == 11) {
					c = 'b'; // b
				}
				if (hexNumber == 12) {
					c = 'c'; // c
				}
				if (hexNumber == 13) {
					c = 'd'; // d
				}
				if (hexNumber == 14) {
					c = 'e'; // e
				}
				if (hexNumber == 15) {
					c = 'f'; // f
				}
				result = c + result;

			} else {
				result = hexNumber + result;

			}
			decNumber = decNumber / 16;

		}
		return result;
	}

}
