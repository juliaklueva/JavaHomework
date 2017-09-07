package hackerrank;

import java.util.Scanner;

class MyNode {
	int data;
	MyNode next;

	MyNode(int d) {
		data = d;
		next = null;
	}

}

public class Day24_MoreLinkedLists {

	public static MyNode removeDuplicates(MyNode head) {
		// Write your code here
		MyNode previous = head;
		MyNode current = head.next;

		while (current != null) {
			if (previous.data == current.data) {
				previous.next = current.next;
				current = previous.next;
				continue;
			}
			previous = previous.next;
			current = current.next;
		}
		return head;

	}

	public static MyNode insert(MyNode head, int data) {
		MyNode p = new MyNode(data);
		if (head == null) {
			head = p;
		} else if (head.next == null) {
			head.next = p;
		} else {
			MyNode start = head;
			while (start.next != null) {
				start = start.next;
			}
			start.next = p;

		}
		return head;
	}

	public static void display(MyNode head) {
		MyNode start = head;
		while (start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		MyNode head = null;
		int T = sc.nextInt();
		sc.close();
		while (T-- > 0) {
			int ele = sc.nextInt();
			head = insert(head, ele);
		}
		head = removeDuplicates(head);
		display(head);

	}
}
