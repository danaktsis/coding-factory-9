package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

public class KiloToGrams {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int GRAMS_IN_KILO = 1_000;
        int massInKg = 0;
        int massInGrams = 0;

        System.out.println("Παρακαλώ εισάγετε την μάζα σε κιλά:");
        massInKg = scanner.nextInt();
        massInGrams = massInKg * GRAMS_IN_KILO;

        System.out.printf("Μάζα σε κιλά: %d, Μάζα σε γραμμάρια: %,d%n", massInKg, massInGrams);
    }
}
