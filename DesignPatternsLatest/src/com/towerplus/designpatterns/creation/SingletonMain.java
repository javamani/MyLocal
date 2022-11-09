package com.towerplus.designpatterns.creation;

public class SingletonMain {

	public static void main(String[] args) {		
		// TODO Auto-generated method stub		
		for(int i = 0 ; i < 5 ; i++ ) {
			SingletonClass singleObject = SingletonClass.getInstance();
			System.out.println(singleObject.toString());
			singleObject.getMessage();
		}
	}

}
