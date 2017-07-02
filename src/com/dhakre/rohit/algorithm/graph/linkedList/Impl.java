package com.dhakre.rohit.algorithm.graph.linkedList;

public class Impl {

	public static void main(String[] args) {
		int vertices = 5;
		Graph g = new Graph(vertices);
		g.addNode(3, 1, 21);
		g.addNode(3, 4, 64);
		g.addNode(3, 2, 35);
		g.addNode(2, 4, 23);
		g.addNode(1, 2, 39);
		g.addNode(0, 4, 43);
		g.addNode(2, 3, 68);
		g.addNode(1, 3, 11);
		g.addNode(4, 3, 123);
		g.printGraph();
	}

}
