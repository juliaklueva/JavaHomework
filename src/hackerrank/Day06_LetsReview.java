package hackerrank;

import java.util.Scanner;

public class Day06_LetsReview {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int countCases = Integer.parseInt(in.nextLine());

		for (int i = 0; i < countCases; i++) {

			String value = in.nextLine();
			String odd = "";
			String even = "";

			for (int j = 0; j < value.length(); j++) {
				if (j % 2 == 0) {
					even += value.charAt(j);
				} else {
					odd += value.charAt(j);
				}
			}
			System.out.println(even + " " + odd);
		}
		in.close();

	}
}
