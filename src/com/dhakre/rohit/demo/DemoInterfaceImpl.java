package com.dhakre.rohit.demo;

public class DemoInterfaceImpl implements DemoInterface {

	Car car;
	
	public DemoInterfaceImpl() {
		super();
	}
	
	public DemoInterfaceImpl(Car car) {
		super();
		this.car = car;
	}

	@Override
	public void buildACar() {
		System.out.println(
				"Let's build a car - " + car.getCarName() + ", " + car.getCarModel() + ", " + car.getCarPrice());
	}

	@Override
	public void carColour() {
		System.out.println("Car's colour would be - " + car.getCarColour());
	}

	@Override
	public void carEngine() {
		System.out.println("Car must have " + car.getCarEngine() + "cc engine");
	}

	@Override
	public void carTransmission() {
		System.out.println("Car must have atleast " + car.getCarTransmission() + " gears with a reverse gear");
	}

}
