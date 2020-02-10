package com.onlinecourses.codingbat;

import java.io.PrintStream;

import com.onlinecourses.codingbat.Warmup;

public class CodingBatMain {

	PrintStream out = System.out;
	Warmup warmup = new Warmup();
	public void main() {
		System.out.println("Sleep In ="+warmup.sleepIn(false, false));
		System.out.println("Monkey Trouble ="+warmup.monkeyTrouble(true, true));
		System.out.println("Sum Double ="+warmup.sumDouble(1,2));
		System.out.println("Diff 21 ="+warmup.diff21(19));
		System.out.println("Max 1020 ="+warmup.max1020(11,19));
	}	
}
