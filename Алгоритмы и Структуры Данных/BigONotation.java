import java.util.Arrays;

/* Урок 3 и 4:
 * Большое О (Big O Notation). Сложность алгоритма.
 * Ссылка на видеолекцию часть 1 https://www.youtube.com/watch?v=M3ghq2E9tPw
 *                       часть 2 https://www.youtube.com/watch?v=aX7R7MQC78A
 * 
 * Big-O Notation — это математическая функция, используемая в информатике для описания сложности 
 * алгоритма. Обычно это мера времени выполнения, необходимого для выполнения алгоритма.
 * Но вместо того, чтобы сообщать вам, насколько быстро или медленно выполняется алгоритм, 
 * он сообщает вам, как производительность алгоритма изменяется 
 * в зависимости от размера ввода (размера n).
 * 
 * О - Асимптотический анализ (оценка) алгоритма — это определение математических границ/рамок 
 * его производительности во время выполнения, позволяющее очень легко находить 
 * время работы алгоритма в лучшем, среднем и худшем случае. 
 * Асимптотический анализ связан c входными данными: 
 * если их нет, алгоритм работает за постоянное время.
 */

public class BigONotation {
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

    // эфективный, быстрый
    // O(n+n) = O(2n) = O(n)
    private static long fibEffective(int n) {
        long[] arr = new long[n + 1]; // O(n)

        arr[0] = 0; // O(1)
        arr[1] = 1; // O(1)

        for(int i = 2; i <= n; i++)  // O(n)
            arr[i] = arr[i - 1] + arr[i - 2];

        return arr[n]; // O(1)
    }
    // O(n) + O(1) + O(1) + O(n) + O(1) = O(2n) + 3 = O(2n + 3) = O(n)

}
