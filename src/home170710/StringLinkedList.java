package home170710;

public class StringLinkedList {

	Node first;
	Node last;
	int size;

	public void add(String value) {
		Node node = new Node(value, null);

		if (first == null) {
			first = node;
		} else {
			last.next = node;
		}
		last = node;
		size++;
	}

	public boolean remove(String value) {

		boolean result = false;
		Node current = first;
		Node prev = null;

		while (current != null) {
			if (current.value.equals(value)) {
				if (prev == null) {
					first = current.next;
				} else {
					prev.next = current.next;
				}
				size--;
				result = true;
				break;
			}
			prev = current;
			current = current.next;
		}

		if (first == null) {
			last = null;
		}

		return result;
	}

	public String remove(int index) {

		if (index > size || index < 0 || first == null) {
			return null;
		}

		String result = null;

		if (index == 0) {
			result = first.value;
			first = first.next;
		}

		Node current = first;
		int i = 0;
		while (current != null) {
			if (i == index - 1) {
				if (index == size - 1) {
					current.next = null;
					last = current;
				} else {
					result = current.next.value;
					current.next = current.next.next;
				}
				break;
			}
			i++;
			current = current.next;
		}
		size--;
		return result;
	}

	@Override
	public String toString() {
		// traverse

		StringBuilder result = new StringBuilder();

		result.append("[");

		if (first != null) {
			result.append(first.value);

			Node current = first.next;

			while (current != null) {
				result.append(", ").append(current.value);
				current = current.next;
			}
		}
		result.append("]");
		return result.toString();
	}
}
