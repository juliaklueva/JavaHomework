package home170710;

public class UseStringLinkedList {

	public static void main(String[] args) {

		StringLinkedList list = new StringLinkedList();
		list.add("one");
		list.add("two");
		list.add("three");
		System.out.println(list);

		System.out.println(list.remove("two"));
		System.out.println(list);

		list.add("One");
		System.out.println(list.remove("two"));
		System.out.println(list.remove("One"));
		System.out.println(list);

		list = new StringLinkedList();

		list.add("four");
		list.add("five");
		list.add("six");
		list.add("seven");
		System.out.println(list);

		System.out.println(list.remove(1));
		System.out.println(list);
		System.out.println(list.remove(0));
		System.out.println(list);
		System.out.println(list.remove(1));
		System.out.println(list.remove(0));
		System.out.println(list);
	}
}
