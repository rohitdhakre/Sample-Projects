package com.dhakre.rohit.factoryMethodPattern;

public class Client {

	public static void main(String[] args) {

		Creator creator = new ConcreteCreator();
		creator.anOperation();
	}

}