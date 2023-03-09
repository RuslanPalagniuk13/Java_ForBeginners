import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;


/* Урок 37:
 * Чтение из файла. ссылка на лекцию https://www.youtube.com/watch?v=j3I-jLGW8yU
 * 
 * чтение чисел из файла с одной строки, как массива
 */

public class les37_3 {
    public static void main(String[] args) throws FileNotFoundException {
        //String path = "test3.txt";
        // File file = new File(path);

        File file = new File("test3.txt"); // чтение из файла без создания переменной
        
        Scanner scanner = new Scanner(file);
        String line = scanner.nextLine();
        String[] numbeStrings = line.split(" "); // split - разделитель в данном случае пробел
        int[] numbers = new int[3]; // массив с 3 значениями 
        int counter = 0;
        
        for(String number : numbeStrings){
            numbers[counter++] = Integer.parseInt(number);
        }
        
        System.out.println(Arrays.toString(numbers));
        scanner.close();
    }
}