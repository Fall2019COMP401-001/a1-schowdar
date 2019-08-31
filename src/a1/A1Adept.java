package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//read number of items in the store
		int numItems = scan.nextInt();
		
		//Name of customer who spent the most
		String biggestName = "";
		
		//biggest total spent by customer
		double biggestTotal = 0.0;
		
		//Name of customer who spent the least
		String smallestName = "";
		
		//smallest total spent by customer
		double smallestTotal = 9999999.0;
		
		//total amount for all customers
		double allCustomersTotal = 0.0;
		
		//parallel array for storing item names
		String [] itemNames = new String[numItems];
		
		//parallel array for price of item
		double [] itemPrices = new double[numItems];
		
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
			
			//customer total
			double customerTotal = 0.0;
			
			for (int j = 0; j < boughtItemsCount; j++) {
				
				//read quantity of item bought
				int itemQuantity = scan.nextInt();
				
				//read name of the item bought
				String boughtItemName = scan.next();
				
				//calculate total amount for customer
				for (int k = 0; k < itemNames.length; k++) {
					if (itemNames[k].equalsIgnoreCase(boughtItemName)) {
						customerTotal += itemPrices[k] * (double)itemQuantity;
					}
				}
				
			}
			
			//update biggest total amount and name
			if (customerTotal > biggestTotal) {
				biggestTotal = customerTotal;
				biggestName = firstName + " " + lastName;
			}
			
			//update smallest total amount and name
			if (customerTotal < smallestTotal) {
				smallestTotal = customerTotal;
				smallestName = firstName + " " + lastName;
			}
			
			//update total amount for all customers
			allCustomersTotal += customerTotal;
		}
		
		//calculate the average amount
	    double average = allCustomersTotal / (double)numCustomers;
		
	    //print the output
		System.out.println("Biggest: " + biggestName + "(" + String.format("%.2f", biggestTotal) + ")");
		System.out.println("Smallest: " + smallestName + "(" + String.format("%.2f", smallestTotal) + ")");
		System.out.println("Average: " + String.format("%.2f", average));
	}
}
