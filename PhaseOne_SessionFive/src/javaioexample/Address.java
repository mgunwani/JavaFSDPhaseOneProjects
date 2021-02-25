package javaioexample;

import java.io.Serializable;

public class Address implements Serializable {
	private static final long serialVersionUID = 1L;
	private String houseNo;
	private String currentCity;
	private String country;
	
	public Address() {
		super();
		this.houseNo = "1234";
		this.currentCity = "Delhi";
		this.country = "India";
	}

	public Address(String houseNo, String currentCity, String country) {
		super();
		this.houseNo = houseNo;
		this.currentCity = currentCity;
		this.country = country;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getCurrentCity() {
		return currentCity;
	}

	public void setCurrentCity(String currentCity) {
		this.currentCity = currentCity;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [houseNo=" + houseNo + ", currentCity=" + currentCity + ", country=" + country + "]";
	}

}
