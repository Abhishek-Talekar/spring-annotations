package com.propertysource.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
//@PropertySource("classpath:com/propertysource/anno/prop-values.properties")
public class ComputerShop {
	//@Autowired
	private OwnerDetails ownerDetails;
	
	//@Value("${availbleComputers}")
	private int availbleComputers;
	
	//@Value("${latestModel}")
	private String latestModel;

	public void setAvailbleComputers(int availbleComputers) {
		this.availbleComputers = availbleComputers;
	}

	public void setLatestModel(String latestModel) {
		this.latestModel = latestModel;
	}

	public void setOwnerDetails(OwnerDetails ownerDetails) {
		this.ownerDetails = ownerDetails;
	}

	@Override
	public String toString() {
		return "ComputerShop [ownerDetails=" + ownerDetails + ", availbleComputers=" + availbleComputers
				+ ", latestModel=" + latestModel + "]";
	}

	
}
