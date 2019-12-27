package com.bridgeLabz.functionalPrograms;

import java.util.Scanner;





import java.lang.Math;

public class quadratic{
	
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values of a,b and c");
		
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		//to calculate roots of the equation
		double det=b*b-4*a*c;
		double r1= (-b+Math.sqrt(det))/2*a;
		double r2= (-b-Math.sqrt(det))/2*a;
		System.out.println("root1 and root2="+r1+r2);
		
		
		
	}
	
}