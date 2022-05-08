/**
 * 
 */
package com.towerplus.designpattern.factory;

/**
 * @author Administrator
 *
 */
public class FactoryPatternClient {
	
	public static void main(String[] args) {		
		// Depending on the client request , return the object without exposing the creation logic
		
		String userType = "student";		
		UserFactory userFactory = new UserFactory();		
		UserInterface userObject = userFactory.getUser(userType);
		userObject.performSomeLogic();		
		System.out.println("completed");
	}
}
