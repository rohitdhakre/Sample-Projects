package com.dhakre.rohit.tree;

public class Impl {

	public static void main(String[] args) {
		BSTree b = new BSTree();
		b.addNode(35);
		b.addNode(10);
		b.addNode(25);
		b.addNode(40);
		b.addNode(45);
		b.addNode(15);
		b.addNode(20);
		b.addNode(35);
		b.addNode(35);
		// b.deleteNode(35);
		// b.deleteNode(35);
		b.preOrderTrav();
		b.inOrderTrav();
		b.postOrderTrav();
		b.getHeight();
		b.topView();
		b.isContains(15);
		b.levelOrder();
		b.levelOrderQueue();
		b.levelOrderList();
		b.reverseLevelOrder();
		b.leftView();
		b.topView();
		b.rightView();
	}

}
