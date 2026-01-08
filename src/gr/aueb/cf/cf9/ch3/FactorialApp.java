package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class FactorialApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        int factorial = 1;
        int i = 1;

        System.out.println("Δώσε τον αριθμό");
        num = scanner.nextInt();

        while (i <= num) {
            factorial = factorial * i;
            i++;
        }

        System.out.println("Το παραγοντικό είναι: " + factorial);
    }
}
