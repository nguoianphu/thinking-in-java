package com.think.java.ex9;

public class Wrapper {

	public void charWrapper() {
		char c = 'x';
		System.out.println("char c = 'x' | " + c);
		Character ch = new Character(c);
		System.out.println("Character ch = new Character(c) | " + ch);
		Character ch1 = 'y';
		System.out.println("Character ch1 = 'y' | " + ch1);
		char c1 = ch1;
		System.out.println("char c1 = ch1 | " + c1);
	}

	public void doubleWrapper() {
		double c = 1.5;
		System.out.println("double c = 1.5 | " + c);
		Double ch = new Double(c);
		System.out.println("Double ch = new Double(c) | " + ch);
		Double ch1 = 19.6;
		System.out.println("Double ch1 = 19.6 | " + ch1);
		double c1 = ch1;
		System.out.println("double c1 = ch1 | " + c1);
	}
}
