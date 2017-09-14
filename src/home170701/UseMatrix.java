package home170701;

public class UseMatrix {

	public static void main(String[] args) {

		int[][] matrix = MatrixMethods.initMatrix(4, 5);
		MatrixMethods.setMatrix(matrix, 20);
		MatrixMethods.paintMatrix(matrix);
		MatrixMethods.countMatrix(matrix);
		System.out.println();

		int[][] matrix2 = MatrixMethods.initMatrix(6, 5);
		MatrixMethods.setMatrix(matrix2, 30);
		MatrixMethods.paintMatrix(matrix2);
		MatrixMethods.countMatrix(matrix2);
		System.out.println();

		int[][] matrix3 = MatrixMethods.initMatrix(3, 5);
		MatrixMethods.setMatrix(matrix3, 40);
		MatrixMethods.paintMatrix(matrix3);
		MatrixMethods.countMatrix(matrix3);
		System.out.println();

	}

}
