package com.dhakre.rohit.list.singly;

class LinkedList {

	Node head;

	void addNode(int val) {
		Node newNode = new Node(val);
		Node temp = head;
		if (head == null) {
			head = newNode;
			return;
		}
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}

	void addNodeAtFirst(int val) {
		Node newNode = new Node(val);
		newNode.next = head;
		head = newNode;

	}

	void addNodeAfterNode(int num, int val) {
		if (num <= 0) {
			System.out.println("Can't add : Out of bound");
			return;
		}
		Node newNode = new Node(val);
		Node temp = head;
		Node prev = null;
		try {
			while (num > 0) {
				prev = temp;
				temp = temp.next;
				num--;
			}
			newNode.next = temp;
			prev.next = newNode;
		} catch (NullPointerException n) {
			System.out.println("Can't add : Out of bound");
		}
	}

	void deleteLastNode() {
		Node temp = head;
		Node prev = null;
		while (temp.next != null) {
			prev = temp;
			temp = temp.next;
		}
		prev.next = null;
	}

	void deleteNodeAfterNode(int num) {
		Node temp = head;
		Node prev = null;
		if (num < 0) {
			System.out.println("Can't delete : Out of bound");
			return;
		}
		if (num == 0) {
			head = temp.next;
			temp.next = null;
		}
		try {
			while (num > 0) {
				prev = temp;
				temp = temp.next;
				num--;
			}
			prev.next = temp.next;
			temp.next = null;
		} catch (NullPointerException n) {
			System.out.println("Can't delete : Out of bound");
		}
	}

	void deleteFirstNode() {
		if (head == null) {
			return;
		}
		Node temp = head;
		head = temp.next;
		temp.next = null;
	}

	void reverseList() {
		if (head == null) {
			System.out.println("Can't reverse : minimum 1 element needed");
			return;
		}
		Node currNode = head;
		Node prevNode = null;
		Node nextNode = null;
		while (currNode != null) {
			nextNode = currNode.next;
			currNode.next = prevNode;
			prevNode = currNode;
			currNode = nextNode;
		}
		head = prevNode;
	}

	void sortList() {
		Node start = head;
		Node after = null;
		Node prev = null;
		Node temp = null;
		Node end = null;
		boolean status = true;
		boolean setEnd = false;

		while (start.next != null) {
			boolean setPrev = false;
			temp = start.next;
			prev = null;
			after = start;
			while (temp != null) {
				if (temp.data < start.data) {
					start.next = temp.next;
					temp.next = after;
					if (setEnd == true) {
						end.next = temp;
					}
					if (setPrev == true) {
						prev.next = start;
					}
					prev = start;
					start = temp;
					temp = prev.next;
					after = start.next;
					setPrev = true;
				} else {
					after = start.next;
					prev = temp;
					temp = temp.next;
					setPrev = true;
				}
			}
			if (status == true) {
				head = start;
				status = false;
			}
			setEnd = true;
			end = start;
			start = start.next;
		}
	}

	void addSortedNode(int val) {
		Node newNode = new Node(val);
		if (head == null) {
			head = newNode;
			return;
		}
		Node temp = head;
		Node prev = null;
		while (temp != null) {
			if (temp.data >= newNode.data) {
				if (prev == null) {
					newNode.next = temp;
					head = newNode;
					return;
				}
				newNode.next = temp;
				prev.next = newNode;
				return;
			} else {
				prev = temp;
				temp = temp.next;
			}
		}
		prev.next = newNode;
	}

	void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	int countSize() {
		int count = 0;
		Node temp = head;
		while (temp != null) {
			temp = temp.next;
			count++;
		}
		return count;
	}

}