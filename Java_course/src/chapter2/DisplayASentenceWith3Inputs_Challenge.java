package chapter2;

import java.util.Scanner;
//Challenge1
//Create a program that asks the user for season of the year,a whole number and an adjective and then display
//"On a (adjective)(season) day, I drink a min of (whole number) cups of coffe."
public class DisplayASentenceWith3Inputs_Challenge {
    public static void main(String args[]){
        System.out.println("Enter the season of the year");
        Scanner scanner= new Scanner(System.in);
        String season = scanner.next();
        System.out.println("Enter a whole number");
        int wholeNumber = scanner.nextInt();
        System.out.println("Enter an adjective");
        String adjective = scanner.next();

        System.out.println("On a "+ adjective +" "+ season +" day, I drink a minimum of "+ wholeNumber+ " cups of coffe.");
    }
}
