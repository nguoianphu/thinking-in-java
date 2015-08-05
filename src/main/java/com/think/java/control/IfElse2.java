package com.think.java.control;

/**
 * Exercise 6: (2) Modify the two test( ) methods in the previous two programs
 * so that they take two extra arguments, begin and end, and so that testval is
 * tested to see if it is within the range between (and including) begin and
 * end.
 * 
 * @author vhtuan
 *
 */
public class IfElse2 {

	public int test(int testval, int target) {
		if (testval > target)
			return +1;
		else if (testval < target)
			return -1;
		else
			return 0; // Match
	}
	
	public void testBetween(int testval, int begin, int end) {
		if (begin <= testval  && testval <= end)
			System.out.println(testval + " betweens " + begin + " and " + end);
		else 
			System.out.println(testval + " does NOT between " + begin + " and " + end);
	}


}
