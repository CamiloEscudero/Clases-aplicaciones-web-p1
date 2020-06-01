package unibe.edu.ec.examen;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class NumbersTest {
	
	private Numbers number;
	
	@Before
	public void before() {
	  number = new Numbers(5, 5);
	}
	
	

	@Test
	public void testmult() {
		assertEquals(25,number.mult());
	}
	
    
    
    
	@Test 
	public void testdiv() {
		assertEquals(1, number.div(),1);
	
	}
	
	
	
}
	
	