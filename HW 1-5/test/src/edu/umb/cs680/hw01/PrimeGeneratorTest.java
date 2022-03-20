package edu.umb.cs680.hw01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PrimeGeneratorTest {
	//Positive Test
			@Test
			 public void primesBetweenTenToTwenty() {
			       PrimeGenerator primeGenerator = new PrimeGenerator(10, 20);
			       primeGenerator.generatePrimes();
			       Long[] expectedprimes = {11L, 13L, 17L, 19L };
			       assertArrayEquals(expectedprimes, primeGenerator.getPrimes().toArray());
			 }

			//Negative Test
			@Test
			 public void ifPrimesArePresentInAGivenRange() {
			       PrimeGenerator primeGenerator = new PrimeGenerator(1, 20);
			       primeGenerator.generatePrimes();
			       assertNotEquals(0,primeGenerator.getPrimes().size());
			 }
			
			@Test
			 public void numberOfPrimesInGivenRange() {
			       PrimeGenerator primeGenerator = new PrimeGenerator(40,70);
			       primeGenerator.generatePrimes();
			       assertEquals(7, primeGenerator.getPrimes().size());
			 }
			
			@Test
		    public void inputRangeWithNegativeValues() {
				try {
		            PrimeGenerator primeGenerator = new PrimeGenerator(-10, 20);
		            primeGenerator.generatePrimes();
		        } catch (RuntimeException ex) {
		            assertEquals("Wrong input values: from=-10 to=20", ex.getMessage());
		        }
				try {
		            PrimeGenerator primeGenerator = new PrimeGenerator(10, -20);
		            primeGenerator.generatePrimes();
		        } catch (RuntimeException ex) {
		            assertEquals("Wrong input values: from=10 to=-20", ex.getMessage());
		        }
				try {
		            PrimeGenerator primeGenerator = new PrimeGenerator(-10, -20);
		            primeGenerator.generatePrimes();
		        } catch (RuntimeException ex) {
		            assertEquals("Wrong input values: from=-10 to=-20", ex.getMessage());
		        }  
		    }
}
