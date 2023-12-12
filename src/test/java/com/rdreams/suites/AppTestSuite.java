package com.rdreams.suites;


import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@SelectPackages({
        "com.rdreams.interviewprep",
        "com.rdreams.interviewquest",
        "com.rdreams.omlinecourses"
})

@Suite
@SuiteDisplayName("App Test Suite")
public class AppTestSuite {

}