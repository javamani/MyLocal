package com.towerplus.java8features.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaSteamsFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> studentList = Arrays.asList("Mani", "","Immanuel","Sprit","Messiah","");
		long count = studentList.stream().filter(x -> x.isEmpty()).count();
		System.out.println("Empty string count is :" + count);		
		
		long lengthString = studentList.stream().filter(x -> x.length() > 3).count();
		System.out.println("LengthString count is " + lengthString);
		
		long stringStartsWith = studentList.stream().filter(x -> x.startsWith("a")).count();
		System.out.println("stringStartsWith count is " + lengthString);
		
		// Using collectors.toList()		
		List<String> filteredList = studentList.stream().filter(x -> !x.isEmpty()).collect(Collectors.toList());
		System.out.println("filterList result is " + filteredList);
		
		// String more than 2 chars
		List<String> filteredList1 = studentList.stream().filter(x -> x.length() > 2).collect(Collectors.toList());
		System.out.println("FilteredList1 result is " + filteredList1);
	
		//Joining Map with String.
		String filteredList2 = studentList.stream().filter(x -> !x.isEmpty()).map(x -> x.toUpperCase()).collect(Collectors.joining("%"));
		System.out.println("Applying map result is " + filteredList2);
		
		// Using Map function
		List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
		//List<Integer> distinctNumbers = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
		//System.out.println("Distinct Number is " + distinctNumbers);
		
		//Number statistics
		List<Integer> numbers2 = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
		System.out.println("Number Result is " + numbers2.stream().mapToInt(x -> x).summaryStatistics()); 
		
		String[] players = {"Sachin", "Ganguly" , "Dhoni", "Gambhir","Yuvraj"};
		Stream.of(players).sorted().forEach(System.out::println);
		System.out.println("Reverse order is ");
		Stream.of(players).sorted(Comparator.reverseOrder()).forEach(System.out::println);
		System.out.println("using map is");
		Stream.of(players).filter(name -> !name.isEmpty() && name.length() > 5).map(name -> name.toUpperCase()).forEach(System.out::println);
		
		System.out.println("Parallel Streams examples");
		Stream<String> playerStream = Stream.of(players);		
		playerStream.parallel().forEach(name -> System.out.println("Results are "+ name + " " + Thread.currentThread().getName()));
		
		System.out.println("Parallel Stream example2");
		numbers.parallelStream().filter(i -> i % 2 ==0).forEach(number -> System.out.println("Number is " + number));
		
	}
	
	

}
