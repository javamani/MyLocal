package com.towerplus.java8features.FuncInterface;


public interface Tables1 extends Tables {
	

	
	default  void multiply(int a, int b) {
		System.out.println("default method");
	}
	
	public void divide(int a, int b);

}
