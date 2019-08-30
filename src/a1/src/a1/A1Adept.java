package a1;

import java.util.Scanner;


public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int amntOfItems = scan.nextInt();
		
		String[] items = new String[amntOfItems];
		
		double[] itemPrices = new double[amntOfItems];
	
		for (int i = 0; i < amntOfItems; i++) {
			items[i] = scan.next();
			itemPrices[i] = scan.nextDouble();
			}
		
		int amntOfCustomers = scan.nextInt();
		String[] customers = new String[amntOfCustomers];
		double[] totalSpent = new double[amntOfCustomers];
		int customerItems;
		double itemAmt;
		String food;
		
		for (int i = 0; i < amntOfCustomers; i++) {
			customers[i] = scan.next() + " " + scan.next();
			customerItems = scan.nextInt();
			double total = 0;
			for(int j = 0; j < customerItems; j++) {
				itemAmt = scan.nextDouble();
				food = scan.next();
				for(int k = 0; k < amntOfItems; k++) {
					if(food.equals(items[k])) {
						total += (itemAmt * itemPrices[k]);
					}
						
				}
			}
			totalSpent[i] = total;
		}
		double max= totalSpent[0];
		String maxc = customers[0];
		double min = totalSpent[0];
		String minc = customers[0];
		double tot = 0;
	
		
		for (int i = 0; i < totalSpent.length; i++) {
            if(totalSpent[i]>max) {
            	max = totalSpent[i];
            	maxc = customers[i];
            }
		}
            
        for (int i = 0; i < totalSpent.length; i++) {
            if(totalSpent[i]<min) {
            	min = totalSpent[i];
            	minc = customers[i];
            }
        }
        for (int i = 0; i < totalSpent.length; i++) {
            tot += totalSpent[i];
            }
      System.out.println("Biggest: " + maxc + " (" + String.format("%.2f", max) + ")");
      System.out.println("Smallest: " + minc + " (" + String.format("%.2f", min) + ")");
      System.out.println("Average:" + " " + String.format("%.2f", tot/customers.length));
      
    
            
	
}
}
		
		
