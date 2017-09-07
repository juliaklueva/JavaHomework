package home170620.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Day10_BinaryNumbers {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.close();

		String binary = Integer.toBinaryString(n);
		ArrayList<Integer> max = new ArrayList<>();
		int counter = 1;

		for (int i = 0; i < binary.length() - 1; i++) {

			if (binary.charAt(i) == '1' && binary.charAt(i + 1) == '1') {
				counter++;
				max.add(counter);
			} else {
				max.add(counter);
				counter = 1;
			}

		}

		System.out.println(Collections.max(max));
	}
}
