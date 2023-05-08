package chapter5;

import java.util.Scanner;

//Challenge4
//Calculate the total of someone's cellphone bill.
//1. Allow the operator to input the plan fee and the no.of.overage minutes
//2. Charge 0.25 for every overage minute over the plan and 15% tax on the subtotal
//3. Create separate methods for tax, overage fee and final total.
//4. Print itemized bill.
public class PhoneBillCalculator_Challenge {
    public static void main(String args[]){

        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the plan fee:");
            double planFee= scan.nextDouble();
        System.out.println("Enter the overage minutes:");
            double overageMins= scan.nextDouble();
        scan.close();
        double overageFees= calculateOverageFee(overageMins);
        double subTotal= planFee+overageFees;
        double tax= calculateTax(subTotal);
        double totalBill= calculateTotalBill(subTotal, tax);
        System.out.println("Phone Bill Statement:");// Formatted output using Printf statements is out of the exercise!
        System.out.printf("%-10s%10s%n","Plan","$"+planFee);
        System.out.printf("%-10s%10s%n","Overage","$"+overageFees);
        System.out.printf("%-10s%10s%n","Tax","$"+tax);
        System.out.printf("%-10s%10s%n","Total","$"+totalBill);
    }
    public static double calculateOverageFee(double overageMinutes){
        double callRatePerMinute= 0.25;
        double overageFee= overageMinutes * callRatePerMinute;
        return overageFee;
    }

    public static double calculateTax(double subTotal){
        double taxPercent=0.15;
        double taxAmount=subTotal * taxPercent;
        return taxAmount;
    }

    public static double calculateTotalBill(double subTotal, double tax){
        double totalAmount= subTotal + tax;
        return totalAmount;
    }

}
