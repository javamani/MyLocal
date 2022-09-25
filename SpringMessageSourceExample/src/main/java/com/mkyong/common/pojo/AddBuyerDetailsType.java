package com.mkyong.common.pojo;

public class AddBuyerDetailsType {
	
	public String getMemberid() {
		return memberid;
	}
	public void setMemberid(String memberid) {
		this.memberid = memberid;
	}
	public BuyerSupplierDetailsType getSupplierDetails() {
		return supplierDetails;
	}
	public void setSupplierDetails(BuyerSupplierDetailsType supplierDetails) {
		this.supplierDetails = supplierDetails;
	}
	@Override
	public String toString() {
		return "AddBuyerDetailsType [memberid=" + memberid + ", supplierDetails=" + supplierDetails + "]";
	}
	String memberid;
	BuyerSupplierDetailsType  supplierDetails;

}
