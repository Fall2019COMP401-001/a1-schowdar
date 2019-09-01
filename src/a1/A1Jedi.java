package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//read number of items in the store
		int numItems = scan.nextInt();
		
		//parallel array for storing item names
		String [] itemNames = new String[numItems];
		
		//parallel array for price of item
		double [] itemPrices = new double[numItems];
		
		//parallel array for storing customer counts
		int [] customerCounts = new int[numItems];
		
		//parallel array for item counts
		int [] itemCounts = new int[numItems];
		
		//loop through items in the store
		for (int i = 0; i < numItems; i++) {
			
			//read name of item into parallel array
			itemNames[i] = scan.next();
			
			//read price of the item into parallel array
			itemPrices[i] = scan.nextDouble();
		}
		
		//read number of customers
		int numCustomers = scan.nextInt();
		
		//loop through number of customers
		for (int i = 0; i < numCustomers; i++) {
			
			//read first name of customer
			String firstName = scan.next();
			
			//read last name of customer
			String lastName = scan.next();
			
			//read number of items bought
			int boughtItemsCount = scan.nextInt();
			
			//parallel array to check if a customer bought an item already
			boolean [] isItemBought = new boolean[numItems];
			
			//loop through items bought to update the customer counts, item counts
			for (int j = 0; j < boughtItemsCount; j++) {
				
				//read quantity of item bought
				int itemQuantity = scan.nextInt();
				
				//read name of the item bought
				String boughtItemName = scan.next();
				
				//loop through items and update customer counts and item counts
				for (int k = 0; k < itemNames.length; k++) {
					//find index in item array and update customer counts using parallel array customerCounts
					if (itemNames[k].equalsIgnoreCase(boughtItemName)) {
						if (isItemBought[k] == false) {
							//customer buying the item first time
							customerCounts[k]++;
							
							//mark the parallel array to indicate that customer bought the item
							isItemBought[k] = true;
						}
						
						//update item counts
						itemCounts[k] += itemQuantity;
						break;
					}
				}
			}
		}
		
		//generate output for each item
		for (int i=0; i < numItems; i++) {
			//check if no customers bought the item
			if (customerCounts[i] == 0) {
				
				//no customer bought this item
				System.out.println("No customers bought " + itemNames[i]);
			}
			else {
				//some customers bought this item
				System.out.println(customerCounts[i] + " customers bought " + itemCounts[i] + " " + itemNames[i]);
			}
		}	
	}
}
