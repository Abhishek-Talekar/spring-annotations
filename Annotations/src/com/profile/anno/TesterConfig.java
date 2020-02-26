package com.profile.anno;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:/com/profile/anno/application-test.properties")
@Profile("test")
public class TesterConfig {
	
}
