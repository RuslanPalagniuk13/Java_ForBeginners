import java.util.Scanner;

/* Урок 7:
 * Класс сканер (Scaner)
 * Предназначен для запроса информации по вводу данных 
 * Пример создания 
 * Scanner s = new Scanner(Sistem.in)
 * Sustem.out.println(“введите что нибудь”)
 * s = scanner.nextText();
 */

public class lesson7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Введите число: ");
        int x = s.nextInt();
        System.out.println("Вы ввели число: " +x);

        Scanner st = new Scanner(System.in);
        System.out.print("Введите слово: ");
        String string = st.nextLine();
        System.out.println("Вы ввели: " +string);
    }
}