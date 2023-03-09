/* Урок 31:
 * Приведение примитивных типов данных.
 * 
 * Приведение примитивных типов данных - это присвоение значения одного 
 * примитивного типа данных другому.
 * 
 * Приведение типов в Java - это присвоение значения одного примитивного типа данных другому. 
 * Должны знать о совместимости этого типа данных. 
 * Если они совместимы, тогда Java выполнит преобразование, 
 * известное как автоматическое преобразование типов, 
 * а если нет, то их необходимо явно преобразовать.
 */

public class lesson31 {
    public static void main(String[] args) {
        double y = 123.2;
        float f = (float) y; // явное присвоение одного примитивного типа данных другому


        int a = 123;

        long l = a; // неявное присвоение одного примитивного типа данных другому
        int x = (int)l; // явное присвоение одного примитивного типа данных другому
        
        byte b = (byte) 128; // явное присвоение одного примитивного типа данных другому 
        // привышающее лимит (от -128 до 127), 
        // но если вывести на печать переменную b c числом 128, 
        // на экране будет показано -128, из-за превышения лимита
    }
}