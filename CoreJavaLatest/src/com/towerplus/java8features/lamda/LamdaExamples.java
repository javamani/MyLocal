package com.towerplus.java8features.lamda;

import java.util.ArrayList;
import java.util.List;

public class LamdaExamples  {	
	
	public static void main(String args[]) {
		
		//Using anonymous class.		
		MathCalculation mathCalculation = new MathCalculation() {
			public int doMultiply(int a, int b) {
				return a * b ;
			}
			
			public void echoName(String name) {
				System.out.println(name);
			}
		};	
		
		System.out.println("Without Lambda" + mathCalculation.doMultiply(4, 5));
		mathCalculation.echoName("Mani");	
		
		//Using Lambda with multiple params
		MathCalculation mathCalculation2 = ( a, b) -> (a * b);				
		System.out.println("with Lambda multiple params :" +mathCalculation2.doMultiply(4, 6));
		
		//Using Lambda with list.
		List<String> studentList = new ArrayList<String>();
		studentList.add("Mani");
		studentList.add("Guhan");
		studentList.add("Keerthi");
		
		studentList.forEach(name -> System.out.println("Lamda expression using forloop" + name));
	}

}
