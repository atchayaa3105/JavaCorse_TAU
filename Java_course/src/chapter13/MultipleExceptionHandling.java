package chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

//Polymorphism with exceptions
// Finally clause
public class MultipleExceptionHandling {
    public static void main(String Args[]){
        readDecimalNosFromAFile();
    }

    private static void readDecimalNosFromAFile() {

        File file = new File("resources/exceptions");
        //Scanner readFile= null;
        try(Scanner readFile= new Scanner(file)){
            //readFile = new Scanner(file);
            while(readFile.hasNext()){
                double number= readFile.nextDouble();
                System.out.println(number);
            }
        }catch(FileNotFoundException e){
            System.out.println("File not found.");
            e.printStackTrace();
        }catch(InputMismatchException e){// this exception happens if the no in the file is not double.
            System.out.println("Input is not a decimal number");
            e.printStackTrace();
        }//finally {// this can be used to close the closables, scanner is one of them. This finally can be avoided if the closable is added to the try block.
           // readFile.close();
        //}
        //or the one liner is
        //catch(FileNotFoundException | InputMismatchException e){e.printStackTrace();}
        //catch(Exception e){
          //  e.printStackTrace();
        // }//This should be at the end of all the catch block specified above because Exception is a super class of all other exceptions.

    }
}
