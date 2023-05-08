package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String args[]){
        System.out.println("Enter the no of hours worked:");
        Scanner scanner = new Scanner(System.in);
        int hoursWorked= scanner.nextInt();
        System.out.println("Enter the hourly pay rate:");
        double payRate=scanner.nextDouble();

        double grossPay= hoursWorked * payRate;
        System.out.println("Your grossPay is:"+ grossPay);

    }
}
