package chapter6;

import java.util.Scanner;
//Objects as method parameters and return type
// Create rectangle instances of different rooms and create methods to get dimensions and calculate total area
// separately and display the result.
public class HomeAreaCalculator {
    Scanner scan= new Scanner(System.in);
    public static void main(String args[]){
        HomeAreaCalculator calculator= new HomeAreaCalculator();//Every class has its own default constructor defined.
        //We pass this constructor to avoid making the method getRoomDimensions static.
        Rectangle kitchen= calculator.getRoomDimensions();
        Rectangle living= calculator.getRoomDimensions();
        Rectangle bedroom= calculator.getRoomDimensions();
        Rectangle bathroom= calculator.getRoomDimensions();
        calculator.scan.close();
        double totalHomeArea= calculator.calculateTotalArea(kitchen,living,bedroom,bathroom);
        System.out.println("The total area is: "+totalHomeArea+" square meters");
    }

    private Rectangle getRoomDimensions() {

        System.out.println("Enter the length:");
        double length= scan.nextDouble();
        System.out.println("Enter the breadth:");
        double breadth= scan.nextDouble();
        return new Rectangle(length,breadth);
    }

    private double calculateTotalArea(Rectangle kitchen, Rectangle living, Rectangle bedroom, Rectangle bathroom) {
        double totalArea= kitchen.calculateArea()+living.calculateArea()+bedroom.calculateArea()+bathroom.calculateArea();
        return totalArea;
    }

}
