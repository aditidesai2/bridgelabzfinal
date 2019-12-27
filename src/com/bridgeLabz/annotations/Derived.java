package com.bridgeLabz.annotations;

class Derived extends Base 
{ 
     @Override
     public void Display() 
     { 
         System.out.println("Derived display()"); 
     } 
     @Deprecated
     public void DisplaySuppressed() 
     { 
         System.out.println("Deprecatedtest display()"); 
     } 
} 