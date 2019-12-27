package com.bridgeLabz.designPattern.creational.singleton;

public class LazyMain {

	public static void main(String[] args) {
		Lazy.getInstance();
		System.out.println(Lazy.getInstance() instanceof Lazy);
	}

}