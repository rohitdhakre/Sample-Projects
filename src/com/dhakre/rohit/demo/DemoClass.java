package com.dhakre.rohit.demo;

public class DemoClass {

	public static void main(String[] args) {
		Car car = new Car("I20", 2015, 231231, "Black", 1200, 6);
		
		/*		OR
		
		car.setCarName("I20");
		car.setCarModel(2010);
		car.setCarPrice(1000000);
		car.setCarColour("red");
		car.setCarEngine(1000);
		car.setCarTransmission(5);*/
		
		DemoInterface i = new DemoInterfaceImpl(car);
		i.buildACar();
		i.carColour();
		i.carEngine();
		i.carTransmission();
	}
}
