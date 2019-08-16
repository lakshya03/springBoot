package com.training;

public class Address {
	private String addrLine1;
	private String city;
	private long pinCode;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String addrLine1, String city, long pinCode) {
		super();
		this.addrLine1 = addrLine1;
		this.city = city;
		this.pinCode = pinCode;
	}
	
	
	@Override
	public String toString() {
		return "Address [addrLine1=" + addrLine1 + ", city=" + city + ", pinCode=" + pinCode + "]";
	}
	
    
}
