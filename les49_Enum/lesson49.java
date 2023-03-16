/* Урок 49:
 * Enum (Перечисления).
 * Ссылка на видеоурок https://www.youtube.com/watch?v=GOzNp1YAm5w
 * 
 * Перечисление (enumeration или enum для краткости) в Java — это специальный тип данных, 
 * который содержит набор предопределенных констант. 
 * Обычно enum используется при работе со значениями, которые не требуется изменять, 
 * например, дни недели, времена года, цвета и так далее.
 * 
 * Метод valueOf () — возвращает соответствующий числовой объект, 
 * содержащий значение переданного аргумента, простыми словами — преобразует в нужный тип данных. 
 * Аргумент можно преобразовать в int, double, float и другие типы данных, 
 * например, можно преобразовать строку в число. 
 * Метод valueOf () в Java является статическим методом. 
 * Метод может принимать два аргумента, где один является строкой и другой системой счисления.
 */

public class lesson49 {
    public static void main(String[] args) {
        Season winter = Season.WINTER;
        System.out.println(winter.ordinal()); // ordinal() используют в Enum, в данном случае для вывод на экран индекса времени года winter

        Season season = Season.AUTUMN;
        Animal animal = Animal.CAT;
        System.out.println(season.name()); // метод name, выводит на экран название 
        System.out.println(animal.name());

        Animal frog = Animal.valueOf("FROG"); // метод valueOf когда из строки хотим получить указанный Enum
        System.out.println(frog.getTranslation()); // выводит на экран перевод на русский язык
    }
}