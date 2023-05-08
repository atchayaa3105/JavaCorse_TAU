package chapter13;

import java.io.File;
import java.io.IOException;

// If a mtd throws an exception and it fails to catch it under a catch clause then we rethrow it using the throws key word in another mtd.
public class RethrowExceptions {
    public static void main(String Args[]){
        createNewFile();
        try{
            createNewFileRethrow();
        }catch (Exception e){
            System.out.println("Something is wrong.");
        }

    }

    private static void createNewFile() {
        File file = new File("resources/exceptions");
        try{
            file.createNewFile();
        }catch(IOException e){
            System.out.println("The Directory does not exist!");
            e.printStackTrace();
        }
    }
    private static void createNewFileRethrow() throws IOException{
        File file = new File("resources/exceptions");
        file.createNewFile();
    }
}
