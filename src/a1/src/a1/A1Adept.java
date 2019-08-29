package a1;

import java.util.Scanner;
import.java.util.HashMap

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		// Your code follows here.
		String[] output = new String[3];
	int selection = scan.nextInt();
	Hashmap<String, Double> menu = new HashMap<String, Double>; 
	for (int i = 0; i < selection; i++) {
		menu.put(scan.next(), scan.nextDouble());	
	}
	int customers = scan.nextInt();
	String[] Customers = new String[customers];
	Double[] spent = new Double[customers];
	for (int i = 0; i < customers; i++) {
		Customers[i] = scan.next(); + " " + scan.next();
		itemsbought = scan.nextInt();
		for (int j = 0; j < itemsbought; i++) {
			spent[i] = ( scan.nextInt(); * menu.get(scan.next()));
		}
		
	}
	System.out.prinln("Biggest: " +  )
}
