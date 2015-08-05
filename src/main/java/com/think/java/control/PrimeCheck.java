package com.think.java.control;

/**
 * Exercise 4: (3) Write a program that uses two nested for loops and the
 * modulus operator (%) to detect and print prime numbers (integral numbers that
 * are not evenly divisible by any other numbers except for themselves and 1).
 * 
 * @author vhtuan
 *
 */
public class PrimeCheck {

	public void primeCheck(int number) {

		boolean isPrime = true;

		for (int i = 2; i <= number / 2; i++) {
			int temp = number % i;
			if (temp == 0) {
				isPrime = false;
				break;
			}
		}
		// If isPrime is true then the number is prime else not
		if (isPrime)
			System.out.println(number + " is Prime Number");
		else
			System.out.println(number + " is not Prime Number");
	}

}
