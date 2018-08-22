/**
 * Created with IntelliJ IDEA.
 * User: Janita home
 * Date: 2018/8/22/022
 * Time: 23:04
 * To change this template use File | Settings | File Templates.
 * Description: 求数组的最大子序列和的几种算法
 */
public class Simple2_4_3 {

    /**
     * 求数组的最大子序列和
     * O(N^3)
     * @param arr
     * @return
     */
   public static int maxSubSum1(int[] arr) {
       int maxSum = 0;
       for (int i = 0; i < arr.length; i++) {
           for (int j = i; j < arr.length; j++) {
               int thisSum = 0;
               for (int k = i; k <= j ; k++) {
                   thisSum += arr[k];
               }
               if (thisSum > maxSum) {
                   maxSum = thisSum;
               }
           }
       }
       return maxSum;
   }
}