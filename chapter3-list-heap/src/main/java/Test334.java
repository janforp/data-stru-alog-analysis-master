import java.util.*;

/**
 * @author Janita
 * @date 2018/8/26 - 下午8:29
 * 类说明：
 */
public class Test334 {

    public static List<Integer> trimEven(List<Integer> list) {
        long s = System.currentTimeMillis();
        if (list == null) {
            return null;
        }
        list.removeIf(next -> next % 2 == 0);
        long e = System.currentTimeMillis();
        System.out.println("\n***\t" + (e - s));
        return list;
    }

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 800_000; i++){
            list.add(new Random().nextInt(100));
        }
        System.out.println("\n***\t" + trimEven(list));
    }
}
