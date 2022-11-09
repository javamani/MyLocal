package com.towerplus.java8features.lamda;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class LamdaSAMImpl  {
	
	public static void main(String args[]) {
		
		// No parameter
		LamdaSAMInterface lambdaSamInterface = () -> {
			 return "hello";
		};		
		System.out.println("*** welcome to Lambda expression" + lambdaSamInterface.sayHello());
		
		
		// Double parameter with return type.		
		LamdaSAMInterface2  lamdaSAMInterface2 = (i,j) -> {
			return i * j;
		};		
		System.out.println("*** welcome to Lambda expression 2" + lamdaSAMInterface2.add(4, 5));
		
		//Iterating list using Lamda expression.
		List<String> nameList = Arrays.asList("Mani", "Guhan" , "Dinesh", "Aarav");
		
		//Iterating list without Lamda expression
		Iterator iterator = nameList.iterator();
		while(iterator.hasNext()) {
			System.out.println("*** Using Iterator" + iterator.next());
		}
		
		//Iterating list using enhance for loop
		for(String name : nameList) {
			System.out.println("Enhance for loop iteration " + name);
		}
		
		//Using Lamda expression
		nameList.forEach((names) -> System.out.println(names));			
		
		//Using method references
		nameList.forEach(System.out::println);
		
		
		Map<String, Integer> classStrength = new HashMap<>();
		classStrength.put("FirstStnd", 50);
		classStrength.put("SecondStandard", null);
		classStrength.put("ThirdStandard", 100);
		
		// Iterating HashMap without Lambda expression.
		for( Map.Entry<String, Integer> entry  : classStrength.entrySet()) {
			System.out.println("Key is " + entry.getKey() + " Value is " + entry.getValue());
		}
		
		// Iterating HashMap using Lambda expression.
		System.out.println("** Using Lamda expression");
		classStrength.forEach((k,v) -> System.out.println("Key is " + k + " value is " + v ));

	}

	
}