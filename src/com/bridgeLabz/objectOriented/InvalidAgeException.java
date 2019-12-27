package com.bridgeLabz.objectOriented;

@SuppressWarnings("serial")
public class InvalidAgeException extends Exception{  
 InvalidAgeException(String s){  
  super(s);   
 }  

}
@SuppressWarnings("serial")
class InvalidNameException extends Exception {
	InvalidNameException (String s){
		super(s);
	}
}
