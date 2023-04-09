package com.towerplus.designpatterns.structural.proxy;

public class RealInternet implements Internet{

	@Override
	public String connectTo(String serverHostName) {
		System.out.println("Real object invoked by the client");
		return "successfully Connected";
	}

}
