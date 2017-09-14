package home170707;

import testframework.Asserts;

public class UseStringStack {

	public static void main(String[] args) {

		StringArrayList list = new StringArrayList();
		list.add("one");
		System.out.println(Asserts.assertEquals(list.toString(), "[one]"));
		list.add("two");
		list.add("three");
		System.out.println(Asserts.assertEquals(list.toString(), "[one, two, three]"));

		System.out.println(list.toString());

		list.set(1, "four");
		list.set(2, "five");
		System.out.println(Asserts.assertEquals(list.toString(), "[one, four, five]"));
		System.out.println(list.toString());

		System.out.println(Asserts.assertEquals(list.get(0), "one"));

		list.remove(2);
		System.out.println(Asserts.assertEquals(list.toString(), "[one, four]"));
		System.out.println(list.toString());

		list.remove("one");
		list.remove("four");
		System.out.println(Asserts.assertEquals(list.toString(), "[]"));
		System.out.println(list.toString());

		System.out.println(Asserts.assertEquals(list.isEmpty(), true));
	}

}
