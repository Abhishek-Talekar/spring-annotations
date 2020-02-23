package com.primary.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class ElectricityMeter {

	//@Autowired
	private ElectricityBill electricityBill;

	public void setElectricityBill(ElectricityBill electricityBill) {
		this.electricityBill = electricityBill;
	}

	@Override
	public String toString() {
		return "ElectricityMeter [electricityBill=" + electricityBill + "]";
	}

}
