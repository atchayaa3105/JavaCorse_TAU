package chapter11;
//Abstraction
public abstract class Shape {
    abstract double calculateArea();// Abstract methods have no body.

    public void print(){
        System.out.println("I am in good shape!");
    }
}
