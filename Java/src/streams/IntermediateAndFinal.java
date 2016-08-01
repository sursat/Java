package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by prasad on 8/1/16.
 */

/*
* Next: Lazy operations -- streams does't hold any data
*
* All methods in streams which returns stream will not hold any data.
* These are just declarations, but no data will be processed
 * an operation on a stream that returns a stream is called an intermediary operation.
 *
 * Here "peek" is intermediate operation ( which returns stream)
 * and "forEach" is final operation (which doesn't returns stream)
 *
 * and If your stream have final operation then your entire stream will be executed
 * other wise it will be considered as lazy operation (It just act as declaration)
 * For example execute snippet 2
* */

public class IntermediateAndFinal {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("one", "two", "three", "four", "five");

        Predicate<String> p1 = Predicate.isEqual("two");

        Predicate<String> p2 = Predicate.isEqual("three");

        List<String> list = new ArrayList<>();

        /*-----------Snippet - 1 ----------*/
        //stream.peek(System.out::println)
        //        .filter(p1.or(p2))
        //        .peek(list::add);

        /*-----------Snippet - 2 ----------*/
        stream.peek(System.out::println)
                .filter(p1.or(p2))
                .forEach(list::add);


        System.out.println("Done");

        System.out.println("size = " + list.size());

    }
}
