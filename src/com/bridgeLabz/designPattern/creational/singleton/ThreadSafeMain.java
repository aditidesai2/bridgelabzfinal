package com.bridgeLabz.designPattern.creational.singleton;;

public class ThreadSafeMain {

	public static void main(String[] args) {
		System.out.println(ThreadSafe.getInstanceUsingDoubleLocking() instanceof ThreadSafe);
	}

}