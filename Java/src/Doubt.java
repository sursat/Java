import java.util.Collection;
import java.util.LinkedList;

/**
 * Created by prasad on 25/5/17.
 */

class A{
    private int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
public class Doubt {

    public static void main(String[] args) {

        /*Collections compare*/

        Collection<String> collection1 = fill1To10Numbers();
        Collection<String> collection2 = fill10To1Numbers();
        System.out.println(collection1.equals(collection2));
        /*------------------*/
        /*Object ref behaviour for mutable and immutable objects ... String is immutable and StringBuffer is mutable*/
        System.out.println("*************************");
        String msg = "hello";
        displayWithMessage(msg);
        System.out.println(msg);
        System.out.println("--------------------------");
        StringBuilder stringBuilder = new StringBuilder("hello");
        displayWithMessage(stringBuilder);
        System.out.println(stringBuilder.toString());
        System.out.println("*************************");
        /*----------------------------------------------------*/

        Collection<A> aCollection = new LinkedList<>();
        A a = new A();
        for(int i =0; i < 10;i++){
            a.setNum(i);
            aCollection.add(a);
        }

        aCollection.forEach(a1 -> System.out.println(a1.getNum()));
    }

    public static void displayWithMessage(String msg){
        String k = msg;
        k = "hi "+k;
        System.out.println(k);
    }

    public static void displayWithMessage(StringBuilder msg){
        StringBuilder k = msg;
        k = k.append(" Hi");
        System.out.println(k);
    }

    public static LinkedList<String> fill1To10Numbers(){
        LinkedList<String> linkedList = new LinkedList<>();
        for(int i = 1 ;i<=10;i++)
            linkedList.add(Integer.toString(i));
        return linkedList;
    }

    public static LinkedList<String> fill10To1Numbers(){
        LinkedList<String> linkedList = new LinkedList<>();
        for(int i = 10 ;i>=00;i--)
            linkedList.add(Integer.toString(i));
        return linkedList;
    }
}
