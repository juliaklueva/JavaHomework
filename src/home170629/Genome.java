package home170629;

public class Genome {

	public static void main(String[] args) {

		byte[] data = GenomeGenerator.generate(300000);

		for (byte b : data) {
			System.out.print((char) b);
		}

		findDuplicates(data, 4);

	}

	private static void findDuplicates(byte[] data, int w) {
		int counter = 0;
		for (int i = 0; i < data.length - w; i++) {
			for (int j = i + 1; j < data.length - w + 1; j++) {
				boolean found = true;
				for (int k = 0; k < w; k++) {
					if (data[i + k] != data[j + k]) {
						found = false;
						break;
					}
				}
				if (found) {
					counter++;
				}
			}
		}
		System.out.println();
		System.out.println(counter);
	}

}
