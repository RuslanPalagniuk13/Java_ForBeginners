import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

/* Урок 40:
 * Исключения (часть 3). Checked и Unchecked. 
 * Ссылка на видеолекцию https://www.youtube.com/watch?v=P7dByA1rz5c
 * 
 * Checked Exception (Compile time exception) - это исключения которые возникают в процессе компиляции 
 * Checked исключения, это те, которые должны обрабатываться блоком catch 
 * или описываться в сигнатуре метода. 
 * Checked исключения в Java - наследованные от Exception.
 * 
 * Unchecked (Runtime exception) - это те исключения которые возникают во время выполнения программы 
 * Unchecked могут не обрабатываться и не быть описанными.
 * Unchecked исключения в Java - наследованные от RuntimeException.
 * 
 * Пример unchecked исключения - NullPointerException, 
 * Пример checked исключения - IOException.
 */

public class lesson40 {
        
    public static void main(String[] args) {
        
        // Пример checked исключения
        File file = new File("test");
            try {
                Scanner scanner = new Scanner(file);
                } catch (FileNotFoundException e) {
                    System.out.println("Ошимбка во время компеляции");
                }
    }

      // Примеры unchecked исключений  

        int x = 10 / 0; // 1 вид unchecked исключения

        String name = null; // 2 вид unchecked исключения
        name.length();

        int[] arr = new int[2]; // 3 вид unchecked исключения
        System.out.println(arr[2]);
}