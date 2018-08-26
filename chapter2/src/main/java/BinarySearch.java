/**
 * @author Janita
 * @date 2018/8/26 - 下午3:47
 * 类说明：
 */
public class BinarySearch {

    public static <AnyType extends  Comparable<? super AnyType>> int binarySearch(AnyType[] a, AnyType x) {

        int low = 0, high = a.length - 1;
        while (low <= high) {
            int center = (low + high) / 2;
            if (a[center].compareTo(x) < 0) {
                low = center + 1;
            }else if (a[center].compareTo(x) > 0) {
                high = center - 1;
            }else {
                return center;
            }
        }
        return -1;
    }
}
