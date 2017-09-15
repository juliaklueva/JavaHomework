package home170630;

import java.util.Hashtable;

public class GenomeHashTable {
	private static final int GENOME_SIZE = 300000;
	private static final int WORD_SIZE = 4;

	public static void wordFind(byte[] data) {

		Hashtable<String, Integer> repeatedWords = new Hashtable<>();

		for (int i = 0; i < data.length - WORD_SIZE + 1; i++) {
			StringBuilder sb = new StringBuilder();

			for (int j = 0; j < WORD_SIZE; j++) {
				sb.append((char) data[i + j]);
			}
			String wordToFind = sb.toString();
			if (repeatedWords.containsKey(wordToFind)) {
				int count = repeatedWords.get(wordToFind);
				count++;
				repeatedWords.put(wordToFind, count);
			} else {
				repeatedWords.put(wordToFind, 1);
			}
		}

		System.out.println(repeatedWords.size());

		String[] array = repeatedWords.toString().split(", ");
		for (String s : array) {
			System.out.println(s);
		}
	}

	public static void main(String[] args) {
		byte[] data = GenomeGenerator.generate(GENOME_SIZE);

		wordFind(data);
	}
}
