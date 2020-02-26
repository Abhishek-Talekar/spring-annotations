package com.profile.anno;

//no src code
public class Branch {
	private Address address;
	private int branchId;
	private String branchName;

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setBranchId(int branchId) {
		this.branchId = branchId;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	@Override
	public String toString() {
		return "Branch [address=" + address + ", branchId=" + branchId + ", branchName=" + branchName + "]";
	}

}
