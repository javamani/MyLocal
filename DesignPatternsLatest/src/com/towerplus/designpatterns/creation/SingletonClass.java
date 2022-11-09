package com.towerplus.designpatterns.creation;

public class SingletonClass {

	private static SingletonClass object = new SingletonClass();
	
	private SingletonClass() {
		
	}
	
	public static SingletonClass getInstance() {
		return object;
	}
	
	public void getMessage() {
		System.out.println("you got the SingletonClass object");		
	}
}
