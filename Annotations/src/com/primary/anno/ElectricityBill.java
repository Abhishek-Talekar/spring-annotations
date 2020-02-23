package com.primary.anno;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component
public class ElectricityBill {
	//@Value("2250")
	private double billAmount;

	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}

	@Override
	public String toString() {
		return "ElectricityBill [billAmount=" + billAmount + "]";
	}

}
