/* Лекция 12
 * Цикл for each
 */


public class lesson12 {
    public static void main(String[] args) {
         String[] strings = new String[3]; // создаем масив из 3 ичеек, размер указывается в [] скобках
         strings[0] = "Привет!";
         strings[1] = "Пока";
         strings[2] = "Джава";
 
         //System.out.println(strings[0]); печать выбранного элемента
 
         for(int i = 0; i<strings.length; i++){ // печать всех элементов через цикл for
             System.out.println(strings[i]);
         }
         System.out.println();
 
         for(String string:strings){ // печать всех элементов через цикл for each
             System.out.println(string);
         }
 
         int[] numbers1 = {1,2,3};
         int sum = 0;
         for(int x:numbers1){
             sum = sum+x;
         }
         System.out.println();
         System.out.println(sum);
 
         int value = 0;
         //String s; переменная как адрес
         String b = "Как дела";
         System.out.println(b);
    }
 }
 