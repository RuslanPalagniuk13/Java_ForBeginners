/* Урок 18:
 * Инкапсуляция. Сеттеры и геттеры.
 *  
 */

public class lesson18 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Имя какое-нибудь");
        person1.setAge(10);
        System.out.println("Выводим значение в main методе " + person1.getName());
        System.out.println("Выводим значение в main методе " + person1.getAge());
        person1.speak();

    }
}
class Person{
    private String name; // закрываем доступ пользователя к класу через - private
    private int age;

/* Варианты Инкопсуляции. Доступ к классам необходимо производить через пару классов Сеттер и Геттер
* пара методов с проверкой введенных значений */

    public void setName(String userName){ // это Сеттер
        if (userName.isEmpty()){ // isEmpty в строке - возвращает метод true если строка пустая 
            System.out.println("Введено пустое значение"); // и печатаем ошибку
        } else{
        name = userName;}
    }
    public String getName(){ // это Геттер
        return name;
    }

    public void setAge(int userAge){ // это Сеттер
        if(userAge<0){
            System.out.println("Возраст должен быть положительным");
        }else {
        age = userAge;}
    }
    public int getAge(){ // это Геттер
        return age;
    }

/* Варианты пар методов без проверки введенных значений */
    //public void setName(String userName){ // 1 пара методов для поля name
    //    name = userName;
    //}
    //public String getName(){ 
    //    return name;
    //}

    //public void setAge(int userAge){ // 2 пара методов для поля age
    //    age = userAge;
    //}
    //public int getAge(){
    //    return age;
    //}

    void speak(){   // метод с прикреплением данных 3 раза через цикл for
        for(int i = 0; i<3; i++){
            System.out.println("Меня зовут " + name + ", " + "мне " + age + " лет");
        }
    }    
    void sayHello(){ // метод вызывающий приветствие
        System.out.println("Привет!");
    }
}