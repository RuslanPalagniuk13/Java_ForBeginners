import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

/* Урок 34:
 * Введение в параметризацию. (Generics) ссылка на лекцию https://www.youtube.com/watch?v=iQIR2Zgb93k
 * 
 * Дженерики (generics) в языке программирования Java — это сущности, 
 * которые могут хранить в себе данные только определенного типа. 
 * Например, список элементов, в котором могут быть одни числа. 
 * Но не только: дженерик — обобщенный термин для разных структур. 
 * Можно представить дженерик как папку для бумаг, 
 * куда нельзя положить ничего, кроме документов определенного формата.
 */

public class lesson34 {
    public static void main(String[] args) {
       //// Java 5 /////
       List animals = new ArrayList();
       Animal ourAnimal = new Animal();
       animals.add("cat");
       animals.add("dog");
       animals.add("frog");
       animals.add(ourAnimal); 

       String animal = (String) animals.get(3); // до появления джинериков необходимо было указыват что (String)
       System.out.println(animals);

       //// С появлением дженериков (Generics) ///

       List<String> animals2 = new ArrayList<String>(); // указывалось при присвоении что <String>
       animals2.add("cat");
       animals2.add("dog");
       animals2.add("frog"); 

       String animals2 = animals2.get(1);

       //// Java 7 ////
       List<String> animals3 = new ArrayList<>(); // сейчас для присвоения достаточно указать <>
       animals3.add("cat");
       animals3.add("dog");
       animals3.add("frog");
    }

}

class Animal {

}