package com.bridgeLabz.designPattern.creational.singleton;
public class EagerInitialisationMain {

	public static void main(String[] args) {
		
		System.out.println(Eager.returnObject() instanceof Eager);
		System.out.println(Eager.returnObject() instanceof Eager);
		

	}

}