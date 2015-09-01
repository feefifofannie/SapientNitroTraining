package com.sapient.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import com.sapient.test.MoneyTestCase;
public class RunTest {
	public static void main(String[] args){
		Result result = JUnitCore.runClasses(MoneyTestCase.class);
		for (Failure failure : result.getFailures()){
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}
}

/*
* to run from command line:
* d:
* cd \workspace\SapientTraining\JUnit
* java -cp bin; "D: \JAVA LAB\junit-4.10/jar" com.sapient.test.RunTest
*/


/*
* Look up hamcrest for enhanced junit assert statements
* import static org.hamcrest.MatcherAssert.assertThat;
* import static org.hamcrest.Matchers.*;
*/