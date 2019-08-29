package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		//read number of customers
		int numCustomers = scan.nextInt();
		
		//looping through for each customer
		for (int i=0; i < numCustomers; i++) {
			//read customer first name
			String firstName = scan.next();
			
			//read customer last name
			String lastName = scan.next();
			
			//read number of items bought
			int numItems = scan.nextInt();
			
			//total price for customer
			double totalPrice = 0.0;
			//loop through for items bought
			for(int j=0; j<numItems; j++) {
				//Read quantity bought
				int itemQuantity = scan.nextInt();
				
				//Read item name
				String itemName = scan.next();
				
				//Read price of item
				double itemPrice = scan.nextDouble();
				
				//Calculate total price for customer
				totalPrice += itemPrice * (double)itemQuantity;
			}
			
			//print output for each customer
			System.out.println(firstName.charAt(0) + ". " + lastName + ": " + String.format("%.2f", totalPrice));
		}
		
	}
}
