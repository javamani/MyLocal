/**
 * 
 */
package com.towerplus.designpattern.factory;

/**
 * @author Administrator
 *
 */
public class UserFactory {
	
	 public UserInterface getUser(String userType) {		 
		 if(userType == null) {
			 return null;
		 }
		 else if (userType.equalsIgnoreCase("student")) {
			 System.out.println("creating student object");
			 return new Student();
		 }
		 else if (userType.equalsIgnoreCase("employee")) {
			 System.out.println("creating employee object");
			 return new Employee();
		 }
		 return null;
	 }

}
