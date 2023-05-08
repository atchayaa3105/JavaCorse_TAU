package chapter4;

import java.util.Scanner;

//For loop
// A cashier that scans all the items bought and accumulate the total cost.
public class CashierProgram {
    public static void main(String args[]){
        System.out.println("Enter the total number of items bought");
        Scanner scan= new Scanner(System.in);
        int quantity = scan.nextInt();
        double totalCost=0;
        for(int i=1; i<=quantity; i++){//i is the sentinel and its range is mentioned here
            System.out.println("Enter the price of item"+ i);
            double price= scan.nextDouble();
            totalCost+= price;
        }
        scan.close();
        System.out.println("The total Cost is $"+totalCost);
    }
}
