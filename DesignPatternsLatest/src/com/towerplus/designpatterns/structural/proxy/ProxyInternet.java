package com.towerplus.designpatterns.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternet implements Internet {

	static List<String> restrictedSitesList = new ArrayList<String>();
	RealInternet realInternet = new RealInternet();
	static {
		restrictedSitesList.add("tamilgun");
		restrictedSitesList.add("enthusan");
		restrictedSitesList.add("tamilhdbox");
	}
	
	@Override
	public String connectTo(String serverHostName) {
		// TODO Auto-generated method stub
		System.out.println("Handled by proxy");
		if(null != serverHostName && !serverHostName.isEmpty() && restrictedSitesList.contains(serverHostName))
		return "not allowed to connect";
		else 
			System.out.println("forwarded to real object");
			return realInternet.connectTo(serverHostName);
	}

}
