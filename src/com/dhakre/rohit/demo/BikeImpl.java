package com.dhakre.rohit.demo;

public class BikeImpl {

	public static void main(String[] args) {
		Bike[] bike = new Bike[3];
		for (int i = 0; i < 3; i++) {
			bike[i] = new Bike("JSB", "1345", "White");
		}
		for (Bike data : bike) {
			System.out.println(data.getName() + " " + data.getNumber() + " " + data.getColour());
		}

	}

}
