package java7.override;

/**
 * Created by prasad on 6/7/17.
 */
public class OverrideDemo {
    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.fillShape();
        Circle circle = new Circle();
        circle.fillShape();
        Rectangle rectangle = new Rectangle();
        rectangle.fillShape();
    }
}
