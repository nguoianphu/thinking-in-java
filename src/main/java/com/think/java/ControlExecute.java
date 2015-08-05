package com.think.java;

import com.think.java.control.Bitwise2Terany;
import com.think.java.control.BreakAndContinue;
import com.think.java.control.GenerateRandom;
import com.think.java.control.IfElse2;
import com.think.java.control.PrimeCheck;
import com.think.java.control.PrintValue;
import com.think.java.control.SwitchFor;

public class ControlExecute {

	public static void main(String[] args) {

		System.out.println("Ex1");
		PrintValue pt = new PrintValue();
		pt.print(1, 100);
		System.out.println("#####################");

		System.out.println("Ex2");
		GenerateRandom gr = new GenerateRandom();
		gr.genRandom(25);
		System.out.println("#####################");

		System.out.println("Ex3");
		// gr.genRandomWhile(3);
		System.out.println("#####################");

		System.out.println("Ex4");
		PrimeCheck pc = new PrimeCheck();

		for (int i = 0; i <= 20; i++) {
			pc.primeCheck(i);
		}
		System.out.println("#####################");

		System.out.println("Ex5");
		Bitwise2Terany bt = new Bitwise2Terany();
		bt.bitwise(10);
		bt.terany(10);
		bt.terany(0);
		System.out.println("#####################");

		System.out.println("Ex6");
		IfElse2 if2 = new IfElse2();
		int re = if2.test(11, 15);
		System.out.println(re);

		if2.testBetween(20, 6, 20);
		System.out.println("#####################");

		System.out.println("Ex7");
		BreakAndContinue bc = new BreakAndContinue();
		bc.forLoop();
		System.out.println("#####################");

		System.out.println("Ex8");
		SwitchFor sf = new SwitchFor();
		for (int i = 0; i < 20; i++) {
			sf.switchFor(i);
		}

		for (int i = 0; i < 20; i++) {
			sf.switchForBreak(i);
		}

		System.out.println("#####################");

		System.out.println("Ex9");
		System.out.println("#####################");

		System.out.println("Ex10");
		System.out.println("#####################");

		System.out.println("Ex11");
		System.out.println("#####################");

		System.out.println("Ex12");
		System.out.println("#####################");

		System.out.println("Ex13");
		System.out.println("#####################");

		System.out.println("Ex14");
		System.out.println("#####################");
	}
}
