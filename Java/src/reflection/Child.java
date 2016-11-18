package reflection;

/**
 * Created by egnaro on 18/11/16.
 */
public class Child extends Base {

    private String hello = "Hello";

    public Child() {
    }

    public Child(String hello) {
        this.hello = hello;
    }

    private void display() {
        System.out.println(hello);
    }
}
