package com.think.java.control;

/**
 * Exercise 8: (2) Create a switch statement that prints a message for each
 * case, and put the switch inside a for loop that tries each case. Put a break
 * after each case and test it, then remove the breaks and see what happens.
 * 
 * @author vhtuan
 *
 */
public class SwitchFor {

	public void switchFor(int key) {

		switch (key) {
		case 5:
			System.out.println(key + " is 5");

		case 10:
			System.out.println(key + " is 10");

		case 15:
			System.out.println(key + " is 15");

		default:
			break;
		}

	}
	
	public void switchForBreak(int key) {

		switch (key) {
		case 5:
			System.out.println(key + " is 5 | with break");
			break;

		case 10:
			System.out.println(key + " is 10  | with break");
			break;

		case 15:
			System.out.println(key + " is 15  | with break");
			break;

		default:
			break;
		}

	}

}
