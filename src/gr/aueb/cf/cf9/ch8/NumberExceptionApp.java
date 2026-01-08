package gr.aueb.cf.cf9.ch8;

import java.util.Scanner;

public class NumberExceptionApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputStr = "";
        int num = 0;

        System.out.println("Please enter a number");

        while (!isInteger(inputStr = scanner.nextLine())) {
            System.out.println("Μη αποδεκτοί χαρακτήρες");
        }

        num = Integer.parseInt(inputStr);
        System.out.println("The number is: " + num);
    }

    public static boolean isInteger(String s) {
        return s.matches("-?[0-9]+");
    }
}
