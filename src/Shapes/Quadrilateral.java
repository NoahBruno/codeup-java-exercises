package Shapes;

public class Quadrilateral extends Shape implements measurable{
    protected int length;
    protected int width;

    public Quadrilateral(int length, int width){
        this.length = length;
        this.width = width;
    }

//    public int getLength() {
//        return length;
//    }
//
//    public int getWidth() {
//        return width;
//    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getPerimeter() {
        return 2 * length + 2 * width ;
    }

    public double getArea() {
        return length * width;
    }
}
