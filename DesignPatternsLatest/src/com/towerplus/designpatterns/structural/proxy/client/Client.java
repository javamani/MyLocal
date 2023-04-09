package com.towerplus.designpatterns.structural.proxy.client;

import com.towerplus.designpatterns.structural.proxy.ProxyInternet;

public class Client {

	
	public static void main(String args[]) {		
		String serverHostName = "tamilgun1";
		ProxyInternet proxyInternet = new ProxyInternet();		
		System.out.println(proxyInternet.connectTo(serverHostName));
	}
}
