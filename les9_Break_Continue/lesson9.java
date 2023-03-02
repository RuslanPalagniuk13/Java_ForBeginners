import javax.swing.plaf.synth.SynthOptionPaneUI;

/* Урок 9:
 * Операторы break и continue
 * break - оператор который прекращает цикл
 * continue - оператор который перезапускает цикл
 */

public class lesson9 {
    public static void main(String[] args) {
        int i = 0;
        while(true){
            if (i==5){
                break; // прекращает цикл при достижении условия
            }
            System.out.println(i);
            i++;
        }
        System.out.println("Мы вышли из цикла");

        for(int j = 0; j >= 7; j++){
            if(j%2==0){
                continue; // перезапускает цикл пока не исполнит условие, 
            }             // в данном случае вывод ничетных чисел до 7
            System.out.println("Это нечетное число: " +j);
        }
    }
}