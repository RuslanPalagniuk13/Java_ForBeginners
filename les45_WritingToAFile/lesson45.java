import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/* Урок 45:
 * Запись в файл.
 * Ссылка на видеоурок https://www.youtube.com/watch?v=nmxeAO7CYVg
 * 
 */

public class lesson45 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("testFile.xml");
        PrintWriter pw = new PrintWriter(file);

        pw.println("Test row  1");
        pw.println("Test row  2");
        pw.println("Test row  3");

        pw.close();
    }
}