package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class PowerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;
        int i = 1;

        System.out.println("Δώσε την βάση");
        base = scanner.nextInt();
        System.out.println("Δώσε την δύναμη");
        power = scanner.nextInt();

        while (i <= power) {
            result = result * base;
            i++;
        }

        System.out.println("Το αποτέλεσμα είναι: " + result);
    }
}
