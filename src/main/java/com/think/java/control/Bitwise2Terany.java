package com.think.java.control;

/**
 * Exercise 5: (4) Repeat Exercise 10 from the previous chapter, using the
 * ternary operator and a bitwise test to display the ones and zeroes, instead
 * of Integer.toBinaryString( ).
 * 
 * @author vhtuan
 *
 */
public class Bitwise2Terany {

	public void bitwise(int n1) {
		System.out.println("Using Integer.toBinaryString()");
		System.out.println("int: " + n1);
		System.out.println("binary: " + Integer.toBinaryString(n1));
	}

	public void terany(int input) {
		System.out.println("Usung Terany and % ");
		System.out.println("int: " + input);

		if (input == 0) {
			System.out.println("0");
			return;
		}
		String binary = "";
		for (; input > 0; ) {
			int rem = input % 2;
			binary = rem + binary;
			input = input / 2;
		}
		System.out.println(binary);
	}

}
