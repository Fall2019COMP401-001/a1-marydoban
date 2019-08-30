package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();

        String[] output = new String[count];

        for (int i = 0; i < count; i++) {
            String first = scan.next();
            String last = scan.next();
            int items = scan.nextInt();

            double total = 0;

            for (int j = 0; j < items; j++) {
                double quant = scan.nextDouble();
                scan.next();
                double price = scan.nextDouble();

                total += quant * price;
            }

            output[i] = first.charAt(0) + ". " + last + " " + String.format("%.2f", total);

        }
        
        for (int i = 0; i < count; i++) {
            System.out.println(output[i]);
        }
    }
}