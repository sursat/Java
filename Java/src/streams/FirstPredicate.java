package streams;

import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by prasad on 8/1/16.
 */
public class FirstPredicate {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("one", "two", "three", "four", "five");

        Predicate<String> p1 = s -> s.length() > 3;

        Predicate<String> p2 = Predicate.isEqual("two");

        Predicate<String> p3 = Predicate.isEqual("three");

        stream.filter(p2.or(p3))
                .forEach(s -> System.out.println(s));

        //stream.filter(p1)
        //        .forEach(s -> System.out.println(s));
    }
}
