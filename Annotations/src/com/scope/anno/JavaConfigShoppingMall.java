package com.scope.anno;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class JavaConfigShoppingMall {
	@Bean
	@Scope("prototype")
	public ShoppingMall shoppingMall() {
		return new ShoppingMall();
	}
}
