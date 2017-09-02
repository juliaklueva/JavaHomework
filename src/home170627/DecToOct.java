package home170627;

public class DecToOct {
	
	public static void main(String[] args) {

		int dec = ConvertUtils.initDec();

		System.out.println("Dec = " + dec);

		System.out.println("Oct = " +ConvertUtils.decToOctConverter(dec));

	}


}
