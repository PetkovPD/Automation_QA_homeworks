package main.java.lesson4;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the type of vacation (Beach/Mountain): ");
        String vacationType = scanner.nextLine().toLowerCase();

        System.out.print("Enter your budget per day (in leva): ");
        double budgetPerDay = scanner.nextDouble();
        scanner.close();

        if (vacationType.equals("beach")) {
            if (budgetPerDay < 50) {
                System.out.println("Consider Bulgaria as a beach destination.");
            } else {
                System.out.println("Explore beach destinations outside Bulgaria.");
            }
        } else if (vacationType.equals("mountain")) {
            if (budgetPerDay < 30) {
                System.out.println("Consider Bulgaria as a mountain destination.");
            } else {
                System.out.println("Explore mountain destinations outside Bulgaria.");
            }
        } else {
            System.out.println("Sorry, there is no information about this type of vacation.");
        }
    }
}