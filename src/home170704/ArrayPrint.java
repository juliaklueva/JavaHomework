package home170704;

public class ArrayPrint {

	public static void main(String[] args) {

		int[] m = { 2, 3, 4, 5, 6, 7 };

		int[] m2 = {};

		int[] m3 = new int[10];

		double[] m4 = new double[10];

		String s[] = new String[3];

		arrayPrint(m);
		arrayPrint(m2);
		arrayPrint(m3);
		arrayPrint(m4);
		arrayPrint(s);

	}

	private static void arrayPrint(int[] matrix) {

		System.out.print("[");
		for (int i = 0; i < matrix.length; i++) {
			System.out.print(matrix[i]);
			if (i < matrix.length - 1)
				System.out.print(", ");
		}
		System.out.println("]");

	}

	private static void arrayPrint(double[] matrix) {

		System.out.print("[");
		for (int i = 0; i < matrix.length; i++) {
			System.out.print(matrix[i]);
			if (i < matrix.length - 1)
				System.out.print(", ");
		}
		System.out.println("]");

	}

	private static void arrayPrint(String[] matrix) {

		System.out.print("[");
		for (int i = 0; i < matrix.length; i++) {
			System.out.print(matrix[i]);
			if (i < matrix.length - 1)
				System.out.print(", ");
		}
		System.out.println("]");

	}

}
