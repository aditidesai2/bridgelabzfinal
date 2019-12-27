package com.bridgeLabz.basic;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class primefactors {

public static void main (String[] args)
{
	System.out.println("Enter number");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	primefactors1(n);
}
public static void primefactors1(int n) {
	while(n%2==0)	
	{
		System.out.println(2+" ");
		n=n/2;
	}
	for (int i=3;i*i<=n;i=i+2)
	{
		while (n%i==0)
		{
			System.out.println(i+" ");
			n=n/i;
			
		}
	}
	if(n>2)
		System.out.println(n);
}
}
	
