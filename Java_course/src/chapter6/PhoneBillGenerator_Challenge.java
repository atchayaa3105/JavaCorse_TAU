package chapter6;
//Challenge5
// Aphone bill should contain default, id, base cost, number of alloted minutes and number of minutes used. Calculate
// Overage,tax and total bill and print itemised bill.
//1. Create constructors: default, id only, all fields. No matter which constructor is used, all fields should be set.
//2. Create a class that instantiates a phoneBill and print it.

public class PhoneBillGenerator_Challenge {
    private int id;
    private double baseCost;
    private int noOfAllotedMinutes;
    private int noOfMinutesUsed;

    //Default Constructor
    public PhoneBillGenerator_Challenge(){
        id= 0;
        baseCost=0;
        noOfAllotedMinutes=0;
        noOfMinutesUsed=0;
    }
    //Constructor with id_only
    public PhoneBillGenerator_Challenge(int id){
        this.id=id;
        baseCost=100;
        noOfAllotedMinutes=100;
        noOfMinutesUsed=0;
    }
    //Constructor with all fields
    public PhoneBillGenerator_Challenge(int id, double baseCost, int noOfAllotedMinutes, int noOfMinutesUsed){
        this.id=id;
        this.baseCost=baseCost;
        this.noOfAllotedMinutes=noOfAllotedMinutes;
        this.noOfMinutesUsed=noOfMinutesUsed;
    }
    // All fields should be set. But we won't use it here!

    //ID
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    //Base cost
    public double getBaseCost() {
        return baseCost;
    }
    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    //No.Of.Alloted_minutes
    public int getNoOfAllotedMinutes() {
        return noOfAllotedMinutes;
    }
    public void setNoOfAllotedMinutes(int noOfAllotedMinutes) {
        this.noOfAllotedMinutes = noOfAllotedMinutes;
    }

    //No.Of.Used_minutes
    public int getNoOfMinutesUsed() {
        return noOfMinutesUsed;
    }
    public void setNoOfMinutesUsed(int noOfMinutesUsed) {
        this.noOfMinutesUsed = noOfMinutesUsed;
    }

    public double calculateOverage(){
        if(noOfMinutesUsed< noOfAllotedMinutes) return 0;
        double ratePerMinute=0.25;
        double overage= (noOfMinutesUsed-noOfAllotedMinutes)*(ratePerMinute);
        return overage;
    }

    public double calculateTax(){
        double taxPercent=0.15;
        double tax= (baseCost + calculateOverage()) * taxPercent;
        return tax;
    }

    public double calculateTotalBill(){
        return baseCost + calculateOverage() + calculateTax();
    }

    public void printItemizedBill(){
        System.out.println("Phone Bill Statement:");
        System.out.printf("%-10s%10s%n","Id", id);
        System.out.printf("%-10s%10s%n","Plan","$"+ baseCost);
        System.out.printf("%-10s%10s%n","Overage","$"+calculateOverage());
        System.out.printf("%-10s%10s%n","Tax","$"+calculateTax());
        System.out.printf("%-10s%10s%n","Total","$"+calculateTotalBill());
    }
}
