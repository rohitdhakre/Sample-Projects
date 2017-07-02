package com.dhakre.rohit.generics;

class UsingClass <T> {

	T obj;
	
	public void add(T obj) {
		this.obj = obj;
	}
	
	public T get() {
		return obj;
	}

}
