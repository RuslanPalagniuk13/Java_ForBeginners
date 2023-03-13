import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/* Урок 39:
 * Исключения (часть 2). Выбрасывание. 
 * Ссылка на видеолекцию https://www.youtube.com/watch?v=jL7-VdBeh9s
 * 
 * Ссылка на сайт Class Exception где указаны все исколючения https://docs.oracle.com/en/java/javase/15/docs/api/java.base/java/lang/Exception.html
 * 
 */

public class lesson39 {
        
    // 1 вариант исключения выбрасывания выбранного исключения IOException 
    /* public static void main(String[] args) throws IOException{
        
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int x = Integer.parseInt(scanner.nextLine());

            if(x != 0) {
                throw new IOException();
            }
        }
    } */
    
    
    // 2 вариант исключения выбрасывания выбранного исключения IOException 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int x = Integer.parseInt(scanner.nextLine());

            if(x != 0) {
                try {
                    throw new IOException();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }


    // Вариант выбрасывания самостоятельно созданного исключения ScannerException
   
   /* public static void main(String[] args) throws ScannerException{
        
        Scanner scanner = new Scanner(System.in);
        while(true) {
            int x = Integer.parseInt(scanner.nextLine());

            if(x != 0) {
                throw new ScannerException("Введено чтото кроме нуля");
            }
        }
    } */
    

}