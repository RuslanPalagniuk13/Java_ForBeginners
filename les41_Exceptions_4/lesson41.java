import java.io.IOException;
import java.text.ParseException;

/* Урок 41:
 * Исключения (часть 4).  
 * Ссылка на видеолекцию https://www.youtube.com/watch?v=9gw81XDJoKs 
 * 
 * все исключения унаследованы от Exception 
 */

public class lesson41 {
        
    public static void main(String[] args) {
        try {
            run();
        } catch (IOException | ParseException e) { // вариант указания видов исключения чере | (и)
            e.printStackTrace();
        }
        /* } catch (Exception e) { // вариант указания исключения Exception, так как все исключения унаследованы от Exception
            e.printStackTrace();
        } */
    }

    public static void run() throws IOException, ParseException, IllegalArgumentException{

    }
}