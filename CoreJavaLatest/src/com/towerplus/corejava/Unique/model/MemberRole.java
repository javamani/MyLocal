package com.towerplus.corejava.Unique.model;

import java.util.UUID;

public class MemberRole {
	
	private UUID memberId;
	private String othRoleType;
	
	
	public MemberRole(UUID memberId, String othRoleType) {
		super();
		this.memberId = memberId;
		this.othRoleType = othRoleType;
	}
	
	
	@Override
	public String toString() {
		return "MemberRole [memberId=" + memberId + ", othRoleType=" + othRoleType + "]";
	}


	public UUID getMemberId() {
		return memberId;
	}
	public String getOthRoleType() {
		return othRoleType;
	}
	public void setMemberId(UUID memberId) {
		this.memberId = memberId;
	}
	public void setOthRoleType(String othRoleType) {
		this.othRoleType = othRoleType;
	}
	
}
