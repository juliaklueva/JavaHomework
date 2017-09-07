
package hackerrank;

import java.util.Scanner;

public class Day26_NestedLogic {

	static final int DAY_FINE = 15;
	static final int MONTH_FINE = 500;
	static final int YEAR_FINE = 10000;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int actualDay = sc.nextInt();
		int actualMonth = sc.nextInt();
		int actualYear = sc.nextInt();

		int expectedDay = sc.nextInt();
		int expectedMonth = sc.nextInt();
		int expectedYear = sc.nextInt();

		sc.close();

		int fine = 0;

		if (actualYear == expectedYear) {
			if (actualMonth == expectedMonth) {
				fine = actualDay <= expectedDay ? 0 : DAY_FINE * (actualDay - expectedDay);
			} else {
				fine = actualMonth < expectedMonth ? 0 : MONTH_FINE * (actualMonth - expectedMonth);
			}
		} else {
			fine = actualYear < expectedYear ? 0 : YEAR_FINE;
		}

		System.out.println(fine);

	}
}
