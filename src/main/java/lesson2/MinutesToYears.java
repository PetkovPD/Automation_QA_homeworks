package main.java.lesson2;

import java.util.Scanner;

public class MinutesToYears {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of minutes:");
        long minutes = input.nextLong();

        long minutesInYear = 60 * 24 * 365;
        long year = minutes / minutesInYear;
        long remainingMinutes = minutes % minutesInYear;
        long day = remainingMinutes / 60 / 24;

        System.out.println(minutes + " minutes is approximately " + year + " years and " + day + " days.");
    }
}