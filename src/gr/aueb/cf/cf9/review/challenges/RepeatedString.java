package gr.aueb.cf.cf9.review.challenges;

public class RepeatedString {

    public static void main(String[] args) {

    }

    public static String repeatedString(String s, int n) {
        return s.repeat(n);
    }

    public static String repeatedString2(String s, int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            sb.append(s);
        }

        return sb.toString();
    }
}
