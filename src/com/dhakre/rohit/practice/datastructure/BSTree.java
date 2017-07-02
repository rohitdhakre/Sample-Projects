package com.dhakre.rohit.practice.datastructure;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BSTree {

	private Node root;
	boolean check = true;

	/*
	 * public void addNode(int data) { Node newNode = new Node(data); if (root
	 * == null) { root = newNode; return; } Node trav = root; while (true) { if
	 * (data <= trav.data) { if (trav.left == null) { trav.left = newNode;
	 * return; } else { trav = trav.left; } } else { if (trav.right == null) {
	 * trav.right = newNode; return; } else { trav = trav.right; } } } }
	 */

	public void addNode(int data) {
		root = add(root, data);
	}

	private Node add(Node root, int data) {
		if (root == null) {
			return new Node(data);
		}
		if (data <= root.data) {
			root.left = add(root.left, data);
		} else {
			root.right = add(root.right, data);
		}
		return root;
	}

	public void preOrder() {
		System.out.print("Pre-Order: ");
		preOrderTrav(root);
		System.out.println();
	}

	private void preOrderTrav(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " -> ");
		preOrderTrav(root.left);
		preOrderTrav(root.right);
	}

	public void inOrder() {
		System.out.print("In-Order: ");
		inOrderTrav(root);
		System.out.println();
	}

	private void inOrderTrav(Node root) {
		if (root == null) {
			return;
		}
		inOrderTrav(root.left);
		System.out.print(root.data + " -> ");
		inOrderTrav(root.right);
	}

	public void postOrder() {
		System.out.print("Post-Order: ");
		postOrderTrav(root);
		System.out.println();
	}

	private void postOrderTrav(Node root) {
		if (root == null) {
			return;
		}
		postOrderTrav(root.left);
		postOrderTrav(root.right);
		System.out.print(root.data + " -> ");
	}

	public void isContains(int data) {
		System.out.println(contains(root, data));
	}

	private boolean contains(Node root, int data) {
		boolean check = false;
		if (root == null) {
			return false;
		}
		if (data == root.data) {
			return true;
		}
		if (data < root.data) {
			check = contains(root.left, data);
		} else if (data > root.data) {
			check = contains(root.right, data);
		}
		return check;
	}

	public void getHeight() {
		System.out.println("Height of the tree: " + height(root));
	}

	private int height(Node root) {
		if (root == null) {
			return 0;
		}
		return (1 + Math.max(height(root.left), height(root.right)));
	}

	public void levelOrder() {
		System.out.print("Level-Order: ");
		int height = height(root);
		for (int i = 0; i < height; i++) {
			levelOrderTrav(root, i);
		}
		System.out.println();
	}

	private void levelOrderTrav(Node root, int level) {
		if (root == null) {
			return;
		}
		if (level == 0) {
			System.out.print(root.data + " -> ");
			return;
		}
		levelOrderTrav(root.left, level - 1);
		levelOrderTrav(root.right, level - 1);
	}

	public void levelOrderQueue() {
		System.out.print("Level-Order Queue: ");
		if (root == null) {
			return;
		}
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node temp = queue.poll();
			System.out.print(temp.data + " -> ");
			if (temp.left != null) {
				queue.add(temp.left);
			}
			if (temp.right != null) {
				queue.add(temp.right);
			}
		}
		System.out.println();
	}

	public void levelOrderList() {
		System.out.print("Level-Order List: ");
		if (root == null) {
			return;
		}
		List<Node> list = new LinkedList<>();
		list.add(root);
		while (!list.isEmpty()) {
			Node temp = list.remove(0);
			System.out.print(temp.data + " -> ");
			if (temp.left != null) {
				list.add(temp.left);
			}
			if (temp.right != null) {
				list.add(temp.right);
			}
		}
		System.out.println();
	}

	public void reverseLevelOrder() {
		System.out.print("Reverse Level-Order: ");
		int height = height(root);
		for (int i = height - 1; i >= 0; i--) {
			reverseLevelOrderTrav(root, i);
		}
		System.out.println();
	}

	private void reverseLevelOrderTrav(Node root, int level) {
		if (root == null) {
			return;
		}
		if (level == 0) {
			System.out.print(root.data + " -> ");
		}
		reverseLevelOrderTrav(root.left, level - 1);
		reverseLevelOrderTrav(root.right, level - 1);
	}

	// By using global boolean variable
	public void leftView() {
		System.out.print("Left View: ");
		int height = height(root);
		for (int i = 0; i < height; i++) {
			check = true;
			leftViewTrav(root, i);
		}
		System.out.println();
	}

	private void leftViewTrav(Node root, int level) {
		if (root == null) {
			return;
		}
		if (level == 0 && check == true) {
			System.out.print(root.data + " -> ");
			check = false;
			return;
		}
		leftViewTrav(root.left, level - 1);
		leftViewTrav(root.right, level - 1);
	}

	// By using global boolean variable
	public void rightView() {
		System.out.print("Right View: ");
		int height = height(root);
		for (int i = 0; i < height; i++) {
			check = true;
			rightViewTrav(root, i);
		}
		System.out.println();
	}

	private void rightViewTrav(Node root, int level) {
		if (root == null) {
			return;
		}
		if (level == 0 && check == true) {
			System.out.print(root.data + " -> ");
			check = false;
			return;
		}
		rightViewTrav(root.right, level - 1);
		rightViewTrav(root.left, level - 1);
	}

	public void topView() {
		System.out.print("Top View: ");
		leftTopView(root);
		rightTopView(root.right);
		System.out.println();
	}

	private void leftTopView(Node root) {
		if (root == null) {
			return;
		}
		leftTopView(root.left);
		System.out.print(root.data + " -> ");
	}

	private void rightTopView(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " -> ");
		rightTopView(root.right);
	}

}