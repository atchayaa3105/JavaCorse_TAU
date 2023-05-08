package chapter4;
// Nested Loops
//Calculate the average test score for each student in the class. There are 24 students and 4 tests

import java.util.Scanner;

public class AverageTestScores {
    public static void main(String args[]){
        int NumberOfStudents=24;
        int NumberOfTests= 4;

        Scanner scan= new Scanner(System.in);
        for (int i=0;i<NumberOfStudents;i++){
            double testScoreSum=0;
            for(int j=0;j<NumberOfTests; j++){
                System.out.println("Enter the score of test #"+(j+1));
                double testScore= scan.nextDouble();
                testScoreSum+= testScore;
            }
        double average= testScoreSum/NumberOfTests;
        System.out.println("The average of student "+(i+1)+" is: "+average);
        }
        scan.close();
    }
}
