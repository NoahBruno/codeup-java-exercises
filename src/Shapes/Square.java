package Shapes;

public class Square extends Quadrilateral{
    public Square(double side ) {
        super(side, side);
    }    // setters
    public void setWidth(double side) {
        this.width = side;
    }
    public void setLength(double side) {
        this.length = side;
    }

    // getters
    public double getPerimeter() {
        return 2 * this.length + this.width;
    }
    public double getArea() {
        return this.length * this.width;
    }
//    public Square(int side){
//        super(side, side);
//    }
//
//    public int getArea(int side){
//        return 4 * side;
//    }
//
//    public int getPerimeter(int side){
//        return side ^ 2;
//    }
}
