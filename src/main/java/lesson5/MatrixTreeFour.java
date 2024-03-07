package main.java.lesson5;

public class MatrixTreeFour {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {4, 5, 6}
        };

        for (int i = 0; i < matrix.length; i++) {
            for (int p = 0; p < matrix[i].length; p++) {
                System.out.print(matrix[i][p] + " ");
            }
            System.out.println();
        }
    }
}