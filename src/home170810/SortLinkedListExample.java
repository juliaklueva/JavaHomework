package home170810;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortLinkedListExample {

	public static void main(String[] args) {

		List<A> list = new LinkedList<>();

		for (int i = 0; i < Limit.LIMIT; i++) {
			list.add(new A());
		}
		Collections.sort(list);
		A a = new A();
		int contains = Collections.binarySearch(list, a);

	}
}
