package chapter11;
//Abstraction
public class Rectangle extends Shape {


    //When extending an abstract class, we add the key word abstract to the subclass or implement all the abstract
    // methods in the super class
    //Here we choose to implement all the abstract methods
    private double length;
    private double breadth;

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
    public Rectangle(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }
    @Override
    double calculateArea() {
        return length * breadth;
    }

}
