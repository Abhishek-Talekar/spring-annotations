package com.impres.anno;

//xml
public class Customer {
	private String customerName;
	private String mobileNumber;

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "Customer [customerName=" + customerName + ", mobileNumber=" + mobileNumber + "]";
	}

}
