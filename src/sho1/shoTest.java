package sho1;

import static org.junit.Assert.*;
//import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

public class shoTest {
	cartTest c = new cartTest();

	@Test
	public void test() {
		
			assertTrue(c.counter==0);
			
	}
	
	@Test
	public void test1() {
		
		int price = 127 ;
		c.addBook(price); 
		assertTrue(c.counter ==1 && c.price == 127);
		
		//fail("Not yet implemented");
	}
	@Test
	public void test2() {
		
		int price = 100 ;
		
		c.addBook(price); 
		assertTrue(c.counter ==2 && c.price == 227);
		
		//fail("Not yet implemented");
	}

}

