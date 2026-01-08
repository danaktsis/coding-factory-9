package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

public class SnowingApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperature = 0;
        boolean isRaining = false;
        boolean isSnowing = false;

        System.out.println("Βρέχει; (T/F)");
        isRaining = scanner.nextBoolean();
        System.out.println("Βάλε θερμοκρασία");
        temperature = scanner.nextInt();

        isSnowing = isRaining && (temperature < 0);

        System.out.println("Snowing:" + isSnowing);

    }
}
