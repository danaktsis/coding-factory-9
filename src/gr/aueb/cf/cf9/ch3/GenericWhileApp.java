package gr.aueb.cf.cf9.ch3;

public class GenericWhileApp {

    public static void main(String[] args) {
        int i = 1;
        int endval = 10;

        while (i <= endval) {
            System.out.println("Iteration number: " + i);
            i++;
        }

        System.out.println("Total iterations: " + (i - 1));
    }
}
