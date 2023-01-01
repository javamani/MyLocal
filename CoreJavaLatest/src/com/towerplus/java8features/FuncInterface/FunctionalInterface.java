package com.towerplus.java8features.FuncInterface;

public interface FunctionalInterface {

	public void sampleAbstractMethod();
	
	default String defaultMethod() {
		return "Default method implementation";
	}
}
