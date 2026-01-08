package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class TemperatureApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature = 0;
        boolean isTempBelowZero = false;

        System.out.println("Δώσε θερμοκρασία");
        temperature = scanner.nextInt();

        isTempBelowZero = temperature < 0;

        System.out.println("Η θερμοκρασία είναι μικρότερη από το 0:" + isTempBelowZero);

    }
}
