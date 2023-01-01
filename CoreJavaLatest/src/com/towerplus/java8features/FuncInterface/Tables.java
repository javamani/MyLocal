package com.towerplus.java8features.FuncInterface;

//@FunctionalInterface
public interface Tables {
	
	public void add(int a, int b);
	
	default  void multiply(int a, int b) {
		System.out.println("default method");
	}
}
