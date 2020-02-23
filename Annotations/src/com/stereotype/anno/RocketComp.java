package com.stereotype.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RocketComp {
	@Autowired
	private LauncherDao dao;
	private String rocketname;
	public void setDao(LauncherDao dao) {
		this.dao = dao;
	}
	public void setRocketname(String rocketname) {
		this.rocketname = rocketname;
	}
	@Override
	public String toString() {
		return "RocketComp [dao=" + dao + ", rocketname=" + rocketname + "]";
	}
	
	
}
