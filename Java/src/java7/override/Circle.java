package java7.override;

/**
 * Created by prasad on 6/7/17.
 */
public class Circle extends Shape implements OverRideInterface{

    public void fillShape(){
        System.out.println("Fill circle shape");
    }

    @Override
    public void display() {

    }
}