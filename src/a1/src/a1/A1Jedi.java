package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Your code follows here

		int amntOfItems = scan.nextInt();

		String[] items = new String[amntOfItems];

		double[] itemPrices = new double[amntOfItems];

		// set up array up items and item prices

		for (int i = 0; i < amntOfItems; i++) {
			items[i] = scan.next();
			itemPrices[i] = scan.nextDouble();
		}

		// set up customer array and array of total amount of each food

		int amntOfCustomers = scan.nextInt();
		String[] customers = new String[amntOfCustomers];
		int[] totalFood = new int[amntOfItems];
		int[] totalCustomers = new int[amntOfItems];
		int customerItems = 0;
		int itemAmt = 0;
		String food;
		// go through each customer
		for (int i = 0; i < amntOfCustomers; i++) {
			customers[i] = scan.next() + scan.next();
			customerItems = scan.nextInt();
			
			

			// if food item matches, add Amount to total food array, else add 0

			for (int j = 0; j < customerItems; j++) {
				itemAmt = scan.nextInt();
				food = scan.next();
				for(int k = 0; k<items.length; k++) {
					if (food.equals(items[k])) {
						totalFood[k] += itemAmt;
						totalCustomers[k]++;
					}
					} 
				
			
			}
		}
		for (int l = 0; l < items.length; l++) {
			if (totalFood[l] == 0) {
				System.out.println("No customers bought " + items[l]);
			} else {
				System.out.println(totalCustomers[l] + " customers bought " + totalFood[l] + " " + items[l]);
			}

		}

	}
}
