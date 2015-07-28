package com.think.java.operators;

/**
 * Exercise 4: (2) Write a program that calculates velocity using a constant distance and a
 constant time.
 */
public class Velocity {

	public double distance;
	public double time;

	public void velocity() {

		double velo;
		velo = distance / time;
		System.out.println("distance: " + distance + " km");
		System.out.println("time: " + time + " hours");
		System.out.println("velocity :" + velo + " km/hour");
	}

}
