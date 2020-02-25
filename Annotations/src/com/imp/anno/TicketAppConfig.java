package com.imp.anno;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource(value = "classpath:/com/imp/anno/ticket.properties")
public class TicketAppConfig {
	@Autowired
	Environment env;
	
	@Bean(autowire = Autowire.BY_TYPE)
	public Ticket ticket() {
		Ticket ticket =new Ticket();
		ticket.setTicketNo(env.getProperty("ticketNo"));
		ticket.setVehicle_no(env.getProperty("vehicle_no"));
		return ticket;
	}
}
