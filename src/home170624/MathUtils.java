package home170624;

public class MathUtils {

	public static int max(int i, int j) {
		return i > j ? i : j;
	}

	public static int sign(int i) {

		if (i > 0)
			return 1;
		else if (i < 0)
			return -1;
		else
			return 0;
	}

	public static int mod(int a, int b) {

		return a - ((int) a / b) * b;
	}

	public static boolean isPrime(int a) {

		if (a < 2)
			return false;
		for (int k = 2; k <= a / 2; k++)
			if (a % k == 0)
				return false;
		return true;
	}

	public static boolean isFibonacci(int a) {

		if (a == 1)
			return true;

		for (int i = 1; i < a; i++) {
			if (a == Fibonacci(i))
				return true;
			if (a < Fibonacci(i))
				break;
		}
		return false;
	}

	public static long Fibonacci(int n) {
		if (n == 0)
			return 0;
		if (n == 1)
			return 1;
		return Fibonacci(n - 1) + Fibonacci(n - 2);
	}
}
