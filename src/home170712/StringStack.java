package home170712;

import java.util.Arrays;

public class StringStack {
	private String[] elements;
	private int size;
	private static final int DEFAULT_MAX_SIZE = 3;

	public StringStack() {
		this(DEFAULT_MAX_SIZE);
	}

	public StringStack(int maxSize) {
		this.elements = new String[maxSize];
		this.size = 0;
	}

	public boolean push(String string) {
		if (size >= elements.length) {
			return false;
		}

		elements[size++] = string;
		return true;
	}

	@Override
	public String toString() {
		return Arrays.toString(Arrays.copyOfRange(elements, 0, size));

	}

	public String pop() {

		if (size <= 0) {
			return null;
		}

		String result = elements[--size];
		elements[size] = null;
		return result;

	}

	public String tos() {

		return size <= 0 ? null : elements[size - 1];

	}

	public int size() {
		return size;

	}
}
