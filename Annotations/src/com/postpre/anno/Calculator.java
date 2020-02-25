package com.postpre.anno;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Calculator {
	@Value("10")
	private int a;
	private int b;
	private int sum;

	public void setA(int a) {
		this.a = a;
	}

	public Calculator(@Value("20") int b) {
		this.b = b;
	}

	@PostConstruct
	public void init() {
		sum = a + b;
		System.out.println("Sum is:" + sum);
	}
	
	@PreDestroy
	public void clean() {
		System.out.println("Cleaned...");
	}

	@Override
	public String toString() {
		return "Calculator [a=" + a + ", b=" + b + ", sum=" + sum + "]";
	}
	
}
