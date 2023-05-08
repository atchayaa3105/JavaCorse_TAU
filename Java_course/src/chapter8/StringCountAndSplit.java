package chapter8;

//Datatypes:Strings
//Create a program that counts the number of words in a String and prints them each on a new line.
import java.util.Scanner;
public class StringCountAndSplit {
    public static void main(String args[]){
        System.out.println("Enter a string:");
        Scanner scan= new Scanner(System.in);
        String str=scan.nextLine();
        countWordsAndPrint(str);
    }

    private static void countWordsAndPrint(String str) {
        var Words= str.split(" ");
        int noOfWords= Words.length;
        System.out.printf("The String has %d words :%n",noOfWords);
        for(int i=0;i< Words.length; i++){
            System.out.println(Words[i]);
        }
    }

}
