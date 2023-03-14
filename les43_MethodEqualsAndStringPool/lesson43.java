/* Урок 43:
 * Метод equals() и String Pool.
 * 
 * Ссылка на видеолекцию https://www.youtube.com/watch?v=m7vFGL-N9eY 
 * 
 * Метод equals () – сравнивает строку с указанным объектом. 
 * Результатом является значение true только в том случае, 
 * если аргумент не равен null и является строковым объектом (String), 
 * который представляет ту же последовательность символов как и этот объект.
 * 
 * String pool — это особое место в heap’е, куда попадают объекты типа String после их создания. 
 * Он выполняет функцию кеша строк. Каждый раз, когда Вы создаёте строку, 
 * она попадает в строковый пул. Если же на момент создания новой строки пул 
 * уже содержит такое же значение, то вместо создания нового объекта возвращается тот, 
 * что уже лежит в пуле.
 * 
 */

public class lesson43 {
    public static void main(String[] args) {
        
        Animal animal1 = new Animal(1);
        Animal animal2 = new Animal(1);

        System.out.println(animal1.equals(animal2)); // метод сравнения объектов equals

        // запись объектов "Hello" String pool производится автоматически
        String string1 = "Hello";
        String string2 = "Hello";
        // сравнение объектов String pool возможно через равенство (==) 
        // например string1 == string2

        System.out.println(string1.equals(string2)); // метод сравнения объектов equals
    }
}

class Animal {
    private int id;

    public Animal(int id){
        this.id = id;
    }
    // Для того чтобы сравнивать объекты структурно, необходимо перераспределить объекты в классе 

    public boolean equals(Object obj) {
        Animal otherAnimal = (Animal) obj;
        return this.id == otherAnimal.id;
    }
}