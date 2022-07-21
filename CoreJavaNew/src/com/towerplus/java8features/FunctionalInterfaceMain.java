/**
 * 
 */
package com.towerplus.java8features;

/**
 * @author Administrator
 *
 */
public class FunctionalInterfaceMain {
	
	public static void main() {
		
		IBroker brokerInterface  = (buildingNames) -> System.out.println(buildingNames);
		
	}

}
