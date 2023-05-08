package chapter6;
//Objects
//Creating an object Rectangle with its fields and methods defined as a blueprint.
public class Rectangle {
//global variables encapsulated to use within this class
    private double length;
    private double Breadth;

    public Rectangle(){//constructor1
        length = 0;
        Breadth = 0;
    }

    public Rectangle(double length, double Breadth){//constructor2
        // 'this' represents this class
        this.length = length; //can be set this way
        setBreadth(Breadth); //or can be set this way. these are only different here to demo alternative options
    }

    public double getLength(){//getter
        return length;
    }

    public void setLength(double length){//setter
        this.length = length;
    }

    public double getBreadth(){//getter
        return Breadth;
    }

    public void setBreadth(double Breadth){//setter
        this.Breadth = Breadth;
    }

    public double calculatePerimeter(){
        return (2 * length) + (2 * Breadth);
    }

    public double calculateArea(){
        return length * Breadth;
    }
}
