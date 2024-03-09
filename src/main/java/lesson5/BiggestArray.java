package main.java.lesson5;

class BiggestArray {
    public static void main(String[] args) {
        int[] arr = {13, 333, 66, 999, 8844};
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Largest element in the given array is: " + max);
    }
}