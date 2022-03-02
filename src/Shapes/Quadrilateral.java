package Shapes;

public abstract class Quadrilateral extends Shape implements measurable{
    protected double length;
    protected double width;

    public Quadrilateral(double length, double width){
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

    public abstract void setWidth(double width);
    public abstract void setLength(double length);

    public double getLength() {
        return this.length;
    }

    public double getWidth() {
        return this.width;
    }
}
