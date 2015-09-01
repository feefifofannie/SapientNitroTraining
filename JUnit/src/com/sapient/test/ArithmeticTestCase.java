package com.sapient.test;

import com.sapient.junit.Arithmetic;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import junit.framework.TestCase;

public class ArithmeticTestCase {
	int firstNum, secondNum;
	
	@Before
	public void setUp() throws Exception {
		firstNum = 2;
		secondNum = 4;
	}
	
	@Test
	public final void testSum() {
		int expectedResult = 6;
		Arithmetic arithmeticObjectRef = new Arithmetic();
		int actualResult = arithmeticObjectRef.sum(firstNum, secondNum);
		assertEquals(expectedResult, actualResult);
	}
	@After
	public void tearDown() throws Exception {
		firstNum = 0;
		secondNum = 0;
	}

}
