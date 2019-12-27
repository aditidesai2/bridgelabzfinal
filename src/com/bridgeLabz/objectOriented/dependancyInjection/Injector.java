package com.bridgeLabz.objectOriented.dependancyInjection;

public class Injector {

	public static void main (String args[])
	{
	IService service1=new ServiceB();
	ClientA client1= new ClientA(service1);
	client1.doSomething();
	}
}