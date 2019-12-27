package com.bridgeLabz.algorithm;

import com.bridgeLabz.utility.Util;

/**
 * prints the prime number between the range given by user.

 */
public class PrimeNumberRange {

	public static void main(String[] args) {
		System.out.println("Enter the lower limit of the range :");
		int lowerLimit = Util.scanner.nextInt();
		System.out.println("Enter the upper limit of the range :");
		int upperLimit = Util.scanner.nextInt();
		Util.scanner.close();
		for (int number = lowerLimit; number <= upperLimit; number++) {
			if (Util.isPrime(number)) {
				System.out.println(number);
			}
		}
	}
}