package main.java.lesson5;

public class SumArrays {
    public static void main(String[] args) {
        int[] arr = { 11, 13, 7, 15 };
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println("Sum of the given array is: " + sum);
    }
}