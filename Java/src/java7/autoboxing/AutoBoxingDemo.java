package java7.autoboxing;

/**
 * Created by prasad on 7/7/17.
 */

class AB{
    public void display(String str){
        System.out.println("I am in String parameter and Param value = "+str);
    }

    public void display(Object str){
        System.out.println("I am in Object parameter and Param value = "+str);
    }
}
public class AutoBoxingDemo {

    public static void main(String[] args) {
        Integer integer = 123;
        Float floatVal = 212.21F;
        AB ab = new AB();
        System.out.println(integer);
        System.out.println(floatVal);
        String s = new String("Me");
        ab.display("hello");
        ab.display(s);
        ab.display(new Float("233.3"));
    }
}
