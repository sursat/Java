package java7.vectorArrayList;

import java.util.*;

/**
 * Created by prasad on 7/7/17.
 */
public class VectorArrayListDemo {

    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        vector.add("hello");
        vector.add("PRK");
        vector.add("hello");
        vector.forEach(System.out::println);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("hello");
        arrayList.add("PRK");
        arrayList.add("hello");
        arrayList.add("1234");
        arrayList.addAll(vector);
        arrayList.forEach(System.out::println);
        System.out.println("=================");
        Set<String> set = new TreeSet<>();
        set.addAll(arrayList);
        set.forEach(System.out::println);
    }
}
