package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

public class PowerMethodApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int exponent = 0;
        int result = 0;

        System.out.println("Δώσε την βάση και τον εκθέτη");
        base = scanner.nextInt();
        exponent = scanner.nextInt();

        result = power(base, exponent);

        System.out.println("Το αποτέλεσμα είναι: " + result);
    }

    public static int power(int base, int exponent) {
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        return result;
    }
}
