package gr.aueb.cf.cf9.ch2;

import java.util.Locale;
import java.util.Scanner;

public class HoursToMinSec {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int hours = 0;
        int minutes = 0;
        int seconds = 0;
        final int SIXTY = 60;

        System.out.println("Πόσες ώρες;");
        hours = scanner.nextInt();
        minutes = hours * SIXTY;
        seconds = minutes * SIXTY;

        System.out.printf(Locale.forLanguageTag("el"),"Λεπτά: %,d, Δευτερόλεπτα: %,d%n", minutes, seconds);
    }
}
