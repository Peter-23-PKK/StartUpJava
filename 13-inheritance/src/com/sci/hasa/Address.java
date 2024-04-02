package com.sci.hasa;

public class Address {
	private String houseNumber;
	private String street;
	private String township;

	public Address(String houseNumber, String street, String township) {
		super();
		this.houseNumber = houseNumber;
		this.street = street;
		this.township = township;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getTownship() {
		return township;
	}

	public void setTownship(String township) {
		this.township = township;
	}

}