/**
 * @author Janita
 * @date 2018/8/26 - 下午3:13
 * 类说明：
 */
public class Gcd {

    private static int gcd(int a, int b) {

        if (a == 0) {
            return b;
        }

        if (b == 0) {
            return a;
        }

        int c = a % b;

        System.out.println("\n***\t" + c);

        return gcd(b, c);
    }

    public static void main(String[] args) {

//        System.out.println("\n***\t" + gcd(1989, 1590));
        
        System.out.println("\n***\t" + (20 % 8));
    }
}
