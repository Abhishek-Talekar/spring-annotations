package com.autowired.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Radio {
	// @Autowired
	private Frequency frequency;
	// @Autowired
	private NoiseController noiseController;

	@Autowired
	public void init(Frequency frequency, NoiseController noiseController) {
		this.frequency = frequency;
		this.noiseController = noiseController;
	}

//	@Autowired
//	public Radio(Frequency frequency) {
//		this.frequency = frequency;
//	}

//	@Autowired
//	public Radio(Frequency frequency, NoiseController noiseController) {
//		this.frequency = frequency;
//		this.noiseController = noiseController;
//	}

	@Override
	public String toString() {
		return "Radio [frequency=" + frequency + ", noiseController=" + noiseController + "]";
	}

//	@Autowired
//	public Radio() {
//	}

//	@Autowired
//	public void setFrequency(Frequency frequency) {
//		this.frequency = frequency;
//	}

}
