/* Урок 17:
 * Параметры метода
 *  
 */

public class lesson17 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setNameAndAge("Руслан", 20);;
        person1.speak(); // вызов метода с прикреплением данных 1 раз
    
        Person person2 = new Person();
        person2.setNameAndAge("Петя", 35);
        person2.speak2(); // вызов метода метод с прикреплением данных 3 раза

        int years1 = person1.calculateYearsToRetrement(); // вызов возвращаемого метода
        int years2 = person2.calculateYearsToRetrement();
        System.out.println("Первому человеку до пенсии: " +years1+ "лет."); //печать возвращаемого метода
        System.out.println("Второму человеку до пенсии: " +years2+ "лет.");
    }
}
class Person{
    String name;
    int age;

    void setNameAndAge(String username, int userage){ // метод с 2 параметрами которые указываются в круглых скобках
        name = username;
        age = userage;
    }

    int calculateYearsToRetrement(){ // возвращаемый метод  тип (int)
        int years = 65-age;
        return years;
    }

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