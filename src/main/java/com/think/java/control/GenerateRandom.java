package com.think.java.control;

import java.util.Random;

/**
 * Exercise 2: (2) Write a program that generates 25 random int values. For each
 * value, use an if-else statement to classify it as greater than, less than, or
 * equal to a second randomly generated value.
 * 
 * @author vhtuan
 *
 */
public class GenerateRandom {

	public void genRandom(int totalNumbers) {

		Random rd = new Random();
		int num1 = rd.nextInt(totalNumbers);
		for (int i = 0; i < totalNumbers; i++) {
			int num2 = rd.nextInt(totalNumbers);
			
			System.out.print(num1 + " vs " + num2 + " | ");
		}
	}

}
