import java.util.ArrayList;
import java.util.List;


/* Урок 35:
 * Wildcards (Generics) ссылка на лекцию https://www.youtube.com/watch?v=Er_cj823ZTM
 * 
 * Wildcards – специальные вопросительные знаки, отмечающие место, 
 * где должно оказаться название параметра типа. 
 * Они являются средством выражения ограничений в условиях неизвестности какого-нибудь типа. 
 * Первоначально эти знаки не являлись частью структуры generic-ов, 
 * унаследованной от проекта Generic Java (GJ), 
 * а были добавлены в процессе разработки дизайна за те более чем пять лет, 
 * что прошли между созданием JSR 14 и его последним выпуском.
 */

public class lesson35 {
    public static void main(String[] args) {
    
       List<Animal> listOfAnimals = new ArrayList<>();
       listOfAnimals.add(new Animal(1));
       listOfAnimals.add(new Animal(2));
       
       List<Dog> listOfDogs = new ArrayList<>();
       listOfDogs.add(new Dog());
       listOfDogs.add(new Dog());
       
       test(listOfAnimals);
       test(listOfDogs);
       
    }

    /* 
    * Иерархия наследования
    * 1. Object
    *   2. Animal
    *       3. Dog
    *
    * private static void test(List<? super Animal> list) через указание знака ? и super 
    * присваивает все что находится в иерархии Animal и выше в данном случае (Object)
    *
    * private static void test(List<? extends Animal> list) через указание знака ? и extends 
    * присваивает все что находится в иерархии Animal и ниже в данном случае (Dog)
    */

    private static void test(List<? extends Animal> list){ //
        for(Animal animal : list){
            animal.eat();
        }
    }

}
