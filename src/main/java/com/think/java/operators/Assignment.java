package com.think.java.operators;

public class Assignment {

	FloatClass ft1 = new FloatClass();
	FloatClass ft2 = new FloatClass();

	public void myAssignment() {

		ft1.myFloat = 10.5f;
		ft2.myFloat = 22.5f;

		System.out.println("1: ft1.myFloat: " + ft1.myFloat + ", ft2.myFloat: "
				+ ft2.myFloat);
		ft1 = ft2;
		System.out.println("2: ft1.myFloat: " + ft1.myFloat + ", ft2.myFloat: "
				+ ft2.myFloat);
		ft1.myFloat = 27;
		System.out.println("3: ft1.myFloat: " + ft1.myFloat + ", ft2.myFloat: "
				+ ft2.myFloat);

	}

	public void myPassObject(FloatClass ft) {

		ft.myFloat = 100.5f;
		// System.out.println("ft.myFloat: " + ft.myFloat);

	}

}
