package com.profile.anno;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//src code
@Component
public class Address {
	@Value("${homeAddress}")
	private String homeAddress;

	@Value("${city}")
	private String city;

	@Value("${state}")
	private String state;

	@Value("${zip}")
	private int zip;

	@Value("${country}")
	private String country;

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [homeAddress=" + homeAddress + ", city=" + city + ", state=" + state + ", zip=" + zip
				+ ", country=" + country + "]";
	}

}
