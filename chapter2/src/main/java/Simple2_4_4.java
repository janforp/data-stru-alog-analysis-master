/**
 * Created with IntelliJ IDEA.
 * User: Janita home
 * Date: 2018/8/22/022
 * Time: 23:04
 * To change this template use File | Settings | File Templates.
 * Description: 求数组的最大子序列和的几种算法
 */
public class Simple2_4_4 {

    /**
     * 折半查找
     * 给定一个整数X，和一系列整数A0，A1，....，AN-1
     * 后者已经预先排序并在内存中
     * 求下标i使得Ai = X，如何找不到，则返回 i = -1；
     * @param arr
     * @param x
     * @return
     */
    public static int findEquilIndex(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]){
                return i;
            }
        }
        return -1;
    }

    public static int find2(int[] arr, int x) {
        return 1;
    }
}