import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by prasad on 29/5/17.
 */
public class AB {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        String[] s ={"a","b","a","c"};
        for (String ss: s)
            list.add(ss);
        list.forEach(System.out::println);
        System.out.println("---------");
        Set<String> set = new HashSet<>();
        set.addAll(list);
        list = new ArrayList<>();
        list.addAll(set);
        list.forEach(System.out::println);
    }
}
