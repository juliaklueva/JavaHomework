package hackerrank;

import java.util.Scanner;

public class Day25_RunningTimeAndComplexity {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 */
		Scanner sc = new Scanner(System.in);
		int allNumbers = sc.nextInt();
		sc.close();

		for (int i = 0; i < allNumbers; i++) {
			isPrime(sc.nextInt());
		}
	}

	static void isPrime(int number) {
		boolean primeNumber = true;

		if (number < 2) {
			System.out.println("Not prime");
			return;
		}
		if (primeNumber == true) {
			for (int k = 2; k <= Math.sqrt(number); k++) {
				int mod = number % k;
				if (mod == 0) {
					primeNumber = false;
					System.out.println("Not prime");
					return;
				}
			}
		}
		System.out.println("Prime");
	}
}
