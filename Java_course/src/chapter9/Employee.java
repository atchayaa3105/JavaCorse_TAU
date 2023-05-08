package chapter9;
//Inheritance: Sub-class(Child)
public class Employee extends Person {
    private int employeeId;
    private String employeeTitle;

    public Employee(){
        super("Atchayaa");
        System.out.println("Default Employee Constructor");
    }
    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeTitle() {
        return employeeTitle;
    }

    public void setEmployeeTitle(String employeeTitle) {
        this.employeeTitle = employeeTitle;
    }
}
