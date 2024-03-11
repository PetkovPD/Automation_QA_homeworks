package main.java.lesson4;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (1-7) representing the day of the week: ");
        int userInput = scanner.nextInt();

        String dayName;
        switch (userInput) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid number";
                break;
        }

        System.out.println("The " + userInput + getOrdinalSuffix(userInput) + " day of the week is " + dayName + ".");
    }

    private static String getOrdinalSuffix(int number) {
        if (number >= 4) {
            return "th";
        }
        switch (number) {
            case 1:
                return "st";
            case 2:
                return "nd";
            case 3:
                return "rd";
            default:
                return "th";
        }
    }
}