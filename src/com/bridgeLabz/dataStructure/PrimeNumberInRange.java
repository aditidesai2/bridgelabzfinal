package com.bridgeLabz.dataStructure;

import com.bridgeLabz.utility.Array;
import com.bridgeLabz.utility.Util;

/*
 * it checks the data if it is prime or not . if prime then it add the data in a
 * group of 100 elements till it reaches user define range data. if the number
 * is found to be prime then prints the data. in 2D array.
 * 

 */
public class PrimeNumberInRange {
	private static int[][] arr = new int[10][100];

	
	 // if prime then it add the data in a group of 100 elements till it reaches user
	  //define range data.

	 
	public static int[][] findPrime(int start, int end) {
		while (start <= end) {
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					if (Util.isPrime(start)) {
						arr[i][j] = start;
					}
					start++;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int start = 1;
		int end = 1000;
		findPrime(start, end);
		Array.print2DArray(arr);

	}

}