package chapter9;
//Overriding and Overloading Inherited methods
public class Square extends Rectangle{
    //Overriding
    @Override// Adding override annotation is not mandatory but highly encouraged to use.
    public double createPerimeter() { //  exact method name in the superclass and change the body
        return (SIDES * length);
    }

    //Overloading
    public void print(String what){ // exact method name in the super class but different parameters
        System.out.println("I am a "+what);
    }
}
