package chapter8;
//Datatypes:Strings
//Create a Program that reverses the word given and print it.
import java.util.Scanner;

public class ReversingWords {
    public static void main(String args[]){
        System.out.println("Enter a word:");
        Scanner scan= new Scanner(System.in);
        String word=scan.nextLine();
        reversingTheWord(word);
    }

    private static void reversingTheWord(String word) {
        String reverse="";
        for(int i=0;i< word.length();i++){
            var wordIndex= word.charAt(i);
             reverse= wordIndex+ reverse;
        }
        System.out.println(reverse);
//        Alternative Method
//        for(int i=word.length()-1;i>=0;i--){
//            System.out.print(word.charAt(i));
//        }
    }
}
