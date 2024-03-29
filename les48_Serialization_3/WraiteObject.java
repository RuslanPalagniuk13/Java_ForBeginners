import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WraiteObject {
    public static void main(String[] args) {
        Person person1 = new Person(1, "Bob");
        
        // Первый вариант
        /*
        *try {
        *    FileOutputStream fos = new FileOutputStream("people.bin");
        *    ObjectOutputStream oos = new ObjectOutputStream(fos);
        *
        *    oos.writeObject(person1);
        *    oos.close();
        */

        // второй вариант
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("people.bin"))){
            oos.writeObject(person1);
        } catch (IOException e) {
            e.printStackTrace();
        }        
    }
}
