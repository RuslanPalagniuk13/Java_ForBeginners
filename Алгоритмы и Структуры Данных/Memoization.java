import java.util.Arrays;

/* Урок 2:
 * Введение. Мемоизация.
 * Ссылка на видеолекцию https://www.youtube.com/watch?v=QlY5BGOhMKk
 * 
 * Мемоизация — (Memoization, англ) вариант кеширования, заключающийся в том, 
 * что для функции создаётся таблица результатов, и будучи вычисленной
 * при определённых значениях параметров результат заносится в эту таблицу. 
 * В дальнейшем результат берётся из данной таблицы. 
 * Эта техника позволяет засчёт использования дополнительной памяти ускорить работу программы.
 * Данный подход очень частно применяется в функциональных языках программирования, 
 * однако и в императивных ему так же можно найти применение.
 * 
 */

public class Memoization {

    public static void main(String[] args) {
        int n = 100;
        long[] mem = new long[n + 1];

        Arrays.fill(mem, -1);
        
        System.out.println(fibNaive(n, mem));
         
    }

    // делаем мемоизацию для медленного способа
    private static long fibNaive(int n, long[] mem) {
        if(mem[n] != -1)
            return mem[n];

        if (n <= 1)
            return n;

        Long result = fibNaive(n - 1, mem) + fibNaive(n - 2, mem);
        mem[n] = result;

        return result;
    }
}