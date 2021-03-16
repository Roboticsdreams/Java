package com.onlinecourses.hackerrank.interviewpreparationkit;

import java.io.PrintStream;

public class InterviewPreparationKitMain {

	PrintStream out = System.out;
	IPKWarmup warmup = new IPKWarmup();
	public void main() {		
		System.out.println("Sock Merchant ="+warmup.sockMerchant(9, new int[] { 10, 20, 20, 10, 10, 30, 50, 10, 20 }));
		System.out.println("Counting Valleys =" + warmup.countingValleys(8, "UDDDUDUU"));
		System.out.println("Jumping on the clouds =" + warmup.jumpingOnClouds(new int[] { 0, 0, 1, 0, 0, 1, 0 }));
		System.out.println("Repeated String =" + warmup.repeatedString("aba",10));
	}	
}
