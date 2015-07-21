package com.think.java.ex2;

import java.util.Date;

/**
 * The first Thinking in Java example program. Displays a string and todays
 * date.
 * 
 * @author Bruce Eckel
 * @author www.MindView.net
 * @version 4.0
 */
public class HelloDate {

	/**
	 * Entry point to class & application.
	 * 
	 * @param args
	 *            array of string arguments
	 * @throws exceptions
	 *             No exceptions thrown
	 */
	public Date printDate() {
		Date myDate = new Date();

		System.out.println(new Date());
		return myDate;
	}
}/*Output: (55% match) Hello, its: Wed Oct 05 14:39:36 MDT 2005
 */// :~
