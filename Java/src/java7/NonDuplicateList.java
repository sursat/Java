package java7;

import java.util.*;

/**
 * Created by prasad on 13/7/17.
 */
public class NonDuplicateList {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> list = new ArrayList<String>();
        Set<String> set = new HashSet<>();
        String input = "";
        while (!input.equalsIgnoreCase("STOP")) {
            input = in.next();in.nextLine();
            list.add(input);
            set.add(input);
        }

        System.out.println("-------------------");
        list.forEach(System.out::println);
        System.out.println("-------------------");
        System.out.println("-------------------");
        set.forEach(System.out::println);
        System.out.println("-------------------");
        in.close();
    }
}
