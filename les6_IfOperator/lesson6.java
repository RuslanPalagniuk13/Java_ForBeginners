/* Урок 6:
 * Условный оператор if
 */

public class lesson6 {
    public static void main(String[] args) {
        int myInt = 5;
        if (myInt<10){
            System.out.println("да, верно");
        }else if (myInt<20){
            System.out.println("нет, не верно");
        }

        short myShort = 15;
        if (myShort<10){
            System.out.println("да, верно");
        }else if (myShort<20){
            System.out.println("нет, не верно");
        }
    }
}