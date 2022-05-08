/**
 * 
 */
package com.towerplus.designpattern.template;

/**
 * @author Administrator
 *
 */
public abstract class Movie {
	
	public abstract void introduction();
	public abstract void storyTelling();
	public abstract void climax();
	public final void moviePlaySequence() {
		introduction();
		storyTelling();
		climax();
	}

}
