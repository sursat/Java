package streams;

import java.util.List;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * Created by prasad on 13/4/17.
 */
public class StreamsPractice {

    public static void main(String[] args) {


        /**
         stream() − Returns a sequential stream considering collection as its source.

         parallelStream() − Returns a parallel Stream considering collection as its source.
         */

        /**
         * filter:
         * The ‘filter’ method is used to eliminate elements based on a criteria.
         * The following code segment prints a count of empty strings using filter.
         */
        System.out.println("-------- filter -----------");
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        filtered.forEach(System.out::println);

        /**
         * For Each:
         * Stream has provided a new method ‘forEach’ to iterate each element of the stream.
         * The following code segment shows how to print 10 random numbers using forEach.
        * */
        System.out.println("------------ For Each -------------");
        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);

        /**
         * Map:
         * The ‘map’ method is used to map each element to its corresponding result.
         * The following code segment prints unique squares of numbers using map.
         */
        System.out.println("------------ Map -------------");
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        //get list of unique squares
        List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
        squaresList.forEach(System.out::println);

        /**
         * limit:
         * The ‘limit’ method is used to reduce the size of the stream.
         * The following code segment shows how to print 10 random numbers using limit.
         */
        System.out.println("----------limit-------------");
        random.ints().limit(10).forEach(System.out::println);

        /**
         * Sorted:
         * The ‘sorted’ method is used to sort the stream.
         * The following code segment shows how to print 10 random numbers in a sorted order.
         */
        System.out.println("-------- Sorted -----------");
        random.ints().limit(10).sorted().forEach(System.out::println);

        /**
         * Parallel stream:
         * parallelStream is the alternative of stream for parallel processing.
         */
        System.out.println("--------- Parallel Stream-----------");
        //get count of empty string
        long count = strings.parallelStream().filter(string -> string.isEmpty()).count();
    }
}
