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


    /**
     *
     * @param arr
     * @return
     */
   public static int maxSubSum2(int[] arr) {
       int maxSum = 0;
       for (int i = 0; i < arr.length; i++) {
           int thisSum = 0;
           for (int j = i; j < arr.length; j++) {
               thisSum += arr[j];
               if (thisSum > maxSum) {
                   maxSum = thisSum;
               }
           }
       }
       return maxSum;
   }

   public static int maxSumRec(int[] arr, int left, int right) {
       if (left == right) {
           if (arr[left] > 0) {
               return arr[left];
           }else {
               return 0;
           }
       }
       int center = (left + right) / 2;
       int maxLeftSum = maxSumRec(arr, left, center);
       int maxRightSum = maxSumRec(arr, center + 1, right);
       int maxLeftBorderSum =0, leftBorderSum =0;
       for (int i = center; i >= left; i--) {
           leftBorderSum += arr[i];
           if (leftBorderSum > maxLeftBorderSum) {
               maxLeftBorderSum = leftBorderSum;
           }
       }
       int maxRightBorderSum =0, rightBorderSum = 0;
       for (int i = center + 1; i <= right; i++) {
           rightBorderSum += arr[i];
           if (rightBorderSum > maxRightBorderSum) {
               maxRightBorderSum = rightBorderSum;
           }
       }
       return max3(maxLeftSum, maxRightSum, maxLeftBorderSum + maxRightBorderSum);
   }

   private static int max3(int a, int b, int c) {
       int max = a;
       if (b > max) {
           max = b;
       }
       if (c > max) {
           max = c;
       }
       return max;
   }

    public static void main(String[] args) {
//        int[] arr = {2,3,4,5,6,7,12,33,44,55,66,77,88,9,7,7,5,4,3,5,6,7,8,8,9,8,98,6,6,65,6,7,8,7,68,8,67,8,8,};
//        int max;
//        long start = System.currentTimeMillis();
//        max = maxSubSum1(arr);
//
////        max = maxSubSum2(arr);
//
//        long end = System.currentTimeMillis();
//
//        System.out.print(end - start);
//
//
//        System.out.println(max3(6,4,9));

        System.out.print(maxSumRec(new int[] {3,-1,3,-9,2},0,4));
    }
}