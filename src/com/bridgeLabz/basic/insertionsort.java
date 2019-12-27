// Java program for implementation of Insertion Sort 


package com.bridgeLabz.basic;
import com.bridgeLabz.utility.Array;
import com.bridgeLabz.utility.Sorting;
import com.bridgeLabz.utility.Util;

public class insertionsort {

	public static void main(String[] args) {

		String[] array = Util.readFile("//Users//rmddesai//Desktop//java.txt").split(",");
		String[] array1 = Sorting.insertionSort(array);
		Array.print1DArray(array);
		System.out.println("--------------------------------------");
		Array.print1DArray(array1);
	}

}