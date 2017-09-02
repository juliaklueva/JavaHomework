package home170624;

public class FibonacciTest {
	public static void main(String[] args) {

		System.out.println(Asserts.assertEquals(MathUtils.isFibonacci(2), false));
		System.out.println(Asserts.assertEquals(MathUtils.isFibonacci(1), true));
		System.out.println(Asserts.assertEquals(MathUtils.isFibonacci(0), false));
		System.out.println(Asserts.assertEquals(MathUtils.isFibonacci(-10), false));
		System.out.println(Asserts.assertEquals(MathUtils.isFibonacci(610), true));

		System.out.println(Asserts.assertEquals(MathUtils.isFibonacci(Integer.MIN_VALUE), false));

		System.out.println(Asserts.assertNotEquals(MathUtils.isFibonacci(Integer.MIN_VALUE), true));
		System.out.println(Asserts.assertNotEquals(MathUtils.isFibonacci(1), false));
		System.out.println(Asserts.assertNotEquals(MathUtils.isFibonacci(-1200), true));

	}

}
