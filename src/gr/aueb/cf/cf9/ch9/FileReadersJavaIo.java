package gr.aueb.cf.cf9.ch9;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class FileReadersJavaIo {

    public static void main(String[] args) {
        File file = new File("C:/Users/danak/IdeaProjects/CodingFactory9/src/gr/aueb/cf/cf9/ch9/file.txt");

        try {
            bufferedReader(file);
        } catch (IOException e) {
            System.out.println("Το αρχείο δεν δημιουργήθηκε ή κάποιο λάθος συνέβη κατά την εγγραφή");
        }

    }

    public static void fileReader(String file) throws IOException {
        try (FileReader fr = new FileReader(file)) {
            int bytesRead = 0;

            while ((bytesRead = fr.read()) != -1) {
                System.out.println((char) bytesRead);
            }

        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public static void bufferedReader(File file) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(file, StandardCharsets.UTF_8))) {
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
