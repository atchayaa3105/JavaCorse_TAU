package chapter5;

import java.util.Scanner;
//Methods
//Create a method asking the username and greet them by name.
public class MeetAndGreet {
    public static void main(String args[]){
        Scanner scan= new Scanner(System.in);
        System.out.println("What is your name?");
        String Name= scan.nextLine();
        scan.close();
        greetingUser(Name);
    }
    public static void greetingUser(String name){
        System.out.println("Hello "+name+"! Welcome to chapter 5! Happy coding with Java 😀");
    }
}


//ANOTHER METHOD

//public class MeetAndGreet {
//    public static void main(String args[]){
//      gettingNameAndGreeting();
//    }
//    public static void gettingNameAndGreeting(){
//        Scanner scan= new Scanner(System.in);
//        System.out.println("What is your name?");
//        String Name= scan.nextLine();
//        scan.close();
//        System.out.println("Hello! "+Name+"! Welcome to chapter 5! Happy coding with Java 😀");
//    }
//}