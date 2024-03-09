package main.java.lesson5;

public class MatrixDiagonals {
    public static void main(String[] args) {
        int[][] matrix = {
                { 5, 8, 1, 3 },
                { 8, 9, 2, 7 },
                { 1, 2, 3, 4 },
                { 4, 3, 2, 1 }
        };

        int principalDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int i = 0; i < matrix.length; i++) {
            principalDiagonalSum += matrix[i][i];
            secondaryDiagonalSum += matrix[i][matrix.length - i - 1];
        }

        System.out.println("Sum of Principal Diagonal: " + principalDiagonalSum);
        System.out.println("Sum of Secondary Diagonal: " + secondaryDiagonalSum);
    }
}