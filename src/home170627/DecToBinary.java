package home170627;

public class DecToBinary {

	public static String toBinary(int decNumber) {
		if (decNumber == 0) {
			return "0";
		}
		String result = "";
		int binNumber;
		while (decNumber != 0) {
			binNumber = decNumber % 2;
			result = binNumber + result;
			decNumber = decNumber / 2;
		}
		return result;
	}
}
