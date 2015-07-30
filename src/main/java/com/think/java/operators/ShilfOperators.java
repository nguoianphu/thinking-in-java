package com.think.java.operators;

/**
 * The left-shift operator (<<) produces the operand to the left of the operator
 * after it has been shifted to the left by the number of bits specified to the
 * right of the operator (inserting zeroes at the lower-order bits). The signed
 * right-shift operator (>>) produces the operand to the left of the operator
 * after it has been shifted to the right by the number of bits specified to the
 * right of the operator.
 * 
 * @author vhtuan
 *
 */
public class ShilfOperators {

	public void leftShilf(int i) {
		System.out.println("i: " + Integer.toBinaryString(i));
		i <<= 10;
		System.out.println("i <<= 10: " + Integer.toBinaryString(i));
	}

	public void rightShilf(int i) {
		System.out.println("i: " + Integer.toBinaryString(i));
		i >>= 10;
		System.out.println("i >>=10: " + Integer.toBinaryString(i));
	}

}
