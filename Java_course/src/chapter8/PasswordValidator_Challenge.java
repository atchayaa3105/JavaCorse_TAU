package chapter8;
//Challenge7
// Validate the proposed password with the following rules
//1. Atleast 8 characters long.
//2. Contains a Uppercase letter.
//3. Contains a special character.
//4. not contain the username.
//5. not contain the old password.

//// METHOD-1
////When the inputs are defined @ once
//public class PasswordValidator_Challenge {
//    public static void main(String args[]){
//
//       String newPassword="Password@2023";
//        validatePassword(newPassword);
//    }
//
//    private static void validatePassword(String pswd) {
//        int MIN_LENGTH=8;
//        String username="Atchayaa";
//        String password="Password@2022";
//
//        if(pswd.length()<=MIN_LENGTH){
//            System.out.println("The password must be atleast 8 characters long");
//        } else if(pswd==password || pswd==username) {
//            System.out.println("The password cannot be the username or old password");
//        } else if (!isUppercase(pswd)){
//            System.out.println("The password must contain an uppercase character");
//        } else if (isSpecialCharacter(pswd)) {
//            System.out.println("The password must contain a spl character");
//        } else{
//            System.out.println("The password is valid");
//        }
//
//    }
//
//    private static boolean isSpecialCharacter(String pswd) {
//       return pswd.matches("[a-zA-Z0-9 ]*");
//    }
//
//    private static boolean isUppercase(String pswd) {
//        for(int i=0;i<pswd.length();i++){
//            if(Character.isUpperCase(pswd.charAt(i))) return true;
//        }
//        return false;
//    }
//}


//METHOD-2
//When the inputs are given by the user
//Using Constructors
import java.util.Scanner;
import static java.lang.System.exit;
public class PasswordValidator_Challenge {
    private String username;
    private String password;
    //default constructor
    public PasswordValidator_Challenge(){
       this.username="xxxx";
       this.password="****";
    }
    //Constructor with all fields
    public PasswordValidator_Challenge(String username,String password){
        this.username=username;
        this.password=password;
    }
    //getter and setter for the fields defined and it does not matter if they are used
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public  static Scanner scan= new Scanner(System.in);
    //Main class
    public static void main(String args[]){
        System.out.println("**Login**");
        var loginCredentials=login();
        var username= loginCredentials.getUsername();
        var password=loginCredentials.getPassword();
        //Optional validating of the current password.
        if(!isPasswordValid(username,"",password)){
            System.out.println("Wrong password. Login failed!");
            exit(1);
        }else System.out.println("Successfully Logged in!");
        //Validating the new password
        String proposedPassword= getNewPassword();
        scan.close();
        if(isPasswordValid(username,password,proposedPassword)){
            System.out.println("The Proposed password is valid and it is updated as new password!");
        }else System.out.println("Invalid password!");
    }

    private static PasswordValidator_Challenge login() {
        System.out.println("Enter your username:");
        String username=scan.next();
        System.out.println("Enter your password:");
        String password=scan.next();
        return new PasswordValidator_Challenge(username,password);
    }
    private static String getNewPassword() {
        System.out.println("Enter your new password:");
        String newPassword=scan.next();
        return newPassword;
    }

    private static boolean isPasswordValid(String user,String oldPswd, String newPswd) {
        int MIN_LENGTH=8;
        if(newPswd.equals(oldPswd) || newPswd.equals(user)) {
            System.out.println("The password must not be the username or old password");
            return false;
        }
        if(newPswd.length()<MIN_LENGTH){
            System.out.println("The password must be atleast 8 characters long");
            return false;
        }
        if (newPswd.equals(newPswd.toLowerCase())){
            System.out.println("The password must contain an uppercase character");
            return false;
        }
        if (newPswd.matches("[a-zA-Z0-9 ]*")) {
            System.out.println("The password must contain a spl character");
            return false;
        }
       return true;
    }
}
























































