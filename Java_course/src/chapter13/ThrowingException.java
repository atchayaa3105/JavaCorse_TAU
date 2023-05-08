package chapter13;

//Throwing Exceptions
//Example code:ref:chapter4.EmployeeWeeklyPay

public class ThrowingException {
    public static void main(String args[]){
        int rate= 15;
        int totalHours= 50;
        //calculateSalary(totalHours,rate);
        try{
            calculateSalaryWithCustomException(totalHours,rate);
        }catch(Exception e){
           e.printStackTrace();
        }
    }

    // No overtime Allowed
    //Method1: Throw existing java Exception and give appropriate error msg.
    private static void calculateSalary(double hours, double rate) {

        int MaxHours= 40;
        if( hours> MaxHours){
            throw new IllegalArgumentException("No overtime allowed");
        }
        double salary= hours * rate;
        System.out.println("The Total pay for the week is: $"+ salary);
    }

    //Method2:create your own exception called "NoOverTimeAllowedException" and throw it.
    //doubt
    private static void calculateSalaryWithCustomException(double hours, double rate) throws NoOverTimeAllowedException {

        int MaxHours= 40;
        if( hours> MaxHours) throw new NoOverTimeAllowedException("No overtime allowed!!!");
        double salary= hours * rate;
        System.out.println("The Total pay for the week is: $"+ salary);
    }
}
