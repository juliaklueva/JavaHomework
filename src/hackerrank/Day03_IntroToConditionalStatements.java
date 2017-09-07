package home170620.hackerrank;

import java.util.Scanner;

public class Day03_IntroToConditionalStatements {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.close();
		String ans = "";

		// if 'n' is NOT evenly divisible by 2 (i.e.: n is odd)
		if (n % 2 == 1 || (n >= 6 && n <= 20)) {
			ans = "Weird";
		} else {
			if (n <= 5 && n >= 2 || n > 20) {
				ans = "Not Weird";
			}
		}
		System.out.println(ans);
	}
}
