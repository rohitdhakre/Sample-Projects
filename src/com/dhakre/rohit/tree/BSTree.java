package com.dhakre.rohit.tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BSTree {

	private Node root;
	private boolean check;

	/*
	 * public void addNode(int value) { Node newNode = new Node(value); if (root
	 * == null) { root = newNode; return; } Node trav = root; while (true) { if
	 * (value <= trav.data) { if (trav.left != null) { trav = trav.left; } else
	 * { trav.left = newNode; return; } } else { if (trav.right != null) { trav
	 * = trav.right; } else { trav.right = newNode; return; } } } }
	 */

	public void addNode(int value) {
		root = add(root, value);
	}

	// called by addNode
	private Node add(Node root, int value) {
		if (root == null) {
			return new Node(value);
		}
		if (value <= root.data) {
			root.left = add(root.left, value);
		} else {
			root.right = add(root.right, value);
		}
		return root;
	}

	public void isContains(int value) {
		System.out.println("Is Tree Contains - " + value + " :" + contains(root, value));
	}

	private boolean contains(Node root, int value) {
		while (true) {
			if (root == null) {
				return false;
			} else if (root.data == value) {
				return true;
			}
			if (value <= root.data) {
				root = root.left;
			} else {
				root = root.right;
			}
		}
	}

	public void preOrderTrav() {
		System.out.print("Pre-Order : ");
		preOrder(root);
		System.out.println();
	}

	private void preOrder(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + "->");
		preOrder(root.left);
		preOrder(root.right);
	}

	public void inOrderTrav() {
		System.out.print("In-Order : ");
		inOrder(root);
		System.out.println();
	}

	private void inOrder(Node root) {
		if (root == null) {
			return;
		}
		inOrder(root.left);
		System.out.print(root.data + "->");
		inOrder(root.right);
	}

	public void postOrderTrav() {
		System.out.print("Post-Order : ");
		postOrder(root);
		System.out.println();
	}

	private void postOrder(Node root) {
		if (root == null) {
			return;
		}
		postOrder(root.left);
		postOrder(root.right);
		System.out.print(root.data + "->");
	}

	public void levelOrder() {
		System.out.print("Level-Order : ");
		int height = height(root);
		for (int i = 0; i <= height; i++) {
			printLevelOrder(root, i);
		}
		System.out.println();
	}

	private void printLevelOrder(Node root, int level) {
		if (root == null) {
			return;
		}
		if (level == 0) {
			System.out.print(root.data + "->");
		} else if (level > 0) {
			printLevelOrder(root.left, level - 1);
			printLevelOrder(root.right, level - 1);
		}
	}

	public void levelOrderQueue() {
		System.out.print("Level-Order Queue : ");
		if (root == null) {
			return;
		}
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while (!queue.isEmpty()) {
			Node temp = queue.poll();
			System.out.print(temp.data + "->");
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
		System.out.print("Level-Order List : ");
		if (root == null) {
			return;
		}
		List<Node> list = new LinkedList<>();
		list.add(root);
		while (!list.isEmpty()) {
			Node temp = list.remove(0);
			System.out.print(temp.data + "->");
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
		System.out.print("Reverse Level-Order : ");
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
			System.out.print(root.data + "->");
		}
		reverseLevelOrderTrav(root.left, level - 1);
		reverseLevelOrderTrav(root.right, level - 1);
	}

	public void getHeight() {
		System.out.println("Height : " + height(root));
	}

	// called by getHeight
	private int height(Node root) {
		if (root == null) {
			return 0;
		}
		return 1 + max(height(root.left), height(root.right));
	}

	// called by height
	private int max(int left, int right) {
		if (left > right) {
			return left;
		} else {
			return right;
		}
	}

	// int getHeight() {
	// if (root == null) {
	// return 0;
	// }
	// Node temp = root;
	// return getHeight(temp, 0, 0);
	// }
	//
	// int getHeight(Node temp, int leftHeight, int rightHeight) {
	// if (temp.left != null) {
	// leftHeight++;
	// getHeight(temp.left, leftHeight, rightHeight);
	// }
	// if (temp.right != null) {
	// rightHeight++;
	// getHeight(temp.right, leftHeight, rightHeight);
	// }
	// if (leftHeight > rightHeight) {
	// return 1 + leftHeight;
	// }
	// else {
	// return 1 + rightHeight;
	// }
	// }

	public void deleteNode(int value) {
		Node prev = null;
		Node trav = root;
		Node mark = null;
		Node temp = null;
		if (root == null) {
			System.out.println("Empty tree");
			return;
		}
		while (true) {
			if (value < trav.data) {
				prev = trav;
				trav = trav.left;
			} else if (trav.data < value) {
				prev = trav;
				trav = trav.right;
			} else {
				if (trav.left == null && trav.right == null) {
					if (prev.data < trav.data) {
						prev.right = null;
					} else {
						prev.left = null;
					}
					return;
				} else if (trav.left != null && trav.right != null) {
					mark = trav;
					trav = trav.left;
					while (trav.right != null) {
						temp = trav;
						trav = trav.right;
					}
					mark.data = trav.data;
					if (temp == null) {
						if (trav.left != null) {
							mark.left = trav.left;
							trav.left = null;
						} else {
							mark.left = null;
						}
					} else {
						if (trav.left != null) {
							temp.right = trav.left;
							trav.left = null;
						} else {
							temp.right = null;
						}
					}
					return;
				} else {
					if (trav.left == null) {
						if (prev.data < trav.data) {
							prev.right = trav.right;
						} else {
							prev.left = trav.right;
						}
						trav.right = null;
						return;
					} else {
						if (prev.data < trav.data) {
							prev.right = trav.left;
						} else {
							prev.left = trav.left;
						}
						trav.left = null;
						return;
					}
				}
			}
		}
	}

	public void leftView() {
		System.out.print("Left View : ");
		int height = height(root);
		for (int i = 0; i < height; i++) {
			check = true;
			printLeftView(root, i);
		}
		System.out.println();
	}

	private void printLeftView(Node root, int level) {
		if (root == null) {
			return;
		}
		if (level == 0 && check == true) {
			System.out.print(root.data + "->");
			check = false;
		}
		printLeftView(root.left, level - 1);
		printLeftView(root.right, level - 1);
	}

	public void rightView() {
		System.out.print("Right View : ");
		int height = height(root);
		for (int i = 0; i < height; i++) {
			check = true;
			printRightView(root, i);
		}
		System.out.println();
	}

	private void printRightView(Node root, int level) {
		if (root == null) {
			return;
		}
		if (level == 0 && check == true) {
			System.out.print(root.data + "->");
			check = false;
		}
		printRightView(root.right, level - 1);
		printRightView(root.left, level - 1);
	}

	public void topView() {
		System.out.print("Top-View : ");
		leftView(root);
		rightView(root.right);
		System.out.println();
	}

	// called by topView
	private void leftView(Node root) {
		if (root == null) {
			return;
		}
		leftView(root.left);
		System.out.print(root.data + "->");
	}

	// called by topView
	private void rightView(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + "->");
		rightView(root.right);
	}

}