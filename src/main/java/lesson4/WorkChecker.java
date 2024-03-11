package main.java.lesson4;

import java.util.Scanner;

public class WorkChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        if (age >= 16 && age <= 65) {
            System.out.println("You are eligible to work.");
        } else if (age > 65) {
            System.out.println("Sorry, you are not eligible to work due to retirement.");
        } else {
            System.out.println("Sorry, you are not eligible to work.");
        }
    }
}