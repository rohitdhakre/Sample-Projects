package com.dhakre.rohit.practice.datastructure;

public class Impl {

	public static void main(String[] args) {
		BSTree b = new BSTree();
		b.addNode(5);
		b.addNode(9);
		b.addNode(-1);
		b.addNode(7);
		b.addNode(3);
		b.addNode(1);
		b.addNode(2);
		b.addNode(11);
		b.preOrder();
		b.inOrder();
		b.postOrder();
		b.isContains(11);
		b.getHeight();
		b.levelOrder();
		b.levelOrderQueue();
		b.levelOrderList();
		b.reverseLevelOrder();
		b.leftView();
		b.rightView();
		b.topView();
	}

}
