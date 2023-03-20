/* Урок 50:
 * Рекурсия.
 * Ссылка на видеоурок https://www.youtube.com/watch?v=9Hs7DuIJ3LE
 * 
 * Рекурсия в Java - это запуск функции, из самой функции. 
 * При запуске функции, все что было сделано внутри функции стирается и запускается новая функция, 
 * с новыми параметрами. Другими словами, если вы видите слово запуск этой же функции [rec], 
 * то берете эту функцию в самом начале ее описания, переносите туда подаваемые параметры и смотрите,
 * что происходит далее.
 */

public class lesson50 {
    public static void main(String[] args) {
        counter(3);
    }

    private static void counter(int n) {
        if (n == 0)
            return;

        System.out.println(n);

        counter(n-1);
    }

    // public static void main(String[] args) { // метод вызова факториал
    //    System.out.println(4); 
    //}
    
    //private static int fac(int m) {
    //    if(m == 1)
    //        return 1;
    //
    //    return m * fac(m-1);
    //}

}