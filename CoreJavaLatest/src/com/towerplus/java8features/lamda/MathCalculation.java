package com.towerplus.java8features.lamda;

public interface MathCalculation {

	public int doMultiply(int param1,int param2);
	
	
	public default void echoName(String name) {};
}
