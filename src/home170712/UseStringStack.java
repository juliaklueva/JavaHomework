package home170712;

import testframework.Asserts;

public class UseStringStack {

	public static void main(String[] args) {

		StringStack stack = new StringStack();
		System.out.println(stack);

		System.out.println(Asserts.assertEquals(stack.push("one"), true));
		System.out.println(Asserts.assertEquals(stack.push("two"), true));
		System.out.println(Asserts.assertEquals(stack.push("three"), true));
		System.out.println(stack);

		System.out.println(Asserts.assertEquals(stack.pop(), "three"));
		System.out.println(Asserts.assertEquals(stack.pop(), "two"));

		System.out.println(Asserts.assertEquals(stack.tos(), "one"));
		System.out.println(stack);

		System.out.println(Asserts.assertEquals(stack.size(), 1));

		System.out.println(Asserts.assertEquals(stack.pop(), "one"));
		System.out.println(Asserts.assertEquals(stack.size(), 0));
	}
}
