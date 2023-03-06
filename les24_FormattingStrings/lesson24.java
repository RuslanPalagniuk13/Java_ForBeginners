/* Урок: 24
 * Форматирование строк
 * %f - вещественные числа, 
 * вещественные числа можно округлять до нужного колличества символов после запятой, 
 * для этого необходимо поставить между % и f точку и число после запятой, например %.3f
 * %s - строки
 * %d - целые числа. Целые числа можно выводить на экран с отступом от начала строки, 
 * для этого необходимо поставить между % и d цифру с колличеством сиволов отступа с учетом введенного числа
 * например %10d - и введенное число 10, выведет 8 символов перед числом, если 1000 выведет 6 символов перед числом
 */ 

public class lesson24 {
    public static void main(String[] args) {
        System.out.printf("%f вещественное число\n", 45.3678);
        System.out.printf("%.2f вещественное число c округлением до 2 символов после запятой \n", 45.3678);
        System.out.printf("%s строка \n", "Привет");
        System.out.printf("%d целое число \n", 10);
        System.out.printf("%10d целое число с отступом от начала строки \n", 10);
        System.out.printf("%10d целое число с отступом от начала строки \n", 1000);
    }   
}