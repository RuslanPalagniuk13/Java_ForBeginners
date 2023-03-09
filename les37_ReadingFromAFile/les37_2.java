import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


/* Урок 37:
 * Чтение из файла. ссылка на лекцию https://www.youtube.com/watch?v=j3I-jLGW8yU
 * 
 * чтение строк из файла строки, как массива
 */

public class les37_2 {
    public static void main(String[] args) throws FileNotFoundException {

       String path = "test2.txt";

       File file = new File(path);

       Scanner scanner = new Scanner(file);

       String line = scanner.nextLine(); // чтение строки в файле в виде массива каждое слово в строке
       String[] words = line.split(" "); // split - разделитель в данном случае пробел

       System.out.println(Arrays.toString(words));

       scanner.close();
    }
}