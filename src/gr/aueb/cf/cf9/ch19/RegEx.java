package gr.aueb.cf.cf9.ch19;

public class RegEx {

    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(isHello(s));
    }

    public static boolean isHello(String s) {
        return s.matches("Hello");
    }

    public static boolean isHelloOrHi(String s) {
        return s.matches("Hello|Hi");
    }

    public static boolean isHHello(String s) {
        return s.matches("[Hh]ello");
    }

    public static boolean startsWithUpperCase(String s) {
        return s.matches("[A-Z]coding");
    }

    public static boolean startsWithUpperOrLowerCase(String s) {
        return s.matches("[A-Za-z]coding");
    }

    public static boolean startsWithLetter(String s) {
        return s.matches("[a-zA-Z0-9_]coding");
    }

    public static boolean isdate(String s) {
        return s.matches("\\d{2}/\\d{2}/\\d{4}");
    }

    public static boolean twoWords(String s) {
        return s.matches(".*\\s+.*");
    }

    public static String reverse(String s) {
        return s.replaceAll("(.+)\\s(.+)", "$2 $1");
    }
}
