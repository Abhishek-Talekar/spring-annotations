package com.listner.anno;

import org.springframework.stereotype.Component;

@Component
public class CacheManager {
	public void load() {
		System.out.println("Cache loaded Successfully..!");
	}
}
