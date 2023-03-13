import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/* Урок 38:
 * Исключения (часть 1). Обработка исключений. 
 * Ссылка на видеолекцию https://www.youtube.com/watch?v=DElNhj71YCk
 * 
 * // 1 метод исключения - throws FileNotFoundException
 */

public class lesson38 {
        // 1 метод исключения throws FileNotFoundException
   /*  public static void main(String[] args) throws FileNotFoundException {
        File file = new File("asdf");

        Scanner scanner = new Scanner(file);
    } */

        // 2 метод исключения
    /* public static void main(String[] args){
        File file = new File("asdf");

        try{
            Scanner scanner = new Scanner(file);
            System.out.println("Выполнен блок сканер");
        } catch (FileNotFoundException e) {
            //e.printStackTrace();  // исключение выдает ошибку аналогичную 1 методу
            System.out.println("Файл не найден"); // лучше использовать конкретное исключений для понимания
        }
        System.out.println("После блока try catch");
    } */


        // 3 метод исключения 
    public static void main(String[] args){
        try{
            readFile(); // вызов класса метода исключения readFile
        } catch (FileNotFoundException e) {
            System.out.println("Обработка исключения в методе main"); // лучше использовать конкретное описание ошибки исключений для понимания
        }
        System.out.println("После блока try catch");
    
    
    public static void readFile() throws FileNotFoundException {
        File file = new File("asdf");
        Scanner scanner = new Scanner(file);
    }

}