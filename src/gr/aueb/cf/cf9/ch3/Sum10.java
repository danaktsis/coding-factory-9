package gr.aueb.cf.cf9.ch3;

public class Sum10 {

    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        while (i<=10) {
            sum = sum + i;
            i++;
        }

        System.out.println("Το άθροισμα είναι:" + sum);
    }
}
