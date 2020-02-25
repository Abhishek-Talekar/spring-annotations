package com.lookup.anno;

import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Launcher {
	public void launch() {
		Rocket rocket = rocket();
		rocket.fire();
	}

	@Lookup
	public Rocket rocket() {
		return null;
	}
}
