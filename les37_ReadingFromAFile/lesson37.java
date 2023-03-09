import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


/* Урок 37:
 * Чтение из файла. ссылка на лекцию https://www.youtube.com/watch?v=j3I-jLGW8yU
 * 
 */

public class lesson37 {
    public static void main(String[] args) throws FileNotFoundException {
       
       /* чтение по пути:
       * например: 
       * 1. По ссылки в виндовс
       * String path = "\Users\les37_ReadingFromAFile\test";
       * 
       * 2. По ссылки в мак
       * String path = "/Users/les37_ReadingFromAFile/test";
       *  
       * 3. если неизвестна в какой системе но путь одинаков используется separator
       * String sparator = File.separator;
       * String path = sparator + "Users" + "rlpal" + sparator + "Desktop" + sparator + "Java для начинающих" + sparator + "les37_ReadingFromAFile" + sparator + "test";
       */

       String path = "test.txt"; // если он в одной папке с кодом

       File file = new File(path);

        Scanner scanner = new Scanner(file); // Чтение данных из файла 
        while(scanner.hasNextLine()){ 
            System.out.println(scanner.nextLine());
        }

        scanner.close();
    }
}