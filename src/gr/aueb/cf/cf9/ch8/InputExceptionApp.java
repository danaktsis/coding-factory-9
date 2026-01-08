package gr.aueb.cf.cf9.ch8;

import java.util.Scanner;

public class InputExceptionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;

        System.out.println("Please enter one int");

        while (!scanner.hasNextInt()) {
            System.out.println("Μη αποδεκτοί χαρακτήρες");
            scanner.next();
        }

        num = scanner.nextInt();
        System.out.println("Num: " + num);
    }
}
