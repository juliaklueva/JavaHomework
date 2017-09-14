package home170624;

import testframework.Asserts;

public class PrimeTest {

	public static void main(String[] args) {

		System.out.println(Asserts.assertEquals(MathUtils.isPrime(2), true));
		System.out.println(Asserts.assertEquals(MathUtils.isPrime(17), true));
		System.out.println(Asserts.assertEquals(MathUtils.isPrime(1), false));
		System.out.println(Asserts.assertEquals(MathUtils.isPrime(10), false));
		System.out.println(Asserts.assertEquals(MathUtils.isPrime(-30), false));
		System.out.println(Asserts.assertEquals(MathUtils.isPrime(0), false));

		System.out.println(Asserts.assertEquals(MathUtils.isPrime(Integer.MIN_VALUE), false));
		System.out.println(Asserts.assertEquals(MathUtils.isPrime(Integer.MAX_VALUE), true));

		System.out.println(Asserts.assertNotEquals(MathUtils.isPrime(2), false));
		System.out.println(Asserts.assertNotEquals(MathUtils.isPrime(1), true));
		System.out.println(Asserts.assertNotEquals(MathUtils.isPrime(-30), true));

		System.out.println(Asserts.assertNotEquals(MathUtils.isPrime(Integer.MIN_VALUE), true));
		System.out.println(Asserts.assertNotEquals(MathUtils.isPrime(Integer.MAX_VALUE), false));

	}

}
