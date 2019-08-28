package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int count = scan.nextInt();

        String[] names = new String[count];
        double[] totalPrice = new double[count];

        for (int i = 0; i < count; i++) {
            names[i] = scan.next().charAt(0) + ". " + scan.next();
            int items = scan.nextInt();
            for (int j = 0; j < items; j++) {
                double total = 0;
                total += scan.nextInt() * scan.nextDouble();
                totalPrice[j] = total;		
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.println(names[i] + totalPrice[i]);
        }

    }

}