package home170707;

import java.util.Arrays;

public class StringArrayList {

	static final int DEFAULT_SIZE = 2;

	String[] elements = new String[DEFAULT_SIZE];

	int size = 0;

	public void add(String string) {

		if (size == elements.length) {
			elements = Arrays.copyOf(elements, elements.length * 2);
		}

		elements[size++] = string;
	}

	@Override
	public String toString() {
		if (isEmpty()) {
			return "[]";
		}
		StringBuilder sb = new StringBuilder("[");
		for (String s : elements) {
			if (s != null) {
				sb.append(s).append(", ");
			}
		}

		sb.delete(sb.length() - 2, sb.length());
		sb.append("]");
		return sb.toString();
	}

	public void remove(int i) {
		if (i >= size || i < 0) {
			return;
		}

		System.arraycopy(elements, i + 1, elements, i, --size - i);
		elements[size] = null;
	}

	public String get(int i) {
		if (i >= size || i < 0) {
			return null;
		}
		return elements[i];
	}

	public void set(int i, String value) {
		elements[i] = value;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public boolean remove(String value) {
		for (int i = 0; i < elements.length; i++) {
			if (value.equals(elements[i])) {
				System.arraycopy(elements, i + 1, elements, i, --size - i);
				elements[size] = null;
				return true;
			}
		}
		return false;
	}
}
