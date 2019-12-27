package com.bridgeLabz.basic;

import java.util.Scanner;

public class multi { 
    public static void main(String[] args) 
    { 
  
        int[][] arr = new int[3][3]; 
        System.out.println("ENTER MULTI ARRAY");
       
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
        	for(int j=0;j<3;j++)
        	{
        		arr[i][j]=sc.nextInt();
        	}
        }
         
        for(int i=0;i<3;i++)
        {
        	for(int j=0;j<3;j++)
        	{
              System.out.println("arr["+i+"]["+j+"] = "+ arr[i][j]);
            }
        }
    }
}