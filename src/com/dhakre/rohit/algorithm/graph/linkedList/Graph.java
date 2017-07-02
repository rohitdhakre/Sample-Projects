package com.dhakre.rohit.algorithm.graph.linkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {

	LinkedList<Node>[] list;

	@SuppressWarnings("unchecked")
	public Graph(int size) {
		super();
		list = new LinkedList[size];
		for (int i = 0; i < size; i++) {
			list[i] = new LinkedList<Node>();
		}
	}

	public void addNode(int u, int v, int weight) {
		list[u].addFirst(new Node(v, weight));
	}

	public void printGraph() {
		for (int i = 0; i < list.length; i++) {
			Iterator<Node> itr = list[i].iterator();
			System.out.print(i);
			while (itr.hasNext()) {
				System.out.print("-> " + itr.next());
			}
			System.out.println();
		}
	}

}
