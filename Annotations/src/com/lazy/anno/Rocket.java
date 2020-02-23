package com.lazy.anno;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy(value = false)
public class Rocket {
	private String rocketName;

	Rocket() {
		System.out.println("Rocket Initialized");
	}
}
