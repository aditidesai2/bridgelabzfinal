package com.bridgeLabz.objectOriented.dependancyInjection;

public class ClientA {
	
	private IService service;
	
	public ClientA(IService service) {
		
		this.service=service;
	}
	public void doSomething() {
		
		String info=service.getInfo();
		System.out.println(info);
	}
	
	
}