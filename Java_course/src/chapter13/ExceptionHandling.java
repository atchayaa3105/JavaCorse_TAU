package chapter13;

import java.io.File;
import java.io.IOException;

//Exceptions
//Try and Catch Exception clause
public class ExceptionHandling {
    public static void main(String Args[]){
        createNewFile();
    }

    private static void createNewFile() {
        File file = new File("resources/exceptions");
        //file.createNewFile();//Unhandled exception, so must cover in try catch block
        try{
            file.createNewFile();
        }catch(IOException e){
            System.out.println("The Directory does not exist!");
            e.printStackTrace();//Stacktrace is just the practical steps in reaching the error.
        }
    }
}
