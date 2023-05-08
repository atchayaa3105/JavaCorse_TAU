package chapter3;

import java.util.Scanner;

// Nested If Statement
//To Qualify a loan, the person must earn more than $30000 and must also be working for more than 2 years.
public class LoanQualifier {
    public static void main(String args[]) {
        System.out.println("How much do you earn per month?");
        Scanner scanner = new Scanner(System.in);
        int monthlyIncome = scanner.nextInt();

        System.out.println("Enter the no of years with the current employer");
        double noOfYears = scanner.nextDouble();

        scanner.close();

        int incomeRequired = 30000;
        int minYearsRequired = 2;
        if (monthlyIncome >= incomeRequired) {
            if (noOfYears >= minYearsRequired) {
                System.out.println("Congrats! You are eligible for the loan");
            } else
                System.out.println("Sorry! You have to be working with your current employer more than " + minYearsRequired + " years");
        } else{
            System.out.println("Oops! You dont hold eligible monthly income,you must earn at least $" + incomeRequired);

        }
    }
}
//