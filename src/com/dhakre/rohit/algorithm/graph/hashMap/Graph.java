package com.dhakre.rohit.algorithm.graph.hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Graph {

	private HashMap<Integer, List<Integer>> map;

	public Graph(int numOfVertices) {
		map = new HashMap<>();
		for (int i = 1; i <= numOfVertices; i++) {
			map.put(i, new LinkedList<Integer>());
		}
	}

	public void setEdges(int source, int dest) {
		if (source > map.size() || dest > map.size()) {
			System.out.println("Vertex is not available for source = " + source + ", destination = " + dest);
			return;
		}
		// for one direction
		LinkedList<Integer> sourceList = (LinkedList<Integer>) map.get(source);
		sourceList.addFirst(dest);
		// for bi-direction
		LinkedList<Integer> destList = (LinkedList<Integer>) map.get(dest);
		destList.addFirst(source);
	}

	public void getEdge(int source) {
		if (source > map.size()) {
			System.out.println("Vertex is not available for source = " + source);
			return;
		}
		LinkedList<Integer> list = (LinkedList<Integer>) map.get(source);
		Iterator<Integer> itr = list.iterator();
		System.out.print(source);
		while (itr.hasNext()) {
			System.out.print("-> " + itr.next());
		}
		System.out.println();
	}

	public void printGraph() {
		for (int i = 1; i <= map.size(); i++) {
			getEdge(i);
		}
	}

}
