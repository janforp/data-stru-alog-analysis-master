import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Janita
 * @date 2018/8/26 - 下午4:54
 * 类说明：
 */
public class IteratorTest {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);

        for (Integer i : list) {
//            list.remove(i);
        }

        for (int i = 0; i < list.size(); i++) {
            list.remove(i);
        }

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println("\n***\t" + iterator.next());
            iterator.remove();
        }


        System.out.println("\n***\t" + list);
    }
}
