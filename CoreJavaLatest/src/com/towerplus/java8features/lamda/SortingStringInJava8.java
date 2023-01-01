package com.towerplus.java8features.lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingStringInJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		List<String> teamList = Arrays.asList("France" ,"Argentina", "Portugal" , "England" , "Brazil");
		
		Collections.sort(teamList,(String a, String b) -> {
			return b.compareTo(a);
		});
		System.out.println("Sorted Names Desc are " + teamList);
		//using lambda further
		Collections.sort(teamList , (a,b) ->  a.compareTo(b));		
		System.out.println("Sorted Names asc are " + teamList);
	}

}
