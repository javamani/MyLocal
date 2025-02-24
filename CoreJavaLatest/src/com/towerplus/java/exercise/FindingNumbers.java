package com.towerplus.java.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindingNumbers {
	
	public static void main(String[] args) {
       
        List<Integer> numbers = Arrays.asList(10, 15, 8, 49, 25, 98, 32);
        List<Integer> result = getNumberstartingWithOne(numbers);
        System.out.println(result);
    }

    public static List<Integer> getNumberstartingWithOne(List<Integer> numbers) {
        List<Integer> result = new ArrayList<>();
        for (int num : numbers) {
            if (String.valueOf(num).startsWith("1")) {
                result.add(num);
            }
        }        
        return result;
    }

}
