package home170624;

import testframework.Asserts;

public class ModTest {

	public static void main(String[] args) {

		System.out.println(Asserts.assertEquals(MathUtils.mod(-20, 6), -2));
		System.out.println(Asserts.assertEquals(MathUtils.mod(20, 6), 2));
		System.out.println(Asserts.assertEquals(MathUtils.mod(0, 6), 0));
		System.out.println(Asserts.assertEquals(MathUtils.mod(0, -6), 0));
		System.out.println(Asserts.assertEquals(MathUtils.mod(20, -12), 8));

		System.out.println(Asserts.assertNotEquals(MathUtils.mod(10, 1), -1));

		System.out.println(Asserts.assertEquals(MathUtils.mod(20, 0), 8));

	}
}
