package chapter3;

import java.util.Scanner;

// Relational and logical operators
//To Qualify a loan, the person must earn more than $30000 and must be working for more than 2 years with the current employer.
public class operatorLoanQualify {
    public static void main(String args[]) {
        int requiredMonthlyIncome= 30000;
        double requiredYears= 2.0;
        System.out.println("How much do you earn per month?");
        Scanner scanner = new Scanner(System.in);
        int monthlyIncome = scanner.nextInt();

        System.out.println("Enter the no of years with the current employer");
        double noOfYears = scanner.nextDouble();

        scanner.close();

        if((monthlyIncome>= requiredMonthlyIncome)&&(noOfYears>= requiredYears)){
            System.out.println("Congrats! You are eligible for the loan");
        }else{
            System.out.println("Sorry! You are not eligible for the loan");
        }
    }
}
