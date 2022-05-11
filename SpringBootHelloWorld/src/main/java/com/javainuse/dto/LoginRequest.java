package com.javainuse.dto;

import java.util.Map;

import com.javainuser.constants.HRACPUPConstant.PUPQuestionType;

/**
* authorname Administrator
*/

public class LoginRequest {
	
	String cntryAppxid;
	
	String custIdentificationNumber;
	
	Map<PUPQuestionType,Character> hrpuQuestionMap;
	
	String userId;

	public LoginRequest(String cntryAppxid,String cin,String userId) {
		this.cntryAppxid = cntryAppxid;
		this.custIdentificationNumber = cin;
		this.userId = userId;
	}
	
	public String getCntryAppxid() {
		return cntryAppxid;
	}

	public void setCntryAppxid(String cntryAppxid) {
		this.cntryAppxid = cntryAppxid;
	}

	public String getCustIdentificationNumber() {
		return custIdentificationNumber;
	}

	public void setCustIdentificationNumber(String custIdentificationNumber) {
		this.custIdentificationNumber = custIdentificationNumber;
	}

	public Map<PUPQuestionType, Character> getHrpuQuestionMap() {
		return hrpuQuestionMap;
	}

	public void setHrpuQuestionMap(Map<PUPQuestionType, Character> hrpuQuestionMap) {
		this.hrpuQuestionMap = hrpuQuestionMap;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "LoginRequest [cntryAppxid=" + cntryAppxid + ", custIdentificationNumber=" + custIdentificationNumber
				+ ", hrpuQuestionMap=" + hrpuQuestionMap + ", userId=" + userId + "]";
	}	
	

}
