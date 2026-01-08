package gr.aueb.cf.cf9.ch5;

public class FloatingPointApp {

    public static void main(String[] args) {
        System.out.printf("Float, Size: %d, Min: %.2e, Max: %.2e%n", Float.BYTES, Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.printf("Double, Size: %d, Min: %.2e, Max: %.2e%n", Double.BYTES, Double.MIN_VALUE, Double.MAX_VALUE);

    }
}
