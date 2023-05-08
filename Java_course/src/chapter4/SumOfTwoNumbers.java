package chapter4;

import java.util.Scanner;

//Do While Loop
//The user enters two numbers, and we expect the sum.
// This process runs repeatedly for different sets of entries until the user ends it.
public class SumOfTwoNumbers {
    public static void main(String args[]){
        Scanner scan =new Scanner(System.in);
        boolean again;//again is the sentinel
        do{
            System.out.println("Enter the first number:");
            int numberOne= scan.nextInt();
            System.out.println("Enter the second number:");
            int numberTwo= scan.nextInt();
            int sum= numberOne+ numberTwo;
            System.out.println("The sum is : "+ sum);
            System.out.println("Do you want to run again? Say 'true' if yes or 'false' if no!!");
            again= scan.nextBoolean();// The sentinel is updated as it checks the loop again
        }while(again);

    }
}
