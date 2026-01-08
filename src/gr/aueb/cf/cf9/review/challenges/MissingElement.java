package gr.aueb.cf.cf9.review.challenges;

public class MissingElement {

    public static void main(String[] args) {

    }

    public static int findMissingElement(int[] arr) {
        int expectedSum = 0;
        int actualSum = 0;
        int n = 0;

        n = arr.length;
        expectedSum = (n * (n + 1)) / 2;
        for (int i = 0; i < arr.length; i++) {
            actualSum += arr[i];
        }

        return expectedSum - actualSum;
    }
}
