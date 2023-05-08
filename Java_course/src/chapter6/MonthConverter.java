package chapter6;
//Convert a month from integer to string and vice-versa using DetermineMonth class with override methods of getMonth.
public class MonthConverter {
    public static void main(String args[]){
        System.out.println("Integer to String: "+ DetermineMonth.getMonth(2));
        System.out.println("String to Integer: "+ DetermineMonth.getMonth("December"));
    }
}
