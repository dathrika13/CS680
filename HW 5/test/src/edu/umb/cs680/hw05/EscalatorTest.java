/**
 * 
 */
package edu.umb.cs680.hw05;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EscalatorTest {
	private static Escalator escalator;
	@BeforeAll
	public static void setUpBeforeClass() throws Exception {	
	escalator = Escalator.getInstance();
	}
	@Test
    public void verifyEscalator() {
	Escalator escalator = Escalator.getInstance();
	State expected = null;
	expected = Stopped.getInstance();
	assertEquals(expected, escalator.getState());
	}
	
	@Test
    public void getInstanceForDifferentObjectsIsEqual() {
	Escalator escalator1 = Escalator.getInstance();
	Escalator escalator2 = Escalator.getInstance();
	assertTrue(escalator1==escalator2);
	}
	
	
	
}
