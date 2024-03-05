package main.java.lesson2;

import java.util.Scanner;

public class Triangle_one {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length for sideA: ");
        double sideA = scanner.nextDouble();

        System.out.println("Enter length for sideB: ");
        double sideB = scanner.nextDouble();

        System.out.println("Enter length for sideC: ");
        double sideC = scanner.nextDouble();

        double perimeter = sideA + sideB + sideC;
        System.out.println("Perimeter of triangle = " + perimeter);

    }
}