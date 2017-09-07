package hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Day28_RegExPatternsAndIntroToDatabases {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 */
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		ArrayList<String> names = new ArrayList<>();

		for (int i = 0; i < N; i++) {
			String firstName = sc.next();
			String emailID = sc.next();

			if (emailID.contains("@gmail.com")) {
				names.add(firstName);
			}
		}
		Collections.sort(names);
		for (String name : names) {
			System.out.println(name);
		}
		sc.close();
	}
}
