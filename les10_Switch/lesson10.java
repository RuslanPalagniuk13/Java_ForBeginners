import java.util.Scanner;

/* Урок 10:
 * Оператор switch
 * switch это оператор в которому присваивается переменная, 
 * и через case задается значение.
 */

public class lesson10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();
        switch(age){
            case 0 :
                System.out.println("Ты родился");
                break;
            case 7 :
                System.out.println("Ты пошел в школу");
                break;
            case 18 :
                System.out.println("Ты закончил школу");
                break;
            default:
                System.out.println("Ниодно из условий не подошло");
        }
    }
}