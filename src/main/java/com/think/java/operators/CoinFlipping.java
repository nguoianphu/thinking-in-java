package com.think.java.operators;

import java.util.Random;

/**
 * Exercise 7: (3) Write a program that simulates coin-flipping.
 * 
 * @author vhtuan
 *
 */
public class CoinFlipping {

	private boolean heads;

	public void throwing() {

		Random rd = new Random();
		heads = rd.nextBoolean();

		System.out.println("The heads is: " + heads);
	}

}
