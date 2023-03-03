/* Урок 19:
 * Ключевое слово this
 */

public class lesson19 {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setName("Tom");
        human1.setAge(11);
        human1.getInfo();
    }
}

class Human {
    String name;
    int age;

/*
 * для того чтобы отличить одинаковым образом названные переменные 
 * объекта в классе и методе используется ключевое слово this
 */

    // сеттеры
    public void setName(String name){  
        this.name = name; // использование ключевого слова this
    }
    public void setAge(int age){
        this.age = age;
    }
    
    // геттеры
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