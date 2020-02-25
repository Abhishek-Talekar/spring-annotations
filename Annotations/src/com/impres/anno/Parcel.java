package com.impres.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//source code
@Component
public class Parcel {
	@Autowired
	private Customer sender;
	
	@Autowired
	private Customer receiver;
	
	@Autowired
	private Delivery delivery;

	@Override
	public String toString() {
		return "Parcel [sender=" + sender + ", receiver=" + receiver + ", delivery=" + delivery + "]";
	}
	
	
}
