package com.dependson.anno;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

//@Component
public class PersonDao {

	public PersonDao() {
		System.out.println("Person obj created");
	}

}
