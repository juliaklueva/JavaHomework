package hackerrank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day08_DictionariesAndMaps {
	public static void main(String[] argh) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<String, Integer> dictionary = new HashMap<>();
		for (int i = 0; i < n; i++) {
			String name = in.next();
			int phone = in.nextInt();
			// Write code here
			dictionary.put(name, phone);
		}
		while (in.hasNext()) {
			String name = in.next();
			// Write code here
			if (dictionary.containsKey(name)) {
				System.out.println(name + "=" + dictionary.get(name));
			} else {
				System.out.println("Not found");
			}
		}
		in.close();
	}
}
