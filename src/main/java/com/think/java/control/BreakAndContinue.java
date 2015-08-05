package com.think.java.control;

/**
 * Exercise 7: (1) Modify Exercise 1 so that the program exits by using the
 * break keyword at value 99. Try using return instead.
 * 
 * @author vhtuan
 *
 */
public class BreakAndContinue {

	public void forLoop() {

		for (int i = 0; i < 100; i++) {
			if (i == 99)
				 break; // Out of for loop
//				return; // Out of for loop
//				System.out.println(i + " vs ");
				
			if (i % 9 != 0)
				continue; // Next iteration
			System.out.println(i + " % ");

		}
	}

}
