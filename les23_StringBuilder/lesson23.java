/* Урок: 23
 * StringBuilder
 * StringBuilder — класс, что представляет изменяемую последовательность символов. 
 * Класс был введен в Java 5 и имеет полностью идентичный API с StringBuffer. 
 * Единственное отличие — StringBuilder не синхронизирован. 
 * Это означает, что его использование в многопоточных средах есть нежелательным. 
 * Следовательно, если вы работаете с многопоточностью, Вам идеально подходит.
 */ 

public class lesson23 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Привет");
        System.out.println(sb.toString());
        sb.append(" мой").append(" друг"); //для добавления в строку используется метод append
        System.out.println(sb.toString());
    }
}
