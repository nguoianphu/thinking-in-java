package com.think.java;

import com.think.java.operators.Assignment;
import com.think.java.operators.Dogs;
import com.think.java.operators.FloatClass;
import com.think.java.operators.Print;
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

		System.out.println("Ex4");
		Dogs spot = new Dogs();
		spot.name = "Spot";
		spot.says = "Rurf!";
		System.out.println(spot.name + " " + spot.says);
		Dogs scruffy = new Dogs();
		scruffy.name = "Scruffy";
		scruffy.says = "Wurf!";
		System.out.println(scruffy.name + " " + scruffy.says);
		System.out.println("#############################");

	}

}
