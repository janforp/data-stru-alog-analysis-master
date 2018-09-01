import java.util.ArrayList;
import java.util.List;

/**
 * @author Janita
 * @date 2018/8/26 - 下午8:12
 * 类说明：
 */
public class WeuYunSun {

    public static void main(String[] args) {

        int min = 20;

        //30
        int newM = min + (min >> 1);
        System.out.println("\n***\t" + newM);

        List<Integer> list = new ArrayList<>();
        list.add(1);
        for (Integer integer : list) {
            System.out.println("\n***\t" + integer);
        }

        System.out.println("\n***\t" + list.get(3));
    }
}
