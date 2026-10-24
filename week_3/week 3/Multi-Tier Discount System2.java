
// Online IDE - Code Editor, Compiler, Interpreter

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter purchase amount: ");
        double purchaseAmount = input.nextDouble();

        double discount;
        String tier;

        if (purchaseAmount < 1000) {
            discount = 0.0;
            tier = "No Discount";
        } else if (purchaseAmount < 2000) {
            discount = 0.05;
            tier = "5% Discount";
        } else if (purchaseAmount < 5000) {
            discount = 0.10;
            tier = "10% Discount";
        } else {
            discount = 0.15;
            tier = "15% Discount";
        }

        double finalPrice = purchaseAmount - (purchaseAmount * discount);

        System.out.println("Discount Tier: " + tier);
        System.out.printf("Final Discounted Price: %.2f%n", finalPrice);

        input.close();
    }
}
