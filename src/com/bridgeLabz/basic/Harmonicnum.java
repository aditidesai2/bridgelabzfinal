package com.bridgeLabz.basic;
import java.util.Scanner;

public class Harmonicnum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  number");
		int n=sc.nextInt();
	
		double d=0;
		 if (n!=0)   {
			 
		for(double i=1; i<=n;i++) {
         
			d=d+(1/i);

	}
		System.out.println(d);
		
		 
}
	}
}
