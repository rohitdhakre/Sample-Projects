
package com.dhakre.rohit.factoryMethodPattern;

public class ConcreteCreator extends Creator {

	protected Product factoryMethod() {
		return new ConcreteProduct();
	}

}
