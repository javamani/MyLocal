package com.mkyong.common.pojo;

public class Employee {
	private String name;
	  public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	private Department department;

	 @Override
	  public String toString() {
	      return "Employee{" +
	              "name='" + name + '\'' +
	              ", department=" + department +
	              '}';
	  }
}
