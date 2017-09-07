package hackerrank;

import java.util.Scanner;

public class Day29_BitwiseAND {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT
		 */
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		for (int i = 0; i < input; i++) {
			int n = sc.nextInt();
			int k = sc.nextInt();

			int max = 0;
			for (int j = 1; j < n; j++) {
				for (int m = j + 1; m <= n; m++) {
					if ((j & m) < k && (j & m) > max) {
						max = j & m;
					}
				}
			}
			System.out.println(max);
		}
		sc.close();
	}
}
