package Shapes;
import Shapes.Rectangle;
import Shapes.Square;

public class ShapesTest {
    public static void main(String[] args) {
        measurable myShape;


        myShape = new Rectangle (4,5);
        System.out.println("area: " + myShape.getArea());
        System.out.println("perimeter: " + myShape.getPerimeter());

        myShape = new Square(5);
        System.out.println("area: " + myShape.getArea());
        System.out.println("perimeter: " + myShape.getPerimeter());
//        Rectangle box1 = new Rectangle(4,5);
//
//
//        System.out.println("box1's area and perimeter: ");
//        System.out.println("area: " + box1.getArea());
//        System.out.println("perimeter: " + box1.getPerimeter());

//        Square box2 = new Square (5);
//
//        System.out.println("box2's area and perimeter: ");
//        System.out.println("area: " + box2.getArea(5));
//        System.out.println("perimeter: " + box2.getPerimeter(5));

    }
}
