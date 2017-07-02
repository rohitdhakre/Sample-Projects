package com.dhakre.rohit.demo;

import java.util.ArrayList;

public class ListDemo {

	public static void main(String[] args) {
		@SuppressWarnings("unchecked")
		ArrayList<Integer>[] arr = new ArrayList[4];
		arr[0] = new ArrayList<Integer>();
		arr[0].add(3);
		System.out.println(arr[0].isEmpty());
	}

}
