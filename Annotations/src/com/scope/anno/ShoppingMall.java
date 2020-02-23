package com.scope.anno;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class ShoppingMall {
	private String mallName;

	public void setMallName(String mallName) {
		this.mallName = mallName;
	}

	@Override
	public String toString() {
		return "ShoppingMall [mallName=" + mallName + "]";
	}

}
