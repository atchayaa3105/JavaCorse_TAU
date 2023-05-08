package chapter7;

import java.util.Arrays;
import java.util.Random;

//Arrays
// Create a quick lottery pick that will generate a lottery ticket with 6 random numbers between 1 and 69.
//  Avoid duplicate numbers in the ticket(Array search-> sequential and Binary)
public class LotteryPick {
    private static final int LENGTH= 6;
    private static final int MAX_TICKET_NUMBER= 69;
    public static void main(String args[]){
        int[] ticket= ticketGenerator();
        Arrays.sort(ticket);
        printTicket(ticket);
    }
    public static int[] ticketGenerator(){
        int[] ticketNumbers= new int[LENGTH];
        Random random= new Random();
        for(int i=0;i< LENGTH;i++){
            int randomNumber;
            // Here we check for duplicates in the array
            do {
                randomNumber=random.nextInt(MAX_TICKET_NUMBER)+1;
            }while(search(ticketNumbers,randomNumber));
            //We make sure the number is unique in the array
            ticketNumbers[i]= randomNumber;
        }
        return ticketNumbers;
    }

    /**
     * Sequential Search
     * @param array The array to search through.
     * @param numberToSearch The value to search for.
     * @return true if found else false.
     */
    private static boolean search(int[] array, int numberToSearch) {
    //This is called an enhanced loop.It iterates through 'array' and each time assigns the current element to 'value'

        for(int value : array){
            if(value == numberToSearch){
                return true;
            }
        }
        //If we've reached this point, then the entire array was searched and the value was not found.
        return false;
    }

//    public static boolean binarySearch(int[] array, int numberToSearchFor){
//
//        //Array must be sorted first
//        Arrays.sort(array);
//
//        int index = Arrays.binarySearch(array, numberToSearchFor);
//        if(index >= 0){
//            return true;
//        }
//        else return false;
//    }

    public static void printTicket(int[] ticket){

        System.out.println("The lottery ticket is:");
        for(int i=0;i< LENGTH;i++){
            System.out.print(ticket[i]+" | ");
        }

    }
}
