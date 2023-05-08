package chapter3;

import java.util.Scanner;
//Switch statement
// Return a message for each grade in the last exercise.
public class GradeMessage {
    public static void main(String args[]){
        System.out.println("Enter your grade:");
        Scanner scanner= new Scanner(System.in);
        String grade= scanner.next();
        scanner.close();
        String message;

        switch (grade){
            case "O":
             message="Awesome Job";
             break;
            case "A":
                message="Excellent Job";
                break;
            case "B":
                message="Great Job";
                break;
            case "C":
                message="Good Job";
                break;
            case "D":
                message="Fair Job";
                break;
            case "E":
                message="Just Passed";
                break;
            case "F":
                message="Failed";
                break;
            default:
                message= "Invalid grade";
                break;
        }
        System.out.println(message);
    }
}
