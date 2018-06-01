package shoppingcart;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ItemTest {
@Test
public void shouldReturnNameOfItem(){
	Item underTest = new Item("", 0, 0);
	String check = underTest.getItemName();
	assertEquals("",check);
	
}
@Test 
public void shouldReturnNumberOfItems() {
	Item underTest = new Item("", 0, 0);
	int check = underTest.getNumberOfItems();
	assertEquals(0,check);
}
public void shouldReturnPriceOfItem() {
	Item underTest = new Item("", 0, 0);
	double check = underTest.getPrice();
	assertEquals(0.0,check,0);
}
}
