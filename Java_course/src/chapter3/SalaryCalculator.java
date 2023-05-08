package chapter3;

import java.util.Scanner;
//If statement
//All sales people get a basic pay of $1000, if they make more than 10 sales then they get an additional bonus $250
public class SalaryCalculator {
    public static void main(String args[]){
        System.out.println("How many sales did you make?");
        Scanner scanner= new Scanner(System.in);
        int noOfSales= scanner.nextInt();
        scanner.close();
        int salary =1000;
        int bonus= 250;
        int limit= 10;
        if(noOfSales>limit){
            salary= salary+bonus;
        }
        System.out.println("The salary is $"+ salary);
    }
}
