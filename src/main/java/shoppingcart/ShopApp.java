package shoppingcart;

import java.util.ArrayList;
import java.util.Scanner;

public class ShopApp {

	public static void main(String[] args) {
		
//ArrayList<Item> ingredients = new ArrayList<>();
Cart myCart = new Cart(null, 0, 0);
Scanner input = new Scanner(System.in);
String response = "y";

while(response.equalsIgnoreCase("y")){
	System.out.println("Enter the name of the item: ");
	String itemName = input.nextLine();
	System.out.println("Enter the unit price: ");
	double price = input.nextDouble();
	System.out.println("Enter the quantity: ");
	int quantity = input.nextInt();
	//ingredients.add(new Item (itemName, price, quantity));
	myCart.addOrder(itemName, price, quantity);
	input.nextLine();
	myCart.showCart();
	System.out.println("Would you like to remove an item? (y/n): ");
	String wantToRemove = input.nextLine();
	if(wantToRemove.equalsIgnoreCase("y")) {
		System.out.println("What item would you like to remove: ");
		String itemToRemove = input.nextLine();
	myCart.removeItems(itemToRemove);
	}
	
	System.out.println("Continue shopping? (y/n): ");
	response = input.nextLine();
}
//for(Item items : ingredients) {
//	total +=items.getPrice()*items.getNumberOfItems();
//}
//System.out.println("Current Cart: ");
//for(Item items: ingredients) {
//	System.out.println("Name: " + items.getItemName() + " Price: " + items.getPrice() + " Quantity: " + items.getNumberOfItems());
//}
myCart.showCart();
System.out.println("Total Price: " + myCart.getTotal());
	}

}
