package chapter4;

import java.util.Scanner;

//While loop
//Each store employee gets $15 per hour. The manager enters the total weekly hours worked for each employee and calculates the total pay.
// No overtime is allowed.
public class EmployeeWeeklyPay {
    public static void main(String args[]){
        int rate= 15;
        int MaxHours= 40;
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the total weekly hours worked");
        int totalHours= scan.nextInt();//totalHours is the sentinel
        // No overtime Allowed
        while(totalHours > MaxHours || totalHours< 1){
            System.out.println("The total hours exceeded the limit or invalid. Try Again!");
            totalHours= scan.nextInt();// Always update the **sentinel** (the variable that can be updated) to check the loop again.
        }
        scan.close();
        double pay= totalHours * rate;
        System.out.println("The Total pay for the week is: $"+ pay);
    }
}
