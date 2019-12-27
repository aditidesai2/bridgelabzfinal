package com.bridgeLabz.basic;
import java.util.Scanner;

public class stringg {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter user name");
		String s=sc.nextLine();
		String s2= "Hello <<userename>>, How are you?";
		 
		if(s.length()>=3) {
			String s3=s2.replace("userename", s);
			System.out.println(s3);
		}

		else {
			System.out.println("enter user name with more than 03 charactor");

			}

		}
}
