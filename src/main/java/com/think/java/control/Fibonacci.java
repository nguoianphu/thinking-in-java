package com.think.java.control;

public class Fibonacci {

	// Java program for Fibonacci number using recursion.
	public int fibonacciRecusion(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}

		return fibonacciRecusion(number - 1) + fibonacciRecusion(number - 2); // tail
																				// recursion
	}

	// Java program for Fibonacci number using Loop.
	public int fibonacciLoop(int number) {
		if (number == 1 || number == 2) {
			return 1;
		}
		int fibo1 = 1, fibo2 = 1, fibonacci = 1;
		for (int i = 3; i <= number; i++) {
			fibonacci = fibo1 + fibo2; // Fibonacci number is sum of previous
										// two Fibonacci number
			fibo1 = fibo2;
			fibo2 = fibonacci;

		}
		return fibonacci; // Fibonacci number
	}

}
