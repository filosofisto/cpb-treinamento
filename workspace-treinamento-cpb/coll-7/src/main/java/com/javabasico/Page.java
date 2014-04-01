package com.javabasico;

public class Page {

	private String address;

	public Page(String address) {
		setAddress(address);
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String toString() {
		return getAddress();
	}
}
