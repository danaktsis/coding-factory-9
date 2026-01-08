package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

public class EvenOddApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        boolean isEven = false;

        System.out.println("Please enter a number: ");
        num = scanner.nextInt();

        isEven = isEven(num);

        if (isEven) {
            System.out.println("The number is even!");
        } else {
            System.out.println("The number is odd!");
        }

    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isOdd(int num) {
        return !isEven(num);
    }
}
