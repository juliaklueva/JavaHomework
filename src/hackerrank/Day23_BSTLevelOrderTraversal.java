package hackerrank;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class _Node {
	_Node left, right;
	int data;

	_Node(int data) {
		this.data = data;
		left = right = null;
	}
}

public class Day23_BSTLevelOrderTraversal {

	static void levelOrder(_Node root) {
		// Write your code here
		// Write your code here
		Queue<_Node> queue = new LinkedList<_Node>();
		queue.add(root);

		while (!queue.isEmpty()) {
			_Node current = queue.remove();
			System.out.print(current.data + " ");
			if (current.left != null) {
				queue.add(current.left);
			}
			if (current.right != null) {
				queue.add(current.right);
			}
		}

	}

	public static _Node insert(_Node root, int data) {
		if (root == null) {
			return new _Node(data);
		} else {
			_Node cur;
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
		sc.close();
		_Node root = null;
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		levelOrder(root);
	}
}
