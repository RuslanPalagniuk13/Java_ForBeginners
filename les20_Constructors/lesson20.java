/* Урок :
 * Конструкторы
 * Конструкторы можно проименовать одинаково
 */ 

public class lesson20 {
    public static void main(String[] args) {
        Human human1 = new Human("Руслан", 48);
    }
}

class Human {
    private String name;
    private int age;

    /* КОНСТРУКТОРЫ */

    public Human(){ // первый конструктор без заданых значений
        this.name = "Имя по умолчанию";
        this.age = 0;
    }

    public Human(String name){
        System.out.println("Привет из второго конструктора");
        this.name = name;
    }

    public Human(String name, int age){
        System.out.println("Привет из третьего конструктора");
        this.name = "Имя по умолчанию";
        this.age = 0;
    }

    // СЕТТЕРЫ
    public void setName(String name){ 
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    
    // ГЕТТЕРЫ
    public String getName(){  
        return name;
    }
    public int getAge(){ 
        return age;
    }

    public void getInfo(){
        System.out.println(name+ ", " +age);
    }

}