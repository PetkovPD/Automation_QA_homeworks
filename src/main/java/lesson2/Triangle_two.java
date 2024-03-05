package main.java.lesson2;
import java.util.Scanner;

public class Triangle_two {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of side 'a': ");
        double a = scanner.nextDouble();

        System.out.println("Enter the length of side 'b':");
        double b = scanner.nextDouble();

        System.out.println("Enter the length of side 'c':");
        double c = scanner.nextDouble();

        //'s' is semi-perimeter
        double s = (a + b + c) / 2;

        //Heron's formula
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        System.out.println("Area of the triangle is: " + area);


    }
}