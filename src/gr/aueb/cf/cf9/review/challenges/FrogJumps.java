package gr.aueb.cf.cf9.review.challenges;

public class FrogJumps {

    public static void main(String[] args) {

    }

    public static int frogJumps(int start, int end, int jump) {
        return (int) Math.ceil((end - start) / (double) jump);
    }
}
