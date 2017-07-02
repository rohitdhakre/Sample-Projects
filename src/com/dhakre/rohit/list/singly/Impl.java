package com.dhakre.rohit.list.singly;

class Impl {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.addNode(50);
		l.addNode(30);
		l.addNode(10);
		l.addNode(20);
		l.addNode(40);
		l.sortList();
		l.reverseList();
		l.printList();
	}

}