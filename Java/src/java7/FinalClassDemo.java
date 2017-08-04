package java7;

/**
 * Created by prasad on 6/7/17.
 */

/*
 here FinalClass can not be extended as it defined as final class.
 final keyword is not valid for abstract class and interface as there is no concrete
 behaviour defined for abstract class and interface.
  */

final class FinalClass {
    public static void display(){
        System.out.println("Hello I am display");
    }
    public void getResult(int a){
        System.out.println(a);
    }
}
public class FinalClassDemo {
    public static void main(String[] args) {
        FinalClass finalClass = new FinalClass();
        FinalClass.display();
    }
}
