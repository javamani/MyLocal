package com.towerplus.corejava.coreconcepts;

import java.util.HashMap;
import java.util.Map;

public final class ImmutableClassExample {
	
	private final String name;
	
	private final String role;
	
	private final long userId;
	
	private final Map<String,String> userDetailsMap;
	
	public String getName() {
		return name;
	}

	public String getRole() {
		return role;
	}

	public long getUserId() {
		return userId;
	}

	public Map<String, String> getUserDetailsMap() {
		return userDetailsMap;
	}	

	ImmutableClassExample(String name,String role, long userId,Map<String,String> userDetailsMap) {		
		this.name = name;
		this.role = role;
		this.userId = userId;
		this.userDetailsMap = userDetailsMap;		
	}
	
	public static void main(String args[]) {
		
		 String name = "Name";
		
		String role = "role";
		
		long userId = 117128;
		
		Map<String,String> userDetailsMap = new HashMap<String,String>();
		
		userDetailsMap.put("1", "Mani");
		userDetailsMap.put("2", "Second");
		userDetailsMap.put("3", "Third");
				
		ImmutableClassExample exampleObject = new ImmutableClassExample(name,role,userId,userDetailsMap);
		
		System.out.println("name is " + exampleObject.getName());
		System.out.println("role is " + exampleObject.getRole());
		System.out.println("userId is " + exampleObject.getUserId());
		System.out.println("exampleObject is " + exampleObject.getUserDetailsMap());
		
		name = "new name";
		role = "new role";
		userId = 607972;
		userDetailsMap.put("4", "Four");
		
			
		System.out.println("name is " + exampleObject.getName());
		System.out.println("role is " + exampleObject.getRole());
		System.out.println("userId is " + exampleObject.getUserId());
		System.out.println("exampleObject is " + exampleObject.getUserDetailsMap());
		
		
		
	}
	

}
