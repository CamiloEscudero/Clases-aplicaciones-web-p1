package unibe.edu.ec.examen;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Itemtest {
	private Product product;
	private Item item;
	
	@Before
	public void before() {
		product = new Product(10.12, 20);
	    item = new Item(product, 0.15, 0.12);
	}
	

	@Test
	public void testGetRealDiscount() {
		assertEquals(1.518, item.getRealDiscount(), 0.10);
	}
	@Test
	public void testGetRealTax() {
		assertEquals(6.6792, item.getRealTax(5.5),0.10 );
	}

}
