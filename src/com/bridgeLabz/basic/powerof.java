package com.bridgeLabz.basic;


import java.lang.Math;

public class powerof {
	
	public static void main (String args[]) {
	int n=Integer.parseInt(args[0]);
	for (int j=1;j<=Math.pow(2, n);j++)
	{
		System.out.println("2^="+Math.pow(2, j));
	}
 


}
	
}