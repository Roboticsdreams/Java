package com.rdreams.suites;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SelectPackages(value = { "com.rdreams.interviewprep","com.rdreams.interviewquest","com.rdreams.onlinecourses"})
@SuiteDisplayName("App Test Suite")
public class AppTestSuite {}
