package com.dhakre.rohit.algorithm.graph.hashMap;

public class Impl {

	public static void main(String[] args) {
		Graph graph = new Graph(5);
		graph.setEdges(1, 2);
		graph.setEdges(2, 3);
		graph.setEdges(3, 1);
		graph.setEdges(4, 2);
		graph.setEdges(4, 1);
		graph.setEdges(5, 3);
		graph.getEdge(3);
		graph.getEdge(6);
		graph.printGraph();
	}

}
