package com.think.java.ex7;

public class Incrementable {

	public static void increment() {
		StaticTest.i = StaticTest.i + 1;
		System.out
				.println("call increment from Static method | static i = 47 | "
						+ StaticTest.i);

	}

	public void increamentNoStatic() {
		StaticTest st = new StaticTest();
		st.j = st.j + 1;
		System.out
				.println("call increment from  Non-Static methos |  j = 10 | "
						+ st.j);
	}

}
