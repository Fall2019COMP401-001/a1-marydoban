package a1;

import java.util.Scanner;
import java.util.HashMap;

public class A1Adept {

	/* public static void main(String[] args) {
		
		static double findValueMax(Double[] vals) {
			
			// Initialize current minimum to first value in array.
			double cur_max = vals[0];
			
			// Starting with second value (if any), compare each value
			// in array with current minimum and replace if smaller.
			
			for (int i=1; i < vals.length; i++) {
				if (vals[i] > cur_max) {
					cur_max = vals[i];
				}
			}
			
			return cur_max;
		}
		
		Scanner scan = new Scanner(System.in);
		// Your code follows here.
	
		int selection = scan.nextInt();
		
		HashMap<String, Double> menu = new HashMap<String, Double>; 
		
		for (int i = 0; i < selection; i++) {
			menu.put(scan.next(), scan.nextDouble());	
	}
		int customers = scan.nextInt();
		String[] Customers = new String[customers];
		Double[] spent = new Double[customers];
		for (int k = 0; k < customers; k++) {
			Customers[i] = scan.next() + " " + scan.next();
			int itemsbought = scan.nextInt();
			for (int j = 0; j < itemsbought; j++) {
				spent[i] = ( scan.nextInt() * menu.get(scan.next()));
		}
	}
		
	}
	System.out.println("Biggest: " + findValueMax(spent) + )
	}
}
*/
