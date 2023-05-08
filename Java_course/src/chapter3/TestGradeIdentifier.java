package chapter3;

import java.util.Scanner;

//If Else-If statement
// Display a letter grade for a student based on their test score.
public class TestGradeIdentifier {
    public static void main(String args[]){
        char grade;
        System.out.println("What is your overall score out of 100?");
        Scanner scanner= new Scanner(System.in);
        double score= scanner.nextDouble();
        scanner.close();
        if(score>= 90) {
            grade= 'O';
            System.out.println("Outstanding! Your grade is "+ grade);
        }else if(score>= 80){
            grade= 'A';
            System.out.println("Bravo! Your grade is "+ grade);
        } else if (score>=70) {
            grade= 'B';
            System.out.println("Hurray! Your grade is "+ grade);
        }else if (score>=60) {
            grade= 'C';
            System.out.println("Congratulations! Your grade is "+ grade);
        }else if (score>=50) {
            grade= 'D';
            System.out.println("Good! Your grade is "+ grade);
        } else if (score>=40) {
            grade= 'E';
            System.out.println("Nice! Your grade is "+ grade);
        }else{
            grade='F';
            System.out.println("Sorry! Your grade is "+ grade);
        }
    }
}
