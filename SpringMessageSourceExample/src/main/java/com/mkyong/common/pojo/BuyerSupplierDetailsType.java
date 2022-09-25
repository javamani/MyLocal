package com.mkyong.common.pojo;

public class BuyerSupplierDetailsType {
	
	String firstName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getRelationship() {
		return relationship;
	}
	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	String LastName;
	@Override
	public String toString() {
		return "BuyerSupplierDetailsType [firstName=" + firstName + ", LastName=" + LastName + ", relationship="
				+ relationship + "]";
	}
	String relationship;
	

}
