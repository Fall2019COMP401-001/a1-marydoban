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
			

		for (int i = 0; i < amntOfItems; i++) {
            System.out.println(items[i]);
            System.out.println(itemPrices[i]);
	}
}
}
		
		
