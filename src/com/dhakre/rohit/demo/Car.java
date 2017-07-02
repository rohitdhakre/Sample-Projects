package com.dhakre.rohit.demo;

public class Car {

	private String carName;
	private int carModel;
	private int carPrice;
	private String carColour;
	private int carEngine;
	private int carTransmission;

	public Car() {
		super();
	}

	public Car(String carName, int carModel, int carPrice, String carColour, int carEngine, int carTransmission) {
		super();
		this.carName = carName;
		this.carModel = carModel;
		this.carPrice = carPrice;
		this.carColour = carColour;
		this.carEngine = carEngine;
		this.carTransmission = carTransmission;
	}

	public String getCarColour() {
		return carColour;
	}

	public void setCarColour(String carColour) {
		this.carColour = carColour;
	}

	public int getCarEngine() {
		return carEngine;
	}

	public void setCarEngine(int carEngine) {
		this.carEngine = carEngine;
	}

	public int getCarTransmission() {
		return carTransmission;
	}

	public void setCarTransmission(int carTransmission) {
		this.carTransmission = carTransmission;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public int getCarModel() {
		return carModel;
	}

	public void setCarModel(int carModel) {
		this.carModel = carModel;
	}

	public int getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(int carPrice) {
		this.carPrice = carPrice;
	}

	@Override
	public String toString() {
		return "Car [carName = " + carName + ", carModel = " + carModel + ", carPrice = " + carPrice + "]";
	}

}
