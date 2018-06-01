package shoppingcart;

import java.util.ArrayList;

public class Cart {
	ArrayList<Item> ingredients = new ArrayList<>();
	String itemName;
	double price;
	int quantity;
	public Cart(String itemName, double price, int quantity) {
		this.itemName = itemName;
	}
	public void addOrder(String itemName, double price, int quantity) {
		ingredients.add(new Item (itemName, price, quantity));
	}
public double getTotal() {
	double total = 0;
	for(Item items : ingredients) {
		total +=items.getPrice()*items.getNumberOfItems();
	}
	return total;
}
public void showCart() {
	System.out.println("Current Cart: ");
	for(Item items: ingredients) {
		System.out.println("Name: " + items.getItemName() + " Price: " + items.getPrice() + " Quantity: " + items.getNumberOfItems());
	}
}

public void removeItems(String itemToRemove) {
	for (int i=ingredients.size()-1; i>=0; i--) {
		if(ingredients.get(i).getItemName().equalsIgnoreCase(itemToRemove)) {
		ingredients.remove(i);
		}
	}
	
}


}
