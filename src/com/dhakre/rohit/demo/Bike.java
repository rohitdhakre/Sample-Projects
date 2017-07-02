package com.dhakre.rohit.demo;

public class Bike {

	private String name;
	private String number;
	private String colour;

	public Bike() {
	}

	public Bike(String name, String number, String colour) {
		super();
		this.name = name;
		this.number = number;
		this.colour = colour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		return "Bike [name=" + name + ", number=" + number + ", colour=" + colour + "]";
	}

}
