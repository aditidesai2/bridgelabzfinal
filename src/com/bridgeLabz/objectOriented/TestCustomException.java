package com.bridgeLabz.objectOriented;

public class TestCustomException {

	static void validate(int age) throws InvalidAgeException {
		if (age < 18)
			throw new InvalidAgeException("Under 18 not allowed");
		else
			System.out.println("Welcome to vote");

	}

	static void valname (String name) throws InvalidNameException {
	  if (name!="aditi")
			  
		  throw new InvalidNameException("Not Aditi");
		  else
			  System.out.println("Vote Submitted. BYE!");
			  
	  		 
   }

	public static void main(String args[]) {
		try {
			
			validate(19);
			valname("durga");
		} catch (InvalidAgeException m) {
			System.out.println("Exception occured: " + m.getMessage());
		}
		catch (InvalidNameException m)
		{
			System.out.println("Exception occured: "+m.getMessage());
		}

	}
}