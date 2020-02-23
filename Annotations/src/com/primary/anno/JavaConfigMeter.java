package com.primary.anno;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class JavaConfigMeter {
	
	@Bean(autowire = Autowire.BY_TYPE)
	public ElectricityMeter electricityMeter() {
		return new ElectricityMeter();
	}
	
	@Bean(name = "electricityBill1")
	@Primary
	public ElectricityBill electricityBill1() {
		return new ElectricityBill();
	}
	@Bean(name = "electricityBill2")
	public ElectricityBill electricityBill2() {
		return new ElectricityBill();
	}
}
