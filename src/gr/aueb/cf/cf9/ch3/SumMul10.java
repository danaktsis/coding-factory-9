package gr.aueb.cf.cf9.ch3;

public class SumMul10 {

    public static void main(String[] args) {
        int sum = 1;
        int i = 1;

        while (i<=10) {
            sum = sum * i;
            i++;
        }

        System.out.println("Το παραγοντικό είναι:" + sum);
    }
}
