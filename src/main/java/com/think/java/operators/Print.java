package com.think.java.operators;

import java.util.Date;

public class Print {

	/*
	 * Print with a newline
	 */
	public void print() {

		System.out.println("Print with a newline");
		System.out.println(new Date());
	}

	/*
	 * Print with no line break:
	 */
	public void shortPrint() {
		System.out.print("Print with no line break \n");
		System.out.print(new Date());
	}

}
