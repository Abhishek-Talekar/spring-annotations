package com.listner.anno;

import org.springframework.context.ApplicationEvent;

public class ReloadEvent extends ApplicationEvent {

	private String tableName;

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public ReloadEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}

}
