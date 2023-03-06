/* Урок: 27
 * Интерфейсы
 * Интерфейс - это абстрактный тип, который используется для указания поведения, 
 * которое должны реализовывать классы. 
 * Они похожи на протоколы. Интерфейсы объявляются с использованием ключевого слова interface
 * и могут содержать только сигнатуру метода и объявления констант (объявления переменных, 
 * которые объявляются как статическими, так и окончательными).
 */ 

public class lesson27 {
    public static void main(String[] args) {
        /*
         * Первый вариант
         */
        
        //Info info1 = new Animal(1);
        //Info info2 = new Person("Bob");
        //info1.showInfo();
        //info2.showInfo();

        /*
         * Второй вариант
         */
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Bob");
        outputInfo(animal1);
        outputInfo(person1);

    }
    
    public static void outputInfo(Info info){
        info.showInfo();
    }
}
