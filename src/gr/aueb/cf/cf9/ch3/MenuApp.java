package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class MenuApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int choice = 0;

        do {
            System.out.println("Παρακαλώ επιλέξτε:");
            System.out.println("1. Εισαγωγή αίτησης");
            System.out.println("2. Διαγραφή αίτησης");
            System.out.println("3. Έξοδος");
            choice = scanner.nextInt();
        } while (choice != 3);

        System.out.println("Ευχαριστούμε");
    }
}
