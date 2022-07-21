/**
 * 
 */
package com.towerplus.java8features;

/**
 * @author Administrator
 *
 */
@FunctionalInterface
public interface IBroker {
	
	public void showHomes(String buildingNames);
	
	public default void getCommission() {
		System.out.println("Get 2% commission");
	}
	
	public static void reviewAgreementDoc() {
		System.out.println("static method");
	}
	
	@Override
	public String toString();
	
	@Override
	public boolean equals(Object obj);
	
}
