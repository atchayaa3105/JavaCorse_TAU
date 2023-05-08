package chapter13;
//Challenge 12
// write the statement int c=30/0; and execute program with exception.
//Print a line "Division is fun!" at the end no matter what
public class DividingByZero_Challenge {
    public static void main(String args[]){
        try{
            int c=30/0;
        }catch(ArithmeticException e){
            System.out.println("Dividing by 0 is not permitted.");
            e.printStackTrace();
        }finally {
            System.out.println("Division is fun!");
        }
    }
}
//solution
//java.lang.ArithmeticException: / by zero
//	at chapter13.DividingByZero_Challenge.main(DividingByZero_Challenge.java:8)
//Dividing by 0 is not permitted.
//Division is fun!


