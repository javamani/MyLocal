/**
 * 
 */
package com.towerplus.designpattern.template;

/**
 * @author Administrator
 *
 */
public class EnglishMovie extends Movie {

	@Override
	public void introduction() {
		System.out.println("English movie intro");

	}

	@Override
	public void storyTelling() {
		System.out.println("English movie story");

	}

	@Override
	public void climax() {
		System.out.println("English movie climax");

	}

}
