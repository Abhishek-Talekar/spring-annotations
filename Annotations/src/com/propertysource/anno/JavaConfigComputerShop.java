package com.propertysource.anno;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:com/propertysource/anno/prop-values.properties")
public class JavaConfigComputerShop {
	@Autowired
	Environment env;

	@Bean(autowire = Autowire.BY_NAME)
	public ComputerShop computerShop() {
		ComputerShop shop1 = new ComputerShop();
		
		shop1.setAvailbleComputers(Integer.parseInt(env.getProperty("availbleComputers")));
		shop1.setLatestModel(env.getProperty("latestModel"));
		
		return shop1;
	}

	@Bean(autowire = Autowire.BY_NAME)
	public OwnerDetails ownerDetails() {
		OwnerDetails details1 = new OwnerDetails();

		details1.setLicenceNumber(env.getProperty("licenceNumber"));
		details1.setOwnerName(env.getProperty("ownerName"));

		return details1;
	}
}
