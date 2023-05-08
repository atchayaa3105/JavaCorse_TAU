package chapter3;

import java.util.Scanner;

//If Else statement
//All sales people are expected to make 10 sales per week.
// If they do, they get a congratulations message otherwise they are informed how many sales they are short.
public class MessageGenerator {
    public static void main(String args[]){
        System.out.println("How many sales did you make?");
        Scanner scanner= new Scanner(System.in);
        int noOfSales= scanner.nextInt();
        scanner.close();
        int minSales= 10;
        if(noOfSales >= minSales){
            System.out.println("Congartulations! You have made the min quota of sales.");
        }else{
            int shortOfSales= minSales- noOfSales;
            System.out.println("Sorry! You did not make it and "+ shortOfSales+ " sales short");
        }
    }
}
