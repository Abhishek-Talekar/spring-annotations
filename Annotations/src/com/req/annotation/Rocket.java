package com.req.annotation;

import org.springframework.beans.factory.annotation.Required;

public class Rocket {

	private int rocketNo;
	private String rocketName;

	public int getRocketNo() {
		return rocketNo;
	}
	@Required
	public void setRocketNo(int rocketNo) {
		this.rocketNo = rocketNo;
	}

	public String getRocketName() {
		return rocketName;
	}
	@Required
	public void setRocketName(String rocketName) {
		this.rocketName = rocketName;
	}
	@Override
	public String toString() {
		return "Rocket [rocketNo=" + rocketNo + ", rocketName=" + rocketName + "]";
	}
	

}
