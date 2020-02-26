package com.profile.anno;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class CommonConfig {

	@Autowired
	private Environment env;

	@Bean(autowire = Autowire.BY_TYPE)
	public Branch branch() {
		Branch branch = new Branch();
		branch.setBranchId(Integer.parseInt(env.getProperty("branchId")));
		branch.setBranchName(env.getProperty("branchName"));

		return branch;
	}
}