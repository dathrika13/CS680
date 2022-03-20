package edu.umb.cs680.hw02;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SingletonTest {
	
	@Test
	public void getInstanceForDifferentObjectsIsEqual() {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		assertTrue(s1==s2);
	}

	@Test
	public void getInstanceReturnNotNullValue() {
		assertNotNull(Singleton.getInstance());
	}
}
