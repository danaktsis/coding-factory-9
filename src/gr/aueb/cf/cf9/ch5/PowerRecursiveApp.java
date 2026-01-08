package gr.aueb.cf.cf9.ch5;

public class PowerRecursiveApp {

    public static void main(String[] args) {

    }

    public static int power(int a, int b) {
        return b == 0 ? 1 : a * power(a, b - 1);
    }
}
