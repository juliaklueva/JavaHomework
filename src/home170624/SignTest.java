package home170624;

import testframework.Asserts;

public class SignTest {

	public static void main(String[] args) {

		System.out.println(Asserts.assertEquals(MathUtils.sign(20), 1));
		System.out.println(Asserts.assertNotEquals(MathUtils.sign(10), -1));

		System.out.println(Asserts.assertEquals(MathUtils.sign(-10), -1));
		System.out.println(Asserts.assertNotEquals(MathUtils.sign(-10), 1));

		System.out.println(Asserts.assertEquals(MathUtils.sign(0), 0));

		System.out.println(Asserts.assertEquals(MathUtils.sign(Integer.MAX_VALUE), 1));
		System.out.println(Asserts.assertEquals(MathUtils.sign(Integer.MIN_VALUE), -1));

	}

}
