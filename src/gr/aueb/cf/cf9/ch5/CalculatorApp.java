package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

public class CalculatorApp {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        int result = 0;
        final int EXIT = 6;

        while (true) {
            printMenu();
            choice = getOneInt();

            if (!isValid(choice)) {
                System.out.println("Η επιλογή πρέπει να είναι μεταξύ 1 έως 6");
                continue;
            }

            if (choice == EXIT) {
                System.out.println("Έξοδος...");
                break;
            }

            result = getResult(choice);
            System.out.println("Result: " + result);
        }
    }

    public static void printMenu() {
        System.out.println("Επιλέξτε ένα από τα παρακάτω: ");
        System.out.println("1. Πρόσθεση");
        System.out.println("2. Αφαίρεση");
        System.out.println("3. Πολλαπλασιασμός");
        System.out.println("4. Διαίρεση");
        System.out.println("5. Υπόλοιπο Διαίρεσης");
        System.out.println("6. Έξοδος");
    }

    public static int getOneInt () {
        return scanner.nextInt();
    }

    public static boolean isValid (int choice) {
        return (choice >= 1) && (choice <= 6);
    }

    public static int getResult(int choice) {
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        System.out.println("Δώσε τους δύο αριθμούς: ");
        num1 = getOneInt();
        num2 = getOneInt();

        return switch (choice) {
            case 1 -> add(num1, num2);
            case 2 -> sub(num1, num2);
            case 3 -> mul(num1, num2);
            case 4 -> div(num1, num2);
            case 5 -> mod(num1, num2);
            default -> 0;
        };
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int mul(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        if (b == 0) return 0;
        return a / b;
    }

    public static int mod(int a, int b) {
        if (b == 0) return 0;
        return a % b;
    }
}
