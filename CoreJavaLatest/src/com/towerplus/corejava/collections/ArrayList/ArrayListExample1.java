package com.towerplus.corejava.collections.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//https://www.w3resource.com/java-exercises/collection/index.php#linkedlist
public class ArrayListExample1 {
	
	public static void main(String args[]) {
		
		// Printing a collection - Arraylist.
		
		List<String> arrayList = new ArrayList<String>();
		arrayList.add("India");
		arrayList.add("Ireland");
		arrayList.add("USA");
		arrayList.add("Dubai");		
		System.out.println("arrayList values are :" + arrayList);
		
		List<String> arrayList2 = new ArrayList<String>();
		arrayList2.add("Mani");
		arrayList2.add("Sangee");
		arrayList2.add("Aarav");
		arrayList2.add("Family");		
		System.out.println("arrayList2 values are :" + arrayList2);
		
		//Copy 1 arraylist to another.
		Collections.copy(arrayList2, arrayList);
		
		//Insert an element into the array list at the first position
		arrayList.add(1,"Bangalore");
		
				
		//4 retrieve an element (at a specified index) from a given array list.
		System.out.println("Value at Index 1 " + arrayList.get(1));
		
		//update specific array element by given element
		arrayList.set(1, "Ireland Replaced");
		
		// remove the third element from a array list.
		arrayList.remove(3);
		
		
		// Searching for an element.
		if (arrayList.contains("Dubai"))
			System.out.println("Search Element exist");
		else 
			System.out.println("Search Element not exist");
		
		//Sorting an arraylist
		Collections.sort(arrayList);
		
		//Shuffle an arraylist
		Collections.shuffle(arrayList);
		
		//Reverse an list.
		Collections.reverse(arrayList);
		
		//Extracting a portion of List
		List<String> subList = arrayList.subList(0, 1);
		
		// Comparing 2 arraylist.
		
		
		// Iterating an ArrayList
		for (String arrayListValues : arrayList) {
			System.out.println("Iterating arraylist value is " + arrayListValues);
		}
		
		for (String subListvalues : subList) {
			System.out.println("Iterating arraylist value is " + subListvalues);
		}
		
		//comparing 2 list and adding matching one to new list.
		ArrayList<String> arrayList3 = new ArrayList<String>();
		for (String arrayListValuesString : arrayList) {
			if (arrayList2.contains(arrayListValuesString)) {
				arrayList3.add(arrayListValuesString);
			} 
		}
		for (String subListvalues : arrayList3) {
			System.out.println("Iterating arrayList3 match before swap " + subListvalues);
		}
		
		// Swapping an element in an arraylist.
		Collections.swap(arrayList3, 0, 1);
		
		// Joining 2 list.
		arrayList3.addAll(arrayList);
		
		for (String subListvalues : arrayList3) {
			System.out.println("Iterating arrayList3 match after swap " + subListvalues);
		}
		
		//cloning an array/list.
		List<String> arrayList4 = (List<String>) arrayList3.clone();
		
		
	}

}
