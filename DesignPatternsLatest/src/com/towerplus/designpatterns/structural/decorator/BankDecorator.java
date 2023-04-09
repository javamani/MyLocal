package com.towerplus.designpatterns.structural.decorator;

public abstract class BankDecorator  implements Bank 
{
	  protected Bank mainBankObj;	
	
	  public BankDecorator(Bank decoratedBank) 
	  { 
		  	this.mainBankObj = 	  decoratedBank; 
	  }
	 
	  @Override
	  public String getAccOpeningOffers() {
			return mainBankObj.getAccOpeningOffers() ;
	  }
	
	
}
