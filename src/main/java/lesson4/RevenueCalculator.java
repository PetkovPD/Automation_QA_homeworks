package main.java.lesson4;

import java.util.Scanner;

public class RevenueCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter unit price: ");
        double unitPrice = scanner.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        scanner.close();

        double revenue = unitPrice * quantity;


        double discountRate = 0;
        if (quantity >= 100 && quantity <= 120) {
            discountRate = 0.15;
        } else if (quantity > 120) {
            discountRate = 0.20;
        }

        double discountAmount = revenue * discountRate;
        double discountedRevenue = revenue - discountAmount;

        System.out.printf("The revenue from sale: $%.2f%n", discountedRevenue);
        System.out.printf("Discount: $%.2f (%.1f%%)%n", discountAmount, discountRate * 100);
    }
}