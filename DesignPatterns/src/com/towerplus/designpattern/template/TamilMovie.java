/**
 * 
 */
package com.towerplus.designpattern.template;

/**
 * @author Administrator
 *
 */
public class TamilMovie extends Movie {

	@Override
	public void introduction() {
		System.out.println("Tamil movie introduction");

	}

	@Override
	public void storyTelling() {
		System.out.println("Tamil movie story");

	}

	@Override
	public void climax() {
		System.out.println("Tamil movie climax");

	}

}
