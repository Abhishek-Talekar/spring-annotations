package com.imp.anno;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource(value = "classpath:/com/imp/anno/passenger.properties")
public class PassengerAppConfig {
	
	@Autowired
	Environment env;
	
	@Bean
	public Passenger passenger() {
		Passenger passenger = new Passenger();
		passenger.setPassengerName(env.getProperty("passengerName"));
		passenger.setPassengerNumber(Integer.parseInt(env.getProperty("passengerNumber")));
		return passenger;
	}
}
