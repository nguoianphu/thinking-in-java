package com.think.java.operators;

/**
 * Exercise 14: (3) Write a method that takes two String arguments and uses all
 * the boolean comparisons to compare the two Strings and print the results. For
 * the == and !=, also perform the equals( ) test. In main( ), call your method
 * with some different String objects.
 * 
 * @author vhtuan
 *
 */
public class StringCompare {

	public void compare(String a, String b) {

		System.out.println("Compare " + a + " and " + b);
		System.out.println("a == b is " + (a == b));
		System.out.println("a != b is " + (a != b));
		System.out.println("a.equals(b) is " + a.equals(b));
	}
}
