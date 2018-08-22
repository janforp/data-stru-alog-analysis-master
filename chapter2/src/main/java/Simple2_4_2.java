/**
 * Created with IntelliJ IDEA.
 * User: Janita home
 * Date: 2018/8/22/022
 * Time: 23:04
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Simple2_4_2 {

    /**
     * @param n n >= 40 的时候效率很低，200的时候更加夸张
     * @return
     */
    public static long fib(int n) {
       if (n <= 1) {
           return 1;
       }else {
           return fib(n - 1) + fib(n - 2);
       }
    }

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        fib(90);

        long end = System.currentTimeMillis();

        System.out.print(end - start);
    }
}