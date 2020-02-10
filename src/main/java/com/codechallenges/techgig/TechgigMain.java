package com.codechallenges.techgig;

import java.util.Arrays;

public class TechgigMain {
	BeginnerCodeChampMain beginnercode = new BeginnerCodeChampMain();
	MasterCodeChampMain mastercode = new MasterCodeChampMain();
	PrimeCodeChampMain primecode = new PrimeCodeChampMain();
	TechWeekChallengeMain techweekchallenge = new TechWeekChallengeMain();

	int input[][] = { { 1, 4, 30 }, { 5, 1, 100 }, { 1, 7, 40 }, { 5, 6, 60 }, { 2, 3, 10 }, { 3, 4, 20 },
			{ 2, 6, 200 }, { 4, 6, 300 }, { 6, 7, 50 } };
	
	public void main() {
		System.out.println("Finding Moves =" + beginnercode.findingMoves(2));
		System.out.println("Bengaluru Metro Routes ="+ mastercode.bengaluruMetroRoutes(7, 9, input));
		System.out.println("Game Center =" + Arrays.deepToString(primecode.gameCenter(new String[] { "12#45#33", "94#54#23", "98#59#27" })));
		System.out.println("Uncommon Between Common ="+techweekchallenge.uncommonBetweenCommon(new int[] {1,2,3,4,5}, new int[] {3,4,5,6,7}));
		System.out.println("Sentence Reverse ="+techweekchallenge.sentenceReverse("Man bites dog"));
	}
}
