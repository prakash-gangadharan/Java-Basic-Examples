package com.examples.encapsulation;

public class Car {
	private String color;
	private String make;
	private String model;
	private int year;

	public Car() {
	}

	public Car(String color, String make, String model, int year) {
		this.color = color;
		this.make = make;
		this.model = model;
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String toString() {
		return color + " " + make + " " + model + " " + year;
	}
}
