package com.sapient.test;

import com.sapient.junit.Money;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import junit.framework.TestCase;

public class MoneyTestCase {
	Money mRefObject;
	
	@Before
	public void setUp() throws Exception {
		mRefObject = new Money(1200, "INR");	
	}
	
	@Test
	public final void testAdd(){
		int expected = 1200+1100;
		Money temp = new Money(1100, "INR");
		int actual = mRefObject.add(temp).amount();
		assertEquals(expected, actual);
	}
	
	@Test
	public final void testAddNegative() {
		int expected = 1200;
		Money temp = new Money(-1100, "INR");
		int actual = mRefObject.add(temp).amount();
		assertEquals(expected, actual);
	}
	
	@Test
	public final void testConstructor() {
		Money newMoney = new Money(-300, "INR");
		assertEquals(newMoney.amount(), 0);
	}
	
	@Test
	public final void testGetAmount() {
		int expected = 1200;
		assertEquals(expected, mRefObject.amount());
	}
	
	@Test
	public final void testGetCurrency() {
		String expected = "INR";
		assertEquals(expected, mRefObject.currency());
	}
	
	
	

}
