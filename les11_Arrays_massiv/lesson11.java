/* Лекция 11 
 * Массивы
 * массив числовой
*/

public class lesson11 {
    public static void main(String[] args) {
        int number = 10; // примитивный тип данных
        int [] numbers = new int [5]; // numbers => [массив] ссылочный тип данных 
        // int [] numbers = new int [5] создание пустого масива в 5 ичеек 0 1 2 3 4 
        for(int i = 0; i<numbers.length; i++){ //инициализация массива
            numbers[i] = i*10;
        }
        for(int i = 0; i<numbers.length; i++){
            System.out.println(numbers[i]);
        }
        System.out.println(); // выводит пустую строку
    
        int[] numbers1 = {1,2,3,4}; // создание и инициализация массива 
        for(int i = 0; i<numbers1.length; i++){
            System.out.println(numbers1[i]);
        }
    }
}