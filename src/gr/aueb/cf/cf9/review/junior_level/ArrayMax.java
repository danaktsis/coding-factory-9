package gr.aueb.cf.cf9.review.junior_level;

public class ArrayMax {

    public static void main(String[] args) {
        int[] a = { 1, 5, 6, 3, 7, 4 };
        int m = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] > m ) {
                m = a[i];
            }
        }

        System.out.println(m);
    }
}
