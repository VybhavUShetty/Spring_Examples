package com.lti.Sting.Annotation;

public class Country {
	String countryName;

	public Country(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	@Override
	public String toString() {
		return "Country [countryName=" + countryName + "]";
	}
	
	
}
