package com.think.java.operators;

/**
 * Exercise 13: (1) Write a method that displays char values in binary form.
 * Demonstrate it using several different characters.
 * 
 * @author vhtuan
 *
 */
public class CharExample {

	public void printBinary(char c) {
		System.out.println("char c = " + c);
		System.out.println("Print Binary: " + Integer.toBinaryString(c));
		System.out.println("Print Integer: "
				+ Integer.parseInt(Integer.toBinaryString(c), 2));
	}
}
