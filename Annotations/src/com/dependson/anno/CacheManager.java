package com.dependson.anno;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
//@DependsOn(value = "personDao")
public class CacheManager {
	
	public CacheManager() {
		System.out.println("Cache Manager Created");
	}

}
