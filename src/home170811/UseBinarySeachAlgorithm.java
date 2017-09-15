package home170811;

import java.util.Arrays;

public class UseBinarySeachAlgorithm {

	public static void main(String[] args) {
		int[] array = { 2, 4, 1, 7, 6, 8, 3 };
		Arrays.sort(array);
		System.out.println(BinarySearchAlgorithm.myBinarySearch(array, 6));
		System.out.println(BinarySearchAlgorithm.myBinarySearch(array, 5));
	}
}
