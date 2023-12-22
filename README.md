![GitHub top language](https://img.shields.io/github/languages/top/Roboticsdreams/Java?style=flat)
![GitHub last commit](https://img.shields.io/github/last-commit/Roboticsdreams/Java?style=flat)
![ViewCount](https://views.whatilearened.today/views/github/Roboticsdreams/Java.svg?cache=remove)
# Java
Java Workouts

## Steps to download and execute this project

- Download and Install [Java](https://www.oracle.com/in/java/technologies/downloads/)
- Download the [Protable Apache-Maven](https://maven.apache.org/download.cgi), Extract and Place it some path like C:\PortableApps\apache-maven-3.9.6
- Set Environment variable for JAVA_HOME is C:\Program Files\Java\jdk-21
- Set Environment variable for MAVEN_HOME is C:\PortableApps\apache-maven-3.9.6
- Download the [Java](https://github.com/Roboticsdreams/Java.git)
- Unzip the zip file.
- Update the pom.xml with your java version
- Run the mvn clean command from ternimal
- Then run mvn test command to general build and execute all the tests from src/test/java/com/rdreams/suites/AppTestSuite.java
- This will run all the test cases and generate the code coverage report in target folder
- Now, goto target/site/jacoco/index.html open this html using browser will see the coverage for all java files

## Sample Folder Structure
- Java
	- src
		- main
			- java\com\rdreams
				- interviewprep
				- interviewquest
				- onlinecourses
		- test
			- java\com\rdreans
				- interviewprep
				- interviewquest
				- onlinecourses
				- suites
                    - AppTestSuite.java
	- target
		- site/jacoco
            - index.html

## Output
[See the code coverage](https://htmlpreview.github.io/?https://github.com/Roboticsdreams/Java/blob/master/target/site/jacoco/index.html)