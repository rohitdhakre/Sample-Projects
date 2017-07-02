package com.dhakre.rohit.generics;

public class UsingClass_Impl {

	public static void main(String[] args) {
		UsingClass<String> m = new UsingClass<String>();
		m.add("This is generics");
		System.out.println(m.get());

	}

}
