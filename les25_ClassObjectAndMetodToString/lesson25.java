/* Урок: 25
 * Класс Object и метод toString()
 * метод toString() используется в Java для получения строкового объекта, 
 * представляющего значение числового объекта, 
 * другими словами — преобразует число в строку. 
 * Если метод принимает в качестве аргумента простой тип данных, 
 * то возвращается строковый объект, представляющий значение простого типа данных.
 * все объекты toString() имеют хэшкоды, для приобразования необходим конструктор toString()
 */ 

public class lesson25 {
    public static void main(String[] args) {
        Human h1 = new Human("Руслан", 48);
        System.out.println(h1); // без конструктора toString() выводит на печать хэшкод (Human@4617c264)
    }   
}

class Human {
    private String name;
    private int age;

    /* КОНСТРУКТОР */
    public Human(String name, int age){ 
        this.name = name;
        this.age = age;
    }

    // конструктор toString() для преобразования хэшкода
    public String toString(){ // преобразовывает object с хэшкодом (Human@4617c264) в toString
        return name+", "+age;
    }
}