package com.impres.anno;

//no src
public class Delivery {
	private String deliveryMan;
	private String recivedBy;

	public void setDeliveryMan(String deliveryMan) {
		this.deliveryMan = deliveryMan;
	}

	public void setRecivedBy(String recivedBy) {
		this.recivedBy = recivedBy;
	}

	@Override
	public String toString() {
		return "Delivery [deliveryMan=" + deliveryMan + ", recivedBy=" + recivedBy + "]";
	}

}
