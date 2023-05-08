package chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayOfGrades {
    private static int[] grades;
    public static Scanner scan= new Scanner(System.in);
    public static void main(String args[]){
        System.out.println("How many grades do you have?");
        grades= new int[scan.nextInt()];
        getGrades();
        scan.close();
        double avg=calculateAverage();
        int highest= determineHighestGrade();
        int lowest= determineLowestGrade();
        System.out.println("The average is:"+String.format("%.2f",avg));//Formatting under the println statement
        System.out.println("The highest grade is: "+highest);
        System.out.println("The lowest grade is: "+lowest);
    }

    public static void getGrades() {
        for(int i=0; i<grades.length;i++){
            System.out.println("Enter your grade #"+ (i+1));
            grades[i]=scan.nextInt();
        }
    }

    private static double calculateAverage() {
        int sum=0;
        for(int grade: grades){
           sum += grade;
        }
        double average= sum/grades.length;
        return average;
    }

    private static int determineHighestGrade() {
        Arrays.sort(grades);
        int highestGrade= grades[(grades.length)-1];
        return highestGrade;
    }
    private static int determineLowestGrade() {
        Arrays.sort(grades);
        int lowestGrade= grades[0];
        return lowestGrade;
    }

//ANOTHER METHOD TO CALCULATE HIGHEST AND LOWEST
//Using Enhanced Loop
//    public static int determineHighestGrade(){
//        int highest = grades[0];
//        for(int grade: grades){
//            if(grade > highest){
//                highest = grade;
//            }
//        }
//        return highest;
//    }
//
//    public static int determineLowestGrade(){
//        int lowest = grades[0];
//        for(int grade: grades){
//            if(grade < lowest){
//                lowest = grade;
//            }
//        }
//        return lowest;
//    }
}


