package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

public class EuroToUsdConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int eur = 0;
        int usd = 0;
        int totalCents = 0;
        int cents = 0;
        final int EXCHANGE_RATE = 99; //1 ευρώ ισούται με 99 cents του δολλαρίου

        System.out.println("Δώσε μου τα ευρώ");
        eur = scanner.nextInt();

        totalCents = eur * EXCHANGE_RATE;
        usd = totalCents / 100;
        cents = totalCents % 100;

        System.out.printf("Σε δολλάρια είναι: %d δολλάρια και %d cents%n", usd, cents);

    }
}
