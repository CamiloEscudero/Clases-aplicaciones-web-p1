package unibe.edu.ec.examen;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class HumanTest {
    private Human human;
    
    @Before
    public void before() {
    	human= new Human();
    	String name="Camilo";
    	human.setName(name);
    	human.setHigh(180.00);
    	

    }
	
	@Test
	public void testGetNameLength() {
		assertEquals(6, human.getNameLenght());
	}
	
    @Test
    public void testDivisionHigh() {
	assertEquals(10.0, human.divisioHihg(18.0), 0.1);
	
	
    }
    
	}