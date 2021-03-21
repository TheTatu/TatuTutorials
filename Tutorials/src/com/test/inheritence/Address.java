package com.test.inheritence;

public class Address {
	private String flatNumber;
	private String area;
	private String city;
	private String state;
	private String country;
	private int pin;

	public Address() {}
	
	public Address(String flatNumber, String area, String city, String state, String country, int pin) {
		this.flatNumber = flatNumber;
		this.area = area;
		this.city = city;
		this.state = state;
		this.country = country;
		this.pin = pin;
	}
	
}
