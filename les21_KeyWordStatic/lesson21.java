/* Урок: 21
 * Ключевое слово Static (метод)
 *  Статический метод (static) - означает что переменная или функция является общей 
 * для всех экземпляров этого класса, поскольку они принадлежат типу, а не самим объектам.
 * Поэтому если есть переменная private static, и ее увеличиваем (i++) в одном экземпляре, 
 * изменение будет отражено во всех экземплярах.
 * static нужен когда не нужно знать переменные каждого объекта.  
 * 
 *  Math - это матиматический статический класс, которая уже аккумулирует все методы матиматики, 
 * методы указываются после точки, например Math.pow(4, 3); - возведение в степнь, 
 * где первое число это число которое возводится в степень числа указанного в качестве второго числа.
 * 
 */ 

public class lesson21 {
    public static void main(String[] args) {
        Human h1 = new Human("Руслан", 48);
        Human h2 = new Human("Ксюша", 41);
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
        Human h3 = new Human("Настя", 21);
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();        
        h3.printNumberOfPeople();

        /* Math.pow(4, 3); // математический статический класс
        */
    }
}

class Human {
    private String name;
    private int age;

    private static int countPeople; // метод static - создается когда не нужно знать переменные объекта

    // КОНСТРУКТОР
    public Human(String name, int age){
        this.name = "Имя по умолчанию";
        this.age = 0;
        countPeople++;
    }

    // СЕТТЕРЫ
    public void setName(String name){ 
        this.name = name;
    }
    public void setAge(int age){ 
        this.age = age;
    }

    public void printNumberOfPeople(){
        System.out.println("Nomber of people "+countPeople);
    }
}  
    