package com.listner.anno;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;
@Component
public class AddCityService implements ApplicationEventPublisherAware {
	ApplicationEventPublisher publisher;
	
	public void insertCity(String tableName,String cityName) {
		System.out.println("Updated Table:"+tableName+"\nUpdated city:"+cityName);
		ReloadEvent event =new ReloadEvent(this);
		event.setTableName(tableName);
		publisher.publishEvent(event);
	}
	
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
		
	}

}
