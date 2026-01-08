package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class DigitsApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int digits = 0;
        int inputNum = 0;

        System.out.println("Give number");
        num = scanner.nextInt();

        inputNum = num;
        while (num > 0) {
            num = num / 10;
            digits++;
        }

        System.out.printf("The number of digits in %d is: %d%n", inputNum, digits);
    }
}
