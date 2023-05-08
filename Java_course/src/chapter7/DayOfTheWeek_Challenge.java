package chapter7;

import java.util.Scanner;

//Challenge6
//1.Make an array that has textual values of the days of the week.
//2.Have the user enter a number corresponding to the day of the week. Assume the week starts on Monday.
//3.The program should output the string that represents day of the Week (i.e)If the user inputs 1 then the program should
// return Monday.
public class DayOfTheWeek_Challenge {
    private static String[] dayOfWeek;
    private static Scanner scan= new Scanner(System.in);
    public static void main(String args[]){
        dayOfWeek= new String[]{"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        String dayInString = convertDayInNumbersToStrings();
        System.out.println("The Day is: "+dayInString);
    }
    public static String convertDayInNumbersToStrings(){
        System.out.println("Enter the day in number:");
        int dayInNumber = scan.nextInt();
        String correspondingDay=dayOfWeek[dayInNumber-1];
        return correspondingDay;
    }
}
