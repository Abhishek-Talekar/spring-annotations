package com.value.anno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = { "classpath:/com/value/anno/values.properties" })
public class JavaConfigFuelStation {
	@Bean
	public FuelStation fuelStation() {
		return new FuelStation();
	}
}
