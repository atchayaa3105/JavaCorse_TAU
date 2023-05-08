package chapter5;

import java.util.Scanner;

//Variable Scope
// Create an instant credit check program that approves anyone who makes $25000 and has credit score 700 and above.
// Reject all others!
public class InstantCreditCheck {
    static double minSalary= 25000;
    static int minCreditScore= 700;
    static Scanner scan= new Scanner(System.in);
    public static void main(String args[]){
        double s = getSalary();
        int c = getCreditScore();
        scan.close();
        boolean q = isUserQualified(s,c);// Here they are called Arguments
        notifyUser(q);
    }

    public static double getSalary(){
        System.out.println("Enter the monthly income:");
        double salary= scan.nextDouble();
        return salary;
    }
    public static int getCreditScore(){
        System.out.println("Enter your credit score:");
        int creditScore= scan.nextInt();
        return creditScore;
    }
    public static boolean isUserQualified(double salary, int creditScore){// Here they are called parameters
        if(salary>= minSalary && creditScore>=minCreditScore) return true;
        else return false;
    }
    private static void notifyUser(boolean isQualified) {
        if(isQualified) System.out.println("Congrats! The Credit check passed and the candidate is approved!");
        else System.out.println("Sorry! You did not meet the expectations! The Credit check failed and the candidate is rejected.");
    }
}

//ANOTHER METHOD

//public class InstantCreditCheck {
//    public static void main(String args[]){
//        Scanner scan= new Scanner(System.in);
//    System.out.println("Enter the monthly income:");
//        double salary= scan.nextDouble();
//    System.out.println("Enter your credit score:");
//        int creditScore= scan.nextInt();
//        scan.close();
//        isUserQualified(salary,creditScore);
//    }
//    public static void isUserQualified(double salary, int creditScore){
//        double minSalary= 25000;
//        int minCreditScore= 700;
//        if(salary>= minSalary && creditScore>=minCreditScore) System.out.println("Congrats! The Credit check passed and the candidate is approved!");
//        else System.out.println("Sorry! You did not meet the expectations! The Credit check failed and the candidate is rejected.");
//    }
//}
