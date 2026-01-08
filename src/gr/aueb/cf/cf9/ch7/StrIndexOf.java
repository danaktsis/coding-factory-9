package gr.aueb.cf.cf9.ch7;

public class StrIndexOf {

    public static void main(String[] args) {
        String cf = "Coding Factory";

        int positionOfo = cf.indexOf("o"); //1
        System.out.println(positionOfo);

        int postitionOfNexto = cf.indexOf("o", 2); //11
        System.out.println(postitionOfNexto);

        int positionOfLasto = cf.lastIndexOf("o"); //11
        System.out.println(positionOfLasto);
    }

    public static String getExtension(String fileName) {
        return fileName.substring(fileName.lastIndexOf(".") + 1);
    }
}
