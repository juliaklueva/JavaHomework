package home170810;

public class BinarySearchAlgorithm {

	public static int myBinarySearch(int[] array, int key) {
		int lo = 0;
		int hi = array.length;
		int mid = 0;
		while (lo <= hi) {
			mid = lo + (hi - lo) / 2;
			if (key < array[mid]) {
				hi = mid - 1;
			} else if (key > array[mid]) {
				lo = mid + 1;
			} else {
				return mid;
			}
		}
		return -mid;
	}
}
