package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class MenuApp2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int choice = 0;

        while (true) {
            System.out.println("Παρακαλώ επιλέξτε:");
            System.out.println("1. Εισαγωγή αίτησης");
            System.out.println("2. Διαγραφή αίτησης");
            System.out.println("3. Έξοδος");
            choice = scanner.nextInt();
            if (choice == 3) {
                break;
            }
        }

        System.out.println("Ευχαριστούμε");
    }
}
