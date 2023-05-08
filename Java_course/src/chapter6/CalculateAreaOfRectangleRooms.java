package chapter6;
//Instantiating Objects
// Create instances two rectangle rooms in a house and calculate the total area of both the rooms.
public class CalculateAreaOfRectangleRooms {
    public static void main(String args[]){
        //Rectangle1
        Rectangle room1= new Rectangle();
        room1.setLength(50);
        room1.setBreadth(25);
        double areaOfRoom1= room1.calculateArea();
        //Rectangle2
        Rectangle room2= new Rectangle(75,30);
        double areaOfRoom2= room2.calculateArea();
        //Total Area
        double totalArea=areaOfRoom1+ areaOfRoom2;
        System.out.println("The Area of both the rooms:"+ totalArea+" square meters");
    }
}
