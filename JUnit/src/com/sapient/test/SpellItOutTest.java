package com.sapient.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sapient.junit.SpellItOut;

public class SpellItOutTest {
	SpellItOut num0, num1, num8, num10, num13, num22, num77, num80, num100, num136, num1000, num1339, num8921, num9000;
	
	@Before
	public void setUp() throws Exception {
		num0 = new SpellItOut(0);
		num1 = new SpellItOut(1);
		num8 = new SpellItOut(8);
		num10 = new SpellItOut(10);
		num13 = new SpellItOut(13);
		num22 = new SpellItOut(22);
		num77 = new SpellItOut(77);
		num80 = new SpellItOut(80);
		num100 = new SpellItOut(100);
		num136 = new SpellItOut(136);
		num1000 = new SpellItOut(1000);
		num1339 = new SpellItOut(1339);
		num8921= new SpellItOut(8921);
		num9000 = new SpellItOut(9000);
		
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public final void testNum0() {
		String expectedResult = "zero";
		assertEquals(expectedResult, num0.convertedString());
	}
	
	@Test
	public final void testNum1() {
		String expectedResult = "one";
		assertEquals(expectedResult, num1.convertedString());
	}
	
	@Test
	public final void testNum1000() {
		String expectedResult = "one thousand";
		assertEquals(expectedResult, num1000.convertedString());
	}
	
	@Test
	public final void testNum1339() {
		String expectedResult = "one thousand three hundred thirty-nine";
		assertEquals(expectedResult, num1339.convertedString());
	}
	
	@Test
	public final void testNum9000() {
		String expectedResult = "nine thousand";
		assertEquals(expectedResult, num9000.convertedString());
	}

	@Test
	public final void testNum8921() {
		String expectedResult = "eight thousand nine hundred twenty-one";
		assertEquals(expectedResult, num8921.convertedString());
	}

	@Test
	public final void testNum8() {
		String expectedResult = "eight";
		assertEquals(expectedResult, num8.convertedString());
	}
	
	@Test
	public final void testNum10() {
		String expectedResult = "ten";
		assertEquals(expectedResult, num10.convertedString());
	}

	@Test
	public final void testNum13() {
		String expectedResult = "thirteen";
		assertEquals(expectedResult, num13.convertedString());
	}
	
	@Test
	public final void testNum22() {
		String expectedResult = "twenty-two";
		assertEquals(expectedResult, num22.convertedString());
	}
	@Test
	public final void testNum77() {
		String expectedResult = "seventy-seven";
		assertEquals(expectedResult, num77.convertedString());
	}
	@Test
	public final void testNum80() {
		String expectedResult = "eighty";
		assertEquals(expectedResult, num80.convertedString());
	}
	@Test
	public final void testNum100() {
		String expectedResult = "one hundred";
		assertEquals(expectedResult, num100.convertedString());
	}
	@Test
	public final void testNum136() {
		String expectedResult = "one hundred thirty-six";
		assertEquals(expectedResult, num136.convertedString());
	}
	
	@Test
	public final void testNumDigits() {
		int expectedResult = 1;
		assertEquals(expectedResult, num1.checkNumDigits());
	}

}
