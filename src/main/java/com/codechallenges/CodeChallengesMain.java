package com.codechallenges;

import java.io.PrintStream;

import com.codechallenges.bit.BITMain;
import com.codechallenges.techgig.TechgigMain;

public class CodeChallengesMain {

	PrintStream out = System.out;
	BITMain bit = new BITMain();
	TechgigMain techgig = new TechgigMain();
	
	public void main() {
		bit.main();
		techgig.main();
	}

}
