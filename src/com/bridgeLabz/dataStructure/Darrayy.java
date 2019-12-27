package com.bridgeLabz.dataStructure;
import java.util.Scanner;

public class Darrayy{
    
    public static void main(String args[]){
        
       
       int rows=10;
       int columns=1000;
       
          
        
       int twoD[][]=new int[rows][columns];
        
          
        for(int i=2; Util.isPrime(i); i++)
         {           
        	
            for(int j=0; j<columns;j++)
            {
            	if (Util.isPrime(j)==true)
            	{
            		twoD[i][j]=j;	
            	}
                
            }
         }
        System.out.print("\nData you entered : \n");
        for(int []x:twoD){
            for(int y:x){
            System.out.print(y==0 ? " ":y+"");
            }
            System.out.println();
        }
        
    }  
    
}