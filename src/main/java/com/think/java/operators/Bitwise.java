package com.think.java.operators;

/**
 * Exercise 10: (3) Write a program with two constant values, one with
 * alternating binary ones and zeroes, with a zero in the least-significant
 * digit, and the second, also alternating, with a one in the least-significant
 * digit (hint: It's easiest to use hexadecimal constants for this). Take these
 * two values and combine them in all possible ways using the bitwise operators,
 * and display the results using Integer.toBinaryString( ).
 * 
 * @author vhtuan
 *
 */
public class Bitwise {

	int n1 = 8;

	public void run() {

		System.out.println("int: " + n1);
		System.out.println("binary: " + Integer.toBinaryString(n1));
	}

}
