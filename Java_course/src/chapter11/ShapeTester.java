package chapter11;
//Abstraction
public class ShapeTester {
    public static void main(String args[]){
        //Cannot instantiate as new Shape() because abstract classes cannot be instantiated and Shape() is abstract.
        Shape rectangle=new Rectangle(10,5);
        rectangle.print();
        System.out.println(rectangle.calculateArea());
        //I am in good shape!
        //50.0
    }
}
