package com.impres.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com.impres.anno")
@ImportResource("com/impres/anno/customer.xml")
@PropertySource(value = "classpath:/com/impres/anno/deliveryinfo.properties")
public class AppConfig {
	
	@Autowired
	private Environment env;
	
	@Bean
	public Delivery delivery() {
		Delivery delivery = new Delivery();
		delivery.setDeliveryMan(env.getProperty("deliveryMan"));
		delivery.setRecivedBy(env.getProperty("recivedBy"));
		return delivery;
	}
}
