/**
 * @author Janita
 * @date 2018/8/26 - 下午4:14
 * 类说明：
 */
public class Pow {

    public static long pow(long x, int n) {
        if (n == 0) {
            return 1;
        }
        if(n == 1) {
            return x;
        }
        if (n % 2 == 0) {
            return pow(x * x, n/2);
        }else {
            return pow(x * x, n/2)* x;
        }
    }

    public static void main(String[] args) {
        System.out.println("\n***\t" + pow(2,2));
    }

    //2^4 = (2^2)^2
    //2^6 = (2^2)^3
}
