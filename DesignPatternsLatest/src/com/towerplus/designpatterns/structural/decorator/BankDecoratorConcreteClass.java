package com.towerplus.designpatterns.structural.decorator;

public class BankDecoratorConcreteClass extends BankDecorator {

	public BankDecoratorConcreteClass(Bank decoratedBank) {
		super(decoratedBank);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	  public String getAccOpeningOffers() {
			return mainBankObj.getAccOpeningOffers() + "New deposit offers added";
	  }

}
