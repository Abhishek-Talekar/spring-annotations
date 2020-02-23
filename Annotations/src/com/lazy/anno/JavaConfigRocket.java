package com.lazy.anno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class JavaConfigRocket {
	@Bean
	@Lazy(value = true)
	public Rocket rocket() {
		return new Rocket();
	}
}
