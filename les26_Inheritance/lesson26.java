/* Урок: 26
 * Наследование
 * 
 */ 

public class lesson26 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sleep(); // Собака (dog) унаследовало данные от общего класса животное (Animal)
        dog.eat();
        dog.bark();
        dog.showName();
    }   
}

