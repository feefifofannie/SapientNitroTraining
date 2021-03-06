package com.sapient.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import com.sapient.junit.PerfectNumbers;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class PerfectNumbersTest {
	PerfectNumbers six, five, eight, twentyFour, twentyEight, zero, negativeSix;
	@Before
	public void setUp() throws Exception {
		six = new PerfectNumbers(6);
		five = new PerfectNumbers(5);
		eight = new PerfectNumbers(8);
		twentyFour = new PerfectNumbers(24);
		twentyEight = new PerfectNumbers(28);
		zero = new PerfectNumbers(0);
		negativeSix = new PerfectNumbers(-6);
	}
	

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testSumOfDivisors() {
		ArrayList<Integer> arrayToCompare = new ArrayList<Integer>();
		arrayToCompare.add(1);
		arrayToCompare.add(2);
		arrayToCompare.add(3);
		arrayToCompare.add(4);
		arrayToCompare.add(5);
		arrayToCompare.add(6);
		int expectedResult = 1+2+3+4+5+6;
		assertEquals(expectedResult, six.sumOfDivisors(arrayToCompare));
	}
	
	@Test
	public final void testFindDivisors() {
		ArrayList<Integer> expectedResult = new ArrayList<Integer>();
		expectedResult.add(1);
		expectedResult.add(2);
		expectedResult.add(4);
		assertEquals(expectedResult, eight.findDivisors());
	}
	
	@Test
	public final void testSix() {
		assertTrue(six.isPerfectNumber());
	}
	
	@Test
	public final void testRandom() {
		int one = 5;
		int two = 5;
		PerfectNumbers ranOne = new PerfectNumbers(28);
		PerfectNumbers ranTwo = new PerfectNumbers(28);
		assertEquals(ranOne.findDivisors(), ranTwo.findDivisors());
		//for objects, equals and same both look at reference
		//for collections, equals looks at value while same looks at reference
	}
	
	@Test
	public final void testFive() {
		assertFalse(five.isPerfectNumber());
	}
	
	@Test
	public final void testEight() {
		assertFalse(eight.isPerfectNumber());
	}
	
	@Test
	public final void testTwentyFour() {
		assertFalse(twentyFour.isPerfectNumber());
	}
	
	@Test
	public final void testTwentyEight() {
		assertTrue(twentyEight.isPerfectNumber());
	}
	
	@Test
	public final void testZero() {
		assertTrue(zero.isPerfectNumber());
	}
	
	@Test
	public final void testNegativeSix() {
		assertFalse(negativeSix.isPerfectNumber());
	}

}
