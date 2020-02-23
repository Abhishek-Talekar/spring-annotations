package com.dependson.anno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class JavaConfigDependsOn {

	@Bean
	@DependsOn(value = "cacheManager")
	public PersonDao personDao() {
		return new PersonDao();
	}

	@Bean
	public CacheManager cacheManager() {
		return new CacheManager();
	}
}
