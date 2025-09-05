package com.towerplus.corejava.optional;

import java.util.Optional;

public class AvoidNPEUsingOptional {
	
	public static void main(String args[]) {
		
		String name = "Mani";
		Optional<String> optStr  = Optional.of(Optional.ofNullable(name).orElse("Default value"));		
		optStr.ifPresent(s -> System.out.println("value is " + s));
		String defaultValue = optStr.orElse("Default value");
		System.out.println("defaultValue is " + defaultValue);
		
	}

}
