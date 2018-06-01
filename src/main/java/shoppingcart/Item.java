package shoppingcart;

public class Item {
	private String itemName;
	private double price;
	private int quantity;
	
	public Item(String itemName, double price, int quantity) {
		this.itemName = itemName;
		this.price = price;
		this.quantity = quantity;
	}

public String getItemName() {
	
	return itemName;
}

public int getNumberOfItems() {
	
	return quantity;
}

public double getPrice() {
	
	return price;
}

}
