package com.listner.anno;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
@Component
public class ReloadEventListner {
	@EventListener
	public void onApplicationLoadEvent(ReloadEvent event) {
		System.out.println("Cache Reloaded for Table:"+event.getTableName());
	}
}
