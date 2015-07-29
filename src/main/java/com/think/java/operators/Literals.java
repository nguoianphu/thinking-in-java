package com.think.java.operators;

/**
 * Exercise 8: (2) Show that hex and octal notations work with long values. Use
 * Long.toBinaryString( ) to display the results.
 * 
 * @author vhtuan
 *
 */
public class Literals {
	long n1 = 200L; // long suffix
	long n2 = 200l; // long suffix (but can be confusing)
	long n3 = 0177; // Octal (leading zero)

	public void longRun() {

		System.out.println("n1: " + n1 + " => " + Long.toBinaryString(n1));
		System.out.println("n2: " + n2 + " => " + Long.toBinaryString(n2));
		System.out.println("n3: " + n3 + " => " + Long.toBinaryString(n3));
	}

}
