package com.lookup.anno;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Rocket {
	
	public void fire() {
		System.out.println("Rocket Fired...");
	}
}
