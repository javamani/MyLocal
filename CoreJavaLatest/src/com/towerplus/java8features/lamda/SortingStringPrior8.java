package com.towerplus.java8features.lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortingStringPrior8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> friendsList = Arrays.asList("Friend1","Friend2" ,"Friend3", "Ashok", "Selvam");
		Collections.sort(friendsList , new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				// TODO Auto-generated method stub
				return a.compareTo(b);
			}			
		});
		System.out.println("sorted list  " + friendsList);
		System.out.println("Execution completed");
	}

}
