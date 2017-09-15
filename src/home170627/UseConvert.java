package home170627;

import testframework.Asserts;

public class UseConvert {

	public static void main(String[] args) {

		System.out.println(Asserts.assertEquals(DecToBinary.toBinary(25), "11001"));
		System.out.println(Asserts.assertEquals(DecToBinary.toBinary(800), "1100100000"));
		System.out.println(Asserts.assertEquals(DecToBinary.toBinary(0), "0"));
		System.out.println(Asserts.assertEquals(DecToBinary.toBinary(10000), "10011100010000"));

		System.out.println(Asserts.assertEquals(DecToOct.toOctal(25), "31"));
		System.out.println(Asserts.assertEquals(DecToOct.toOctal(800), "1440"));
		System.out.println(Asserts.assertEquals(DecToOct.toOctal(0), "0"));
		System.out.println(Asserts.assertEquals(DecToOct.toOctal(10000), "23420"));

		System.out.println(Asserts.assertEquals(DecToHex.toHex(25), "19"));
		System.out.println(Asserts.assertEquals(DecToHex.toHex(800), "320"));
		System.out.println(Asserts.assertEquals(DecToHex.toHex(0), "0"));
		System.out.println(Asserts.assertEquals(DecToHex.toHex(10000), "2710"));

	}
}
