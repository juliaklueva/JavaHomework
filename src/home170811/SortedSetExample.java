package home170811;

import java.util.Set;
import java.util.TreeSet;

public class SortedSetExample {
	public static void main(String[] args) {

		Set<A> set = new TreeSet<>();

		for (int i = 0; i < Limit.LIMIT; i++) {
			set.add(new A());
		}

		System.out.println(set.toString());

		A a = new A();
		System.out.println(a);

		boolean contains = set.contains(a);

		System.out.println(contains);

	}
}
