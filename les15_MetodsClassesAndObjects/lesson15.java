/* Урок 15:
 * Методы
 * метод - всегда указывается с маленькой буквы
 */

public class lesson15 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Роман";
        person1.age = 20;
        person1.sayHello(); // Вызов метода приветствие
        person1.speak();
    
        Person person2 = new Person();
        person2.name = "Иван";
        person2.age = 50;
        person2.sayHello(); // Вызов метода приветствие;
        person2.speak2();
    }
}
class Person{
    String name;
    int age;

    void speak(){   // метод с прикреплением данных 1 раз
        System.out.println("Меня зовут " + name + ", " + "мне " + age + " лет");
    }

    void speak2(){   // метод с прикреплением данных 3 раза через цикл for
        for(int i = 0; i<3; i++){
            System.out.println("Меня зовут " + name + ", " + "мне " + age + " лет");
        }
    }    
    void sayHello(){ // метод вызывающий приветствие
        System.out.println("Привет!");
    }
}