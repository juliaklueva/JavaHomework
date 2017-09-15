package home170627;

public class DecToOct {

	public static String toOctal(int decNumber) {
		if (decNumber == 0) {
			return "0";
		}
		String result = "";
		int octNumber;
		while (decNumber != 0) {
			octNumber = decNumber % 8;
			result = octNumber + result;
			decNumber = decNumber / 8;
		}
		return result;
	}

}
