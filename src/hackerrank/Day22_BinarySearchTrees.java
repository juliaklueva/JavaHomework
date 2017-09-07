package hackerrank;

import java.util.Scanner;

class Node_ {
	Node_ left, right;
	int data;

	Node_(int data) {
		this.data = data;
		left = right = null;
	}
}

public class Day22_BinarySearchTrees {

	public static int getHeight(Node_ root) {
		// Write your code here
		if (root == null) {
			return -1;
		}
		return Math.max(getHeight(root.left), getHeight(root.right)) + 1;
	}

	public static Node_ insert(Node_ root, int data) {
		if (root == null) {
			return new Node_(data);
		} else {
			Node_ cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Node_ root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		int height = getHeight(root);
		System.out.println(height);
		sc.close();
	}

}
