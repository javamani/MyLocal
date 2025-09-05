package com.towerplus.corejava.optional;

import java.util.Optional;

public class OptionalMethodReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Optional<String> str = findById(20);
			str.ifPresent(System.out::println);	
			System.out.println("str value is " + str);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	public static Optional<String> findById(int i) {
		
		if(i == 10) {
			return Optional.of("Belongs to Mani");
		} else 
			return Optional.empty();
		
	}

}
