package gr.aueb.cf.cf9.ch7;

public class StrCopyAndSubstring {

    public static void main(String[] args) {
        String str1 = "Coding";
        String str2 = str1;

        str2 = "Factory";

        System.out.println(str1);
        System.out.println(str2);

        String str3 = str1.substring(1); //oding
        String str4 = str1.substring(1, 3); //od
    }

    public static void traverse(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.println(s.substring(i, i + 1) + " ");
        }
    }
}
