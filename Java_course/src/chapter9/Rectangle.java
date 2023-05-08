package chapter9;
//Overriding and Overloading Inherited methods
public class Rectangle {
    protected int SIDES = 4;
    protected double length;
    protected double breadth;

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getBreadth() {
        return breadth;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }
    //Overriding
    public double createPerimeter(){
        return (2*length) + (2*breadth);
    }
    //Overloading
    public void print(){
        System.out.println("I am a Rectangle");
    }
}
