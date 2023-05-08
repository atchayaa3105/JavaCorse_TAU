package chapter3;
//Challenge2
//The objective of the game is to count change to exactly $1. Create a program that enter the change coins penny,nickle,
// dime and quarters. The program should count all the values of the changes and if it is exactly $1, they win! Otherwise
// we print the exceeding change or the shortage of the change.
import java.util.Scanner;

public class CountTo1DollarGame_Challenge {
    public static void main(String args[]){
        int pennyValue= 1;
        int nickelValue= 5;
        int dimeValue= 10;
        int quarterValue= 25;
        int dollarValue= 100;

        System.out.println("Enter the number of Pennies:");
        Scanner scanner = new Scanner(System.in);
        int pennies= scanner.nextInt();
        System.out.println("Enter the number of Nickels:");
        int nickels= scanner.nextInt();
        System.out.println("Enter the number of Dimes:");
        int dimes= scanner.nextInt();
        System.out.println("Enter the number of Quarters:");
        int quarters= scanner.nextInt();

        int countChange= pennies*pennyValue + nickels*nickelValue + dimes*dimeValue + quarters*quarterValue;
        int changeExtra= countChange-dollarValue;
        int changeShortage= dollarValue-countChange;
        if(countChange == dollarValue){
            System.out.println("Winner! You exactly counted 1$");
        } else if (countChange > dollarValue) {
            System.out.println("Oops! You counted "+ changeExtra+" cents more!");
        }else {
            System.out.println("Oops! You counted "+ changeShortage+" cents less!");
        }
    }
}
