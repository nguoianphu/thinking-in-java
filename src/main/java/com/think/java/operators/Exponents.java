package com.think.java.operators;

/**
 * Exercise 9: (1) Display the largest and smallest numbers for both float and
 * double exponential notation.
 * 
 * @author vhtuan
 *
 */
public class Exponents {

	public void minMax() {

		// Uppercase and lowercase 'e' are the same:
		float expFloat = 1.39e-43f;
		expFloat = 1.39E-43f;
		System.out.println(expFloat);
		double expDouble = 47e47d; // 'd' is optional
		System.out.println(expDouble);

		System.out.println("Min Float: " + Float.MIN_VALUE);
		System.out.println("Max Float: " + Float.MAX_VALUE);
		System.out.println("Min Double: " + Double.MIN_VALUE);
		System.out.println("Max Double: " + Double.MAX_VALUE);
	}

}
