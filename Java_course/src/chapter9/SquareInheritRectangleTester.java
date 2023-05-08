package chapter9;
//Overriding and Overloading Inherited methods
//overloading print method
public class SquareInheritRectangleTester {
    public static void main(String args[]){
        Rectangle rectangle =new Rectangle();
        // Has only one print method.
        rectangle.print();
        // Result
        // I am a Rectangle


        Square square = new Square();
        // Has two options of print method one inherited and one overloaded.
        square.print();
        square.print("square");
        // Result
        // I am a Rectangle
        // I am a square

    }
}
