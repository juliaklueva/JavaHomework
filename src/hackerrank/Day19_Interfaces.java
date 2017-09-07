package hackerrank;

import java.util.Scanner;

interface AdvancedArithmetic {
	int divisorSum(int n);
}

class DivisorCalculator implements AdvancedArithmetic {

	@Override
	public int divisorSum(int n) {
		int divSum = 0;
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				divSum += i;
			}
		}
		return divSum;
	}
}

public class Day19_Interfaces {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();

		AdvancedArithmetic myCalculator = new DivisorCalculator();
		int sum = myCalculator.divisorSum(n);
		System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
		System.out.println(sum);
	}
}
