package com.dhakre.rohit.list.doubly;

public class Impl {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
/*		l.addNode(10);
		l.addNode(20);
		l.addNodeAtFirst(35);
		l.addNode(5);
		l.addNode(13);
		l.addNodeAtFirst(90);
		l.addNodeAfterStart(3, 100);
		l.addNodeBeforeEnd(3, 99);
		l.deleteNodeBeforeEnd(5);*/
		l.addSortedNode(20);
		l.addSortedNode(10);
		l.addSortedNode(12);
		l.addSortedNode(22);
		l.addSortedNode(6);
		l.addSortedNode(15);
		l.addSortedNode(100);
		l.reverseList();
		l.printList();
		//l.countSize();
	}

}
