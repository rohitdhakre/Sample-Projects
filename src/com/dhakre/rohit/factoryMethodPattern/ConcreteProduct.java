package com.dhakre.rohit.factoryMethodPattern;

public class ConcreteProduct implements Product {

	@Override
	public void hairOil() {
		System.out.println("Buy Hair Oil worth Rs 100");

	}

	@Override
	public void shampoo() {
		System.out.println("Buy Shampoo worth Rs 199");

	}

	@Override
	public void conditioner() {
		System.out.println("Buy Conditioner free with Shampoo");

	}

}
