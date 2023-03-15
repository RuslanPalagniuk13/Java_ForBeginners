import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WraiteObject {
    public static void main(String[] args) {
        Person[] people = {new Person(1, "Bob"), 
                new Person(2, "Mike"), new Person(3, "Tom")};
    
        try {
            FileOutputStream fos = new FileOutputStream("people.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // Первый вариант записи 
            /* oos.writeObject(people.length);
            *for (Person person : people) {
            *    oos.writeObject(person);
            }*/
        
            // Второй вариант записи (более удобный и короткий)
            oos.writeObject(people);
            oos.close();

        } catch (IOException e) {
            e.printStackTrace();
        }        
    }
}
