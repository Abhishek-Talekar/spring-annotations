package com.value.anno;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FuelStation {
	//@Value("Petrol")
	@Value("#{valueProps.fuelType}")
	private String fuelType;
	//@Value("2321")
	@Value("#{valueProps.capacity}")
	private double capacity;

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "FuelStation [fuelType=" + fuelType + ", capacity=" + capacity + "]";
	}

}
