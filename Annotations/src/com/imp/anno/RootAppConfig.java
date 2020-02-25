package com.imp.anno;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({PassengerAppConfig.class, TicketAppConfig.class})
public class RootAppConfig {
	
}
