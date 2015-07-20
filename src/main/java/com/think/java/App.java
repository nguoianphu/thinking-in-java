package com.think.java;

import com.think.java.ex1.Ex1;
import com.think.java.ex2.HelloDate;
import com.think.java.ex3.ATypeNam;
import com.think.java.ex4.DataOnly;
import com.think.java.ex6.Storage;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		System.out.println("#############");

		System.out.println("Ex1");
		Ex1 ex1 = new Ex1();
		System.out.println("public int int1: " + ex1.int1);
		System.out.println("public char char1: " + ex1.char1);
		System.out.println("#############");

		System.out.println("Ex2");
		HelloDate helloDate = new HelloDate();
		helloDate.printDate();
		System.out.println("#############");

		System.out.println("Ex3");
		ATypeNam a = new ATypeNam();
		a.runATypeNam();
		System.out.println("#############");

		System.out.println("Ex4-5");
		DataOnly data = new DataOnly();
		data.myInt = 10;
		System.out.println(data.myInt);
		data.myDouble = 3.3;
		System.out.println(data.myDouble);
		data.myBoolean = false;
		System.out.println(data.myBoolean);
		System.out.println("#############");

		System.out.println("Ex6");
		Storage s = new Storage();
		int ex6 = s.storage("stograge");
		System.out.println(ex6);
		System.out.println("#############");

		System.out.println("Ex7");
		System.out.println("#############");

		System.out.println("Ex8");
		System.out.println("#############");

		System.out.println("Ex9");
		System.out.println("#############");

		System.out.println("Ex10");
		System.out.println("#############");

		System.out.println("Ex11");
		System.out.println("#############");

		System.out.println("Ex12");
		System.out.println("#############");

		System.out.println("Ex13");
		System.out.println("#############");

		System.out.println("Ex14");
		System.out.println("#############");

		System.out.println("Ex15");
		System.out.println("#############");

		System.out.println("Ex16");
		System.out.println("#############");

	}

}

/*
 * 
 * 
 * Exercise 1: (2) Create a class containing an int and a char that are not
 * initialized, and print their values to verify that Java performs default
 * initialization.
 * 
 * Exercise 2: (1) Following the HelloDate.java example in this chapter, create
 * a hello, world program that simply displays that statement. You need only a
 * single method in your class (the “main” one that gets executed when the
 * program starts). Remember to make it static and to include the argument list,
 * even though you don’t use the argument list. Compile the program with javac
 * and run it using java. If you are using a different development environment
 * than the JDK, learn how to compile and run programs in that environment.
 * 
 * Exercise 3: (1) Find the code fragments involving ATypeName and turn them
 * into a program that compiles and runs.
 * 
 * Exercise 4: (1) Turn the DataOnly code fragments into a program that compiles
 * and runs.
 * 
 * 
 * Exercise 5: (1) Modify the previous exercise so that the values of the data
 * in DataOnly are assigned to and printed in main( ).
 * 
 * Exercise 6: (2) Write a program that includes and calls the storage( ) method
 * defined as a code fragment in this chapter.
 * 
 * Exercise 7: (1) Turn the Incrementable code fragments into a working program.
 * 
 * Exercise 8: (3) Write a program that demonstrates that, no matter how many
 * objects you create of a particular class, there is only one instance of a
 * particular static field in that class.
 * 
 * Exercise 9: (2) Write a program that demonstrates that autoboxing works for
 * all the primitive types and their wrappers.
 * 
 * Exercise 10: (2) Write a program that prints three arguments taken from the
 * command line. To do this, you’ll need to index into the command-line array of
 * Strings. Exercise 11: (1) Turn the AllTheColorsOfTheRainbow example into a
 * program that compiles and runs.
 * 
 * Exercise 12: (2) Find the code for the second version of HelloDate.java,
 * which is the simple comment documentation example. Execute Javadoc on the
 * file and view the results with your Web browser.
 * 
 * Exercise 13: (1) Run Documentation1.java, Documentation2.java, and
 * Documentation3.java through Javadoc. Verify the resulting documentation with
 * your Web browser.
 * 
 * Exercise 14: (1) Add an HTML list of items to the documentation in the
 * previous exercise.
 * 
 * Exercise 15: (1) Take the program in Exercise 2 and add comment documentation
 * to it. Extract this comment documentation into an HTML file using Javadoc and
 * view it with your Web browser.
 * 
 * Exercise 16: (1) In the Initialization & Cleanup chapter, locate the
 * Overloading.java example and add Javadoc documentation. Extract this comment
 * documentation into an HTML file using Javadoc and view it with your Web
 * browser.
 */
