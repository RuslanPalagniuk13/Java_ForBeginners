import java.lang.foreign.VaList;
import java.util.Scanner;

/* Урок 8:
 * цикл DoWhile
 */

public class lesson8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value;
        do{
            System.out.println("Введи 5");
            value = scanner.nextInt();
        } while(value!=5);

        System.out.println("Вы ввели 5");
    }
    
}