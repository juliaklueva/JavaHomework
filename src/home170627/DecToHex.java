package home170627;

public class DecToHex {

	public static void main(String[] args) {

		int dec = ConvertUtils.initDec();

		System.out.println("Dec = " + dec);

		System.out.println("Hex = " +ConvertUtils.decToHexConverter(dec));

	}
}
