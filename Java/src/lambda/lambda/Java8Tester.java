package lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by prasad on 8/4/17.
 */
public class Java8Tester {
    final static String salutation = "Hello! ";
    public static void main(String args[]) {
        Java8Tester tester = new Java8Tester();

        //with type declaration
        MathOperation addition = (int a, int b) -> a + b;

        //with out type declaration
        MathOperation subtraction = (a, b) -> a - b;

        //with return statement along with curly braces
        MathOperation multiplication = (int a, int b) -> {return a * b;};

        //without return statement and without curly braces
        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));

        //with parenthesis
        GreetingService greetService1 = message ->
                System.out.println("Hello " + message);

        //without parenthesis
        GreetingService greetService2 = (message) ->
                System.out.println("Hello " + message);

        GreetingService greetService3 = message -> System.out.println(salutation + message);

        greetService1.sayMessage("Mahesh");
        greetService2.sayMessage("Suresh");
        greetService3.sayMessage("Prasad");

        //Method reference example
        List names = new ArrayList();

        names.add("Mahesh");
        names.add("Suresh");
        names.add("Ramesh");
        names.add("Prasad");
        names.add("Amar");

        names.forEach(System.out::println);
        //--------------

    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}