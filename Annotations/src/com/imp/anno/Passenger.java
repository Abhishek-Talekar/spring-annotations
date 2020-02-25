package com.imp.anno;

//no source code
public class Passenger {
	private String passengerName;
	private int passengerNumber;

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public void setPassengerNumber(int passengerNumber) {
		this.passengerNumber = passengerNumber;
	}

	@Override
	public String toString() {
		return "Passenger [passengerName=" + passengerName + ", passengerNumber=" + passengerNumber + "]";
	}

}
