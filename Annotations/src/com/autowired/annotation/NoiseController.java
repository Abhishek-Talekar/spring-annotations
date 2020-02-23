package com.autowired.annotation;

public class NoiseController {
	private String noiseRatio;

	public void setNoiseRatio(String noiseRatio) {
		this.noiseRatio = noiseRatio;
	}

	@Override
	public String toString() {
		return "NoiseController [noiseRatio=" + noiseRatio + "]";
	}

}
