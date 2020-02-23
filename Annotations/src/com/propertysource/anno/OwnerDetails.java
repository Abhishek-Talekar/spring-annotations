package com.propertysource.anno;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
//@PropertySource("classpath:com/propertysource/anno/prop-values.properties")
public class OwnerDetails {
	//@Value("${ownerName}")
	private String ownerName;
	
	//@Value("${licenceNumber}")
	private String licenceNumber;

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public void setLicenceNumber(String licenceNumber) {
		this.licenceNumber = licenceNumber;
	}

	@Override
	public String toString() {
		return "OwnerDetails [ownerName=" + ownerName + ", licenceNumber=" + licenceNumber + "]";
	}

}
