package com.towerplus.java8features.streams;

import java.util.Arrays;
import java.util.List;

public class JavaSteamsFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> studentList = Arrays.asList("Mani", "","Immanuel","Sprit","Messiah","");
		long count = studentList.stream().filter(x -> x.isEmpty()).count();
		System.out.println("Empty string count is :" + count);		
		
		long lengthString = studentList.stream().filter(x -> x.length() > 3).count();
		System.out.println("LengthString count is " + lengthString);
	}

}
