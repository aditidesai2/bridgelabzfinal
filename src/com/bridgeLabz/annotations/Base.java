package com.bridgeLabz.annotations;
public class Base 
{ 
     public void Display() 
     { 
         System.out.println("Base display()"); 
     } 
     // If we comment below annotation, program generates 
    
       
     public static void main(String args[]) 
     { 
         Base t1 = new Derived(); 
         t1.Display(); 
         
         // If we comment below annotation, program generates 
         // warning 
         @SuppressWarnings({"unchecked", "deprecation"}) 
          
          
             Derived d1 = new Derived(); 
             d1.DisplaySuppressed(); 
          
         
     }    
     
    
} 