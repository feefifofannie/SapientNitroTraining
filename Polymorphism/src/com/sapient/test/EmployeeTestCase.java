package com.sapient.test;

import static org.junit.Assert.*;
import junit.framework.TestCase;
import polyexamples.Confirmed;
import polyexamples.Contractor;
import polyexamples.Employee;
import polyexamples.HR;
import polyexamples.Intern;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTestCase extends TestCase{
	HR hrObjectRef = new HR();
	Employee intern, contractor, confirmed, notAnIntern, notAContractor, notAnEmployee, nullEmployee, notAConfirmed;
	@Before
	public void setUp() throws Exception {
		intern = hrObjectRef.recruit("I");
		contractor = hrObjectRef.recruit("T");
		confirmed = hrObjectRef.recruit("C");
		notAnIntern = hrObjectRef.recruit("C");
		notAContractor = hrObjectRef.recruit("I");
		notAConfirmed = hrObjectRef.recruit("B");
		notAnEmployee = hrObjectRef.recruit("A");
	}

	@After
	public void tearDown() throws Exception {
		
	}

	@Test
	public final void testRecruitIntern() {
		assertTrue(intern instanceof Intern);
	}
	
	@Test
	public final void testRecruitConfirmed() {
		assertTrue(confirmed instanceof Confirmed);
	}
	
	@Test
	public final void testRecruitContractor() {
		assertTrue(contractor instanceof Contractor);
	}
	
	@Test
	public final void testRecruitNotIntern() {
		assertFalse(notAnIntern instanceof Intern);
	}
	
	@Test
	public final void testRecruitNotContractor() {
		assertFalse(notAContractor instanceof Contractor);
	}
	
	@Test
	public final void testRecruitNotConfirmed() {
		assertFalse(notAConfirmed instanceof Confirmed);
	}
	
	@Test
	public final void testRecruitTypeInvalid() {
		assertFalse(notAnEmployee instanceof Employee);
	}
	
	@Test
	public final void testNullEmployee() {
		assertNull(nullEmployee);
	}
}
