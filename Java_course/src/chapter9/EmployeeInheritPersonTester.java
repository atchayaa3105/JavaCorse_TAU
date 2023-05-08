package chapter9;
//The Inheritance relationship bet the classes Person(parent) and Employee(Child).
public class EmployeeInheritPersonTester {
    public static void main(String args[]){
        /*// The parent class has access to its members and not member of the child class
        Person person1= new Person();
        person1.getName();
        person1.getAge();
        person1.getGender();
        // The child class has access to the members(name, age, gender) of the parent class
        Employee employee1= new Employee();
        employee1.getName();
        employee1.getEmployeeId();
        employee1.getEmployeeTitle();
        employee1.getAge();
        employee1.getGender();*/

        /*// Calling the default parent constructor though only the child is defined and when program runs.
        Employee employee = new Employee();
        //Result
        //Default Person Constructor
        //Default Employee Constructor*/

        //Calling a specific parent constructor from the child using the key "super()"
        Employee employee = new Employee();
        //Result
        //Person Constructor with name parameter
        //Default Employee Constructor
    }
}
