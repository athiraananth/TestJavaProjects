package binarySearch;

public class BinarySearchTreeImplementation {

	class Node {
		int key;
		Node left, right;

		public Node(int data) {
			key = data;
			left = null;
			right = null;
		}
	}

	Node root;

	public void insert(int value) {
		root = insertNodes(root, value);
	}

	public Node insertNodes(Node root, int value) {

		if (root == null) {
			root = new Node(value);
			return root;
		}
		if (value < root.key) {
			root.left = insertNodes(root.left, value);
		}

		root.right = insertNodes(root.right, value);

		return root;
	}

	public void traverseBT() {
		treeTraversal(root);
	}

	public void treeTraversal(Node root) {
		if (root == null) {
			return;
		}

		treeTraversal(root.left);
		System.out.println(root.key);
		treeTraversal(root.right);

	}

	public boolean search(int item) {
		boolean found = searchBT(root, item);
		return found;
	}

	public boolean searchBT(Node root, int value) {

		boolean flag = false;

		if (root == null) {
			return false;
		}
		if (root.key == value) {
			return true;
		} else if (value < root.key) {
			return searchBT(root.left, value);
		} else if (value > root.key) {
			return searchBT(root.right, value);
		}
		String s = "abc";

		return flag;

	}

}
