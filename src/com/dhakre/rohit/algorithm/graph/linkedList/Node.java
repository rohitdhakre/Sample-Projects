package com.dhakre.rohit.algorithm.graph.linkedList;

public class Node {

	private int u;
	private int v;
	private int weight;

	public Node() {
		super();
	}

	public Node(int v, int weight) {
		super();
		this.v = v;
		this.weight = weight;
	}

	public int getV() {
		return v;
	}

	public void setV(int v) {
		this.v = v;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getU() {
		return u;
	}

	public void setU(int u) {
		this.u = u;
	}

	@Override
	public String toString() {
		return "[" + v + ", " + weight + "]";
	}

}
