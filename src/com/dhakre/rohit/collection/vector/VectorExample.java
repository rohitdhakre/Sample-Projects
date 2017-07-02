package com.dhakre.rohit.collection.vector;

import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector<String> vec = new Vector<String>(2);

		// add or addElement same functionality
		vec.addElement("1st");
		vec.add("2nd");
		vec.add("3rd");
		vec.add("4th");
		System.out.println("Size of vector - " + vec.size());
		System.out.println("Capacity of vector - " + vec.capacity());
		System.out.println("Elements in vector - " + vec);
		vec.add("5th");
		vec.add("6th");
		System.out.println("Now Size f vector - " + vec.size());
		System.out.println("Now Capacity of vector - " + vec.capacity());
		System.out.println("After adding element in vector - " + vec);

		// For copy one vector to another
		Vector<String> vec2 = new Vector<String>(vec);
		System.out.println(vec2);

		// OR

		Collections.copy(vec2, vec);
		System.out.println(vec2);
		
		// Iterate using enumeration
		Enumeration<String> e = vec.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
