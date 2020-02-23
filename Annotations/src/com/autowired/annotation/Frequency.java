package com.autowired.annotation;

public class Frequency {
	private int tune;
	private String signalType;

	public int getTune() {
		return tune;
	}

	public void setTune(int tune) {
		this.tune = tune;
	}

	public String getSignalType() {
		return signalType;
	}

	public void setSignalType(String signalType) {
		this.signalType = signalType;
	}

	@Override
	public String toString() {
		return "Frequency [tune=" + tune + ", signalType=" + signalType + "]";
	}

}
