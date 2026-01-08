package gr.aueb.cf.cf9.ch6;

public class ArraySymmetric {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 5, 4, 3, 2, 1};
        boolean flag = false;

        flag = isSymmetric2(arr);
        if (flag) {
            System.out.println("Ο πίνακας είναι συμμετρικός");
        } else {
            System.out.println("Ο πίνακας δεν είναι συμμετρικός");
        }
    }

    public static boolean isSymmetric(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++ ) {
            if (arr[i] != arr[arr.length - 1 - i]) return false;
        }
        return true;
    }

    public static boolean isSymmetric2(int[] arr) {
        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
                return false;
            }
        }
        return true;
    }
}
