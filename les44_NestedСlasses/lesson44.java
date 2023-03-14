/* Урок 44:
* Вложенные классы.
* Ссылка на видеолекцию https://www.youtube.com/watch?v=Rh6n-3TQJD4
* 
* Вложенным классом называют класс, который является членом другого класса (находится в его теле). 
* Существует четыре базовых типа вложенных классов в Java:
* - Static Nested classes(статические вложенные классы)
* - Nested Inner classes (вложенные внутренние классы)
* - Method Local Inner classes (внутренние классы в локальном методе)
* - Anonymous Inner classes (анонимные классы)
*/

public class lesson44 {
    public static void main(String[] args) {
        Electrocar electrocar = new Electrocar(1);
        electrocar.start();

        Electrocar.Battry battry = Electrocar.Battry();


    }
}