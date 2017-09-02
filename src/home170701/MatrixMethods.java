package home170701;

import java.util.Random;

public class MatrixMethods {

	static public int[][] initMatrix(int row, int col) {

		int[][] matrix = new int[row][col];
		return matrix;
	}

	static public int[][] setMatrix(int[][] matrix, int bound) {

		Random random = new Random();

		for (int i = 0; i < matrix.length; i++) {
			int[] row = matrix[i];
			for (int j = 0; j < row.length; j++)
				matrix[i][j] = random.nextInt(bound) - bound / 3;
		}
		return matrix;
	}

	static public void paintMatrix(int[][] matrix) {

		for (int i = 0; i < matrix.length; i++) {
			System.out.println();
			int[] row = matrix[i];
			for (int j = 0; j < row.length; j++)
				System.out.print(matrix[i][j] + " ");
		}

		System.out.println();
	}

	static public void countMatrix(int[][] matrix) {

		int sum = 0;
		OUTER: for (int i = 0; i < matrix.length; i++) {
			int[] row = matrix[i];
			for (int j = 0; j < row.length; j++) {

				if (row[j] >= 0)
					sum += row[j];

				else {

					System.out.println("Row " + i + " has negative number.");
					sum = 0;
					continue OUTER;
				}
			}
			System.out.println("Summ of " + i + " row = " + sum);
			sum = 0;

		}

	}
}
