package main.java.lesson2;

public class PineTree {
    public static void main(String[] args) {

        int height = 5;

        for (int i = 0; i < height; i++) {
            for (int space = 0; space < height - i; space++) {
                System.out.print(" ");
            }
            for (int star = 0; star < 2 * i + 1; star++) {
                System.out.print("*");
            }
            System.out.println();
        }


        for (int i = 0; i < height; i++) {
            System.out.print(" ");
        }
        System.out.println("*");

    }
}