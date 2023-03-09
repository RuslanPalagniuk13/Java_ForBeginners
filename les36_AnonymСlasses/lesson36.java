import java.util.ArrayList;
import java.util.List;

/* Урок 36:
 * Анонимные классы. ссылка на лекцию https://www.youtube.com/watch?v=ndnubpPzkNE
 * 
 * Анонимный класс – это локальный класс без имени. 
 * Можно объявить анонимный (безымянный) класс, 
 * который может расширить (extends) другой класс или реализовать (implements) интерфейс. 
 * Объявление такого класса выполняется одновременно с созданием его объекта 
 * посредством оператора new.
 * Анонимные классы эффективно используются, как правило, 
 * для реализации (переопределения) нескольких методов и создания собственных методов объекта.
 * 
 * Пример создания анонимного класса на 1 раз см. файл les36_2.java
 */

class Animal {
    public void eat(){
        System.out.println("Animal is eating...");
    }
}

class OtherAnimal extends Animal { // анонимный класс
    public void eat() {
        System.out.println("Outer animal is eating...");
    }
}

public class lesson36 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
       
       OtherAnimal otherAnimal = new OtherAnimal();
       otherAnimal.eat();
    }

}
