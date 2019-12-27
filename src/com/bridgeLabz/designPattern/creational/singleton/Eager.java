
package com.bridgeLabz.designPattern.creational.singleton;

public class Eager {
	
    private static Eager object= new Eager();
	
    private Eager() {}
    
	public static Eager returnObject() {
		return  object;
	}
}