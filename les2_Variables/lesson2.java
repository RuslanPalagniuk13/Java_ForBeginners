/* Урок 2:
 * Переменные
 */

public class lesson2 {
    public static void main(String[] args) {
        int myInt = 557; // целые числа до 32бит
        short myShort = 3266; // целые числа до 16бит
        long myLong = 26245246; // целые числа до 64бит

        double myDouble = 235.35; // вещественные числа до 64бит
        float myFloat = 2362.4f; // вещественные числа до 32бит (особенность: при записи числа в конце числа ставим f )

        char c = 'a'; // Указатель на последовательность символов
        boolean b = true; // Примитивный тип данных который принимает либо -true (да, истина) либо -folse (нет, ложь)
        
        byte myByte = 100; // целые числа от -128 до 127
        
        System.out.println(myInt+ ", " +myShort+ ", " +myLong+ ", " +myDouble+ ", " +myFloat); // выводит на печать значение
    }
}