package hackerrank;

import java.util.Scanner;

public class Day16_ExceptionsStringToInteger {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();
		in.close();

		try {
			System.out.println(Integer.parseInt(S));
		} catch (NumberFormatException nfe) {
			System.out.println("Bad String");
		}
	}
}
