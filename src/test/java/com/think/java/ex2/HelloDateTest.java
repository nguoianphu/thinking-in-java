package com.think.java.ex2;

import java.util.Date;

import com.think.java.ex2.HelloDate;

import junit.framework.TestCase;

public class HelloDateTest extends TestCase {

	public void testHelloDate() {

		HelloDate helloDate = new HelloDate();
		Date myDate = new Date();
		assertEquals("Date test: ", myDate, helloDate.printDate());

	}

}
