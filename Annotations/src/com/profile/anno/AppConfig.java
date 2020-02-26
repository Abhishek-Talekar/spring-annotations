package com.profile.anno;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = "com.profile.anno")
@Import(value = { DevloperConfig.class, TesterConfig.class })
public class AppConfig {

}
