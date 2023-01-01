package com.towerplus.java8features.FuncInterface;

public class FuncInterfaceMain  implements FunctionalInterface {
	
	public static void main(String args[]) {
		ClassOne object1 = new ClassOne();
		
		Tables tablesOne = new ClassOne();
		tablesOne.add(0, 0);
		
		Tables tablesTwo = new Class2();
		tablesOne.multiply(0, 0);		
		
		FuncInterfaceMain obj = new FuncInterfaceMain();
		obj.sampleAbstractMethod();
		System.out.println(obj.defaultMethod());
	}

	@Override
	public void sampleAbstractMethod() {
		System.out.println("Sample Abstract Method - Implementation");
		
	}

}
