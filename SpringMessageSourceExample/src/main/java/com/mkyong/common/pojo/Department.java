package com.mkyong.common.pojo;

public class Department {
	
	private long deptCode;
	  public long getDeptCode() {
		return deptCode;
	}
	public void setDeptCode(long deptCode) {
		this.deptCode = deptCode;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	private String deptName;
	
	@Override
	  public String toString() {
	      return "Department{" +
	              "deptCode='" + deptCode + '\'' +
	              ", deptName='" + deptName + '\'' +
	              '}';
	}

}
