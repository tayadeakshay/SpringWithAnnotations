package com.pro.wings;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Address {

	public int pin;
	
	public String city;
	
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int pin, String city) {
		super();
		this.pin = pin;
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [pin=" + pin + ", city=" + city + "]";
	}
	
	
}
