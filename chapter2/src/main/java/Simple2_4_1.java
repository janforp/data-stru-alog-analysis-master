/**
 * Created with IntelliJ IDEA.
 * User: Janita home
 * Date: 2018/8/22/022
 * Time: 23:04
 * To change this template use File | Settings | File Templates.
 * Description:
 */
public class Simple2_4_1 {

    /**
     * 6n + 4 个时间单元
     * 该方法是 O(N)
     * @param n
     * @return
     */
    public static int sum(int n) {
        //1t
        int partialSum ;
        partialSum = 0;

        //4nt
        for (
                //1t
                int i = 1;
                //(n + 1)t
                i <= n;
                //nt
                i++
            ) {
            //4t
            partialSum += i * i * i;
        }
        //t
        return partialSum;
    }

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        sum(1000000000);

        long end = System.currentTimeMillis();

        System.out.print(end - start);
    }
}