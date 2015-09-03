package com.sapient.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ArithmeticTestCase.class, MoneyTestCase.class,
		PerfectNumbersTest.class, SpellItOutTest.class })
public class AllTests {

}
