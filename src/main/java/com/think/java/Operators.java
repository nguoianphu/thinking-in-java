package com.think.java;

import com.sun.org.apache.xml.internal.utils.StringComparable;
import com.think.java.operators.Assignment;
import com.think.java.operators.Bitwise;
import com.think.java.operators.CharExample;
import com.think.java.operators.CoinFlipping;
import com.think.java.operators.Dogs;
import com.think.java.operators.Exponents;
import com.think.java.operators.FloatClass;
import com.think.java.operators.Literals;
import com.think.java.operators.Print;
import com.think.java.operators.ShilfOperators;
import com.think.java.operators.StringCompare;
import com.think.java.operators.Velocity;

/*
 * 
 * At the lowest level, data in Java is manipulated using operators.
 * 
 */
public class Operators {

	public static void main(String[] args) {

		System.out.println("Ex1");
		Print pt = new Print();
		pt.print();
		pt.shortPrint();
		System.out.println("#############################");

		System.out.println("Ex2");
		Assignment as = new Assignment();
		as.myAssignment();
		System.out.println("#############################");

		System.out.println("Ex3");
		FloatClass ft = new FloatClass();
		ft.myFloat = 60.5f;
		System.out.println("1: ft.myFloat: " + ft.myFloat);
		as.myPassObject(ft);
		System.out.println("2: ft.myFloat: " + ft.myFloat);
		System.out.println("#############################");

		System.out.println("Ex4");
		Velocity vl = new Velocity();
		vl.distance = 100;
		vl.time = 20;
		vl.velocity();
		System.out.println("#############################");

		System.out.println("Ex5");
		Dogs spot = new Dogs();
		spot.name = "Spot";
		spot.says = "Rurf!";
		System.out.println(spot.name + " " + spot.says);
		Dogs scruffy = new Dogs();
		scruffy.name = "Scruffy";
		scruffy.says = "Wurf!";
		System.out.println(scruffy.name + " " + scruffy.says);
		System.out.println("#############################");

		System.out.println("Ex6");
		Dogs rex = new Dogs();
		// rex = spot;
		rex.name = spot.name;
		rex.says = spot.says;
		System.out.println(rex == spot);
		System.out.println(rex.equals(spot));
		System.out.println(rex.name == spot.name);
		System.out.println(rex.says.equals(spot.says));
		System.out.println(rex.says == spot.says);
		System.out.println("#############################");

		System.out.println("Ex7");
		CoinFlipping cf = new CoinFlipping();
		cf.throwing();
		System.out.println("#############################");

		System.out.println("Ex8");
		Literals lt = new Literals();
		lt.longRun();
		System.out.println("#############################");

		System.out.println("Ex9");
		Exponents ex = new Exponents();
		ex.minMax();
		System.out.println("#############################");

		System.out.println("Ex10");
		Bitwise bw = new Bitwise();
		bw.run();
		System.out.println("#############################");

		System.out.println("Ex11 + Ex12");
		ShilfOperators so = new ShilfOperators();
		int i = 15;
		System.out.println("i = " + i);
		so.leftShilf(i);
		so.rightShilf(i);
		System.out.println("#############################");

		System.out.println("Ex13");
		CharExample ce = new CharExample();
		char a = 'a';
		ce.printBinary(a);
		char x = 'x';
		ce.printBinary(x);
		char y = 'y';
		ce.printBinary(y);
		System.out.println("#############################");

		System.out.println("Ex14");
		StringCompare sc = new StringCompare();
		sc.compare("think", "think");
		sc.compare("java", "JAVA");
		System.out.println("#############################");
	}

}
