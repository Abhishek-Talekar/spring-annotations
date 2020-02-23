package com.qualifier.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Bicycle {
	
	private Chain chain;
	private String cycleName;

	@Autowired
	@Qualifier("chain1")
	public void setChain(Chain chain) {
		this.chain = chain;
	}
	
	public void setCycleName(String cycleName) {
		this.cycleName = cycleName;
	}

	@Override
	public String toString() {
		return "Bicycle [chain=" + chain + ", cycleName=" + cycleName + "]";
	}

}
