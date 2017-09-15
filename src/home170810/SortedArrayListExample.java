package home170810;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedArrayListExample {
	public static void main(String[] args) {

		List<A> list = new ArrayList<>();

		for (int i = 0; i < Limit.LIMIT; i++) {
			list.add(new A());
		}

		System.out.println(list);

		Collections.sort(list);

		System.out.println(list);

		A a = new A();
		System.out.println(a);

		int contains = Collections.binarySearch(list, a);
		System.out.println(contains);

	}

}
