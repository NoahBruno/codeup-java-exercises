package Shapes;

public class Rectangle extends Quadrilateral implements measurable{
    public Rectangle(double length, double width) {
        super( length, width);
    }
    // setters
    public void setWidth(double width) {}
    public void setLength(double length) {}


    // getters
    public double getPerimeter() {
        return ((2 * length) + (2 * width));
    }

    public double getArea() {
        return length * width;
    }

//    protected int length;
//    protected int width;
//
//    public Rectangle (int length, int width ){
//        this.length = length;
//        this.width = width;
//    }

//    public int getArea(){
//        return length * width;
//    }
//
//    public int getPerimeter(){
//        return (2 * length) + (2 * width);
//    }

}
