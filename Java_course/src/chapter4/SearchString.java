package chapter4;

import java.util.Scanner;
//For loop break
//Search for the letter 'A' in a specified String.
public class SearchString {
    public static void main(String args[]){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a String:");
        String string= scan.next();

        boolean letterFound= false;
        for(int i=0; i< string.length(); i++){
            char currentLetter= string.charAt(i);
            if(currentLetter=='A' || currentLetter=='a') {
                letterFound=true;
                break;
            }
        }
        if (letterFound) System.out.println("This string contains 'A'");
        else System.out.println("This string does not contain 'A'");
    }
}

//ANOTHER METHOD
//public class SearchString {
//    public static void main(String args[]){
//        Scanner scan= new Scanner(System.in);
//        System.out.println("Enter a String:");
//        String string= scan.next();
//        if(string.contains("A")|| string.contains("a")) System.out.println("Yes! this string contains 'A'");
//        else System.out.println("Sorry! this string does not contain 'A'");
//    }
//}