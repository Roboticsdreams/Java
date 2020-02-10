package com.application;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.codechallenges.CodeChallengesMain_Test;
import com.codechallenges.bit.BITMain_Test;
import com.codechallenges.bit.PatternProgramsMain_Test;
import com.codechallenges.techgig.BeginnerCodeChampMain_Test;
import com.codechallenges.techgig.MasterCodeChampMain_Test;
import com.codechallenges.techgig.PrimeCodeChampMain_Test;
import com.codechallenges.techgig.TechWeekChallengeMain_Test;
import com.codechallenges.techgig.TechgigMain_Test;
import com.interviewquest.InterviewQuestMain_Test;
import com.interviewquest.cisco.CiscoMain_Test;
import com.interviewquest.freshworks.FreshworksMain_Test;
import com.onlinecourses.OnlineCoursesMain_Test;
import com.onlinecourses.codingbat.CBWarmup_Test;
import com.onlinecourses.codingbat.CodingBatMain_Test;
import com.onlinecourses.hackerrank.interviewpreparationkit.InterviewPreparationKitMain_Test;
import com.onlinecourses.hackerrank.HackerRankMain_Test;
import com.onlinecourses.hackerrank.interviewpreparationkit.IPKWarmup_Test;

@RunWith(Suite.class)
@SuiteClasses({
	App_Test.class,
	CodeChallengesMain_Test.class,
	BITMain_Test.class,
	PatternProgramsMain_Test.class,
	TechgigMain_Test.class,
	BeginnerCodeChampMain_Test.class,
	MasterCodeChampMain_Test.class,
	PrimeCodeChampMain_Test.class,
	TechWeekChallengeMain_Test.class,
	InterviewQuestMain_Test.class,
	CiscoMain_Test.class,
	FreshworksMain_Test.class,
	OnlineCoursesMain_Test.class,
	CodingBatMain_Test.class,
	CBWarmup_Test.class,
	HackerRankMain_Test.class,
	InterviewPreparationKitMain_Test.class,
	IPKWarmup_Test.class,
	
})
public class AppTestSuite {

}
