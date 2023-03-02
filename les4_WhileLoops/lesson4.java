/* Урок 4:
 * Цикл while (воаил) цикл выполняется пока условие показывает true (истину)
 */

public class lesson4 {
    public static void main(String[] args) {
        int value = 0; // задано значение переменной value на начало цикла
        while(value<5){ // указанно до каких пор будет выполняться цикл
            System.out.println("Привет " + value);
            value = value+1; // увеличиваем переменную value на 1 после каждого круга
        }        
    }
}