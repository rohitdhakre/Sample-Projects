package com.dhakre.rohit.list.doubly;

public class LinkedList {

	Node head;

	void addNode(int val) {
		Node temp = head;
		Node newNode = new Node(val);
		if (head == null) {
			head = newNode;
			return;
		}
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
		newNode.prev = temp;
	}

	void addNodeAtFirst(int val) {
		Node temp = head;
		Node newNode = new Node(val);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = temp;
		temp.prev = newNode;
		head = newNode;
	}

	void addNodeAfterStart(int num, int val) {
		Node temp = head;
		Node prev = null;
		Node newNode = new Node(val);
		if (num == 0) {
			newNode.next = temp;
			temp.prev = newNode;
			head = newNode;
			return;
		}
		try {
			while (num > 0) {
				prev = temp;
				temp = temp.next;
				num--;
			}
			if (temp == null && prev != null) {
				prev.next = newNode;
				newNode.prev = prev;
				return;
			}
			prev.next = newNode;
			newNode.prev = prev;
			newNode.next = temp;
			temp.prev = newNode;
		} catch (NullPointerException e) {
			System.out.println("Can't Perform - Out of Bound");
			return;
		}
	}

	void addNodeBeforeEnd(int num, int val) {
		Node end = null;
		Node temp = head;
		Node prev = null;
		Node newNode = new Node(val);
		while (temp != null) {
			end = temp;
			temp = temp.next;
		}
		if (num == 0) {
			end.next = newNode;
			newNode.prev = end;
			return;
		}
		try {
			while (num > 0) {
				prev = end;
				end = end.prev;
				num--;
			}
			if (end == null && prev != null) {
				prev.prev = newNode;
				newNode.next = prev;
				head = newNode;
				return;
			}
			prev.prev = newNode;
			newNode.next = prev;
			newNode.prev = end;
			end.next = newNode;
		} catch (NullPointerException e) {
			System.out.println("Can't Perform - Out of Bound");
			return;
		}
	}

	void addSortedNode(int val) {
		Node temp = head;
		Node prev = null;
		Node newNode = new Node(val);
		if (head == null) {
			head = newNode;
			return;
		}
		while (temp != null) {
			if (newNode.data < temp.data) {
				if (prev == null) {
					temp.prev = newNode;
					newNode.next = temp;
					head = newNode;
					return;
				}
				prev.next = newNode;
				newNode.prev = prev;
				temp.prev = newNode;
				newNode.next = temp;
				return;
			} else {
				prev = temp;
				temp = temp.next;
			}
		}
		prev.next = newNode;
		newNode.prev = prev;
	}

	void deleteLastNode() {
		Node temp = head;
		Node end = null;
		try {
			if (head.next == null) {
				head = null;
				return;
			}
			while (temp != null) {
				end = temp;
				temp = temp.next;
			}
			end.prev.next = null;
		} catch (NullPointerException e) {
			System.out.println("Nothing to Delete");
		}
	}

	void deleteFirstNode() {
		Node temp = head;
		try {
			head = temp.next;
			temp.next = null;
		} catch (NullPointerException e) {
			System.out.println("Nothing to Delete");
		}
	}

	void deleteNodeAfterStart(int num) {
		Node temp = head;
		Node prev = null;
		if (num == 0) {
			head = temp.next;
			head.prev = null;
			return;
		}
		try {
			while (num > 0) {
				prev = temp;
				temp = temp.next;
				num--;
			}
			if (temp.next == null) {
				prev.next = null;
				return;
			}
			prev.next = temp.next;
			temp.next.prev = prev;
		} catch (NullPointerException e) {
			System.out.println("Can't Delete - Out of Bound");
		}
	}

	void deleteNodeBeforeEnd(int num) {
		Node temp = head;
		Node prev = null;
		Node end = null;
		while (temp != null) {
			end = temp;
			temp = temp.next;
		}
		if (num == 0) {
			prev = end.prev;
			prev.next = null;
			return;
		}
		try {
			while (num > 0) {
				prev = end;
				end = end.prev;
				num--;
			}
			if (end.prev == null) {
				prev.prev = null;
				head = prev;
				return;
			}
			end.prev.next = prev;
			prev.prev = end.prev;
		} catch (NullPointerException e) {
			System.out.println("Can't Delete - Out of Bound");
		}
	}

	void reverseList() {
		Node next = null;
		if (head == null || head.next == null) {
			return;
		}
		Node temp = head.next;
		while (temp.next != null) {
			next = temp.next;
			temp.prev.next = temp.next;
			temp.next.prev = temp.prev;
			temp.next = head;
			head.prev = temp;
			temp.prev = null;
			head = temp;
			temp = next;
		}
		temp.next = head;
		head.prev = temp;
		temp.prev.next = null;
		temp.prev = null;
		head = temp;
	}

	void sortList() {
		Node temp = null;
		@SuppressWarnings("unused")
		Node prev = null;
		Node start = head;
		boolean status = true;
		if (head == null || head.next == null) {
			return;
		}
		while (start != null) {
			temp = start.next;
			while (temp != null) {
				if (temp.data < start.data) {
					start.next = temp.next;
					temp.next.prev = start;
					temp.next = start;
					temp.prev = start.prev;
					start.prev = temp;
					start = temp;
					prev = temp;
					temp = temp.next;
				} else {
					prev = temp;
					temp = temp.next;
				}
			}
			if (status == true) {
				head = start;
				status = false;
			}
			start = start.next;
		}
	}

	void countSize() {
		Node temp = head;
		int count = 0;
		while (temp != null) {
			temp = temp.next;
			count++;
		}
		System.out.println("Size of List - " + count);
	}

	void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

}