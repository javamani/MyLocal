package com.towerplus.designpatterns.structural.decorator;

//https://www.tutorialspoint.com/design_pattern/decorator_pattern.htm

/*
 * https://www.geeksforgeeks.org/decorator-design-pattern-in-java-with-example/
 * Create an interface.
Create concrete classes implementing the same interface.
Create an abstract decorator class implementing the above same interface.
Create a concrete decorator class extending the above abstract decorator class.
Now use the concrete decorator class created above to decorate interface objects.
Lastly, verify the output
 * 
 */
public class BankClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank = new BankImpl();
		Bank bankDecorated = new BankDecoratorConcreteClass(new BankImpl());
		System.out.println("regular ones is" + bank.getAccOpeningOffers());		
		System.out.println("Extended functionality is" + bankDecorated.getAccOpeningOffers());	
	}

}
