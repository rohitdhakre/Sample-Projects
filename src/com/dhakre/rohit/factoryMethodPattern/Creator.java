package com.dhakre.rohit.factoryMethodPattern;

public abstract class Creator {

	public void anOperation() {
		@SuppressWarnings("unused")
		Product product = factoryMethod();
	}

	protected abstract Product factoryMethod();

}