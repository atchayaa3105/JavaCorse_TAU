package chapter4;

import java.util.Random;
//Challenge3
//🎲The objective of the game is to travel the entire game board of 20 spaces in 5 die rolls.
// 1. Roll the die, generate a random number bet 1 and 6.
// 2. After each roll, tell the player at which position are they and how much spaces should be travelled to win.
// 3. Repeat this 4 additional times, so that it count to 5 die rolls.
// 4. If the player gets 20 spaces before 5 rolls, they win!
// 5. If the player is over 20 spaces or less than 20 spaces, they lose!
// Hint:There are only 20 spaces in the board, so you cant go beyond 20.
//Ref:https://java2blog.com/java-random-number-1-10/

public class RollTheDieGame_Challenge {
    public static void main(String args[]){
        int TotalNoOfSpaces= 20;
        int TotalDieRolls=5;
        int currentStep=0;
        for (int i=1;i<=TotalDieRolls;i++){
            Random randomDieNumber= new Random();
            int dieRoll= randomDieNumber.nextInt(6)+1;
            currentStep+=dieRoll;
            System.out.println("Die roll is a "+dieRoll+"!");
            if(currentStep==TotalNoOfSpaces)
            {
                System.out.println("You have advanced to space "+currentStep +". Congrats! You have won the Game.");
                break;
            } else if(currentStep > TotalNoOfSpaces){
                System.out.println("Oops! The Game cant be exceeded for more than "+TotalNoOfSpaces+" spaces! You have lost.");
                break;
            } else if (currentStep < TotalNoOfSpaces && i==TotalDieRolls){

                System.out.println("Sorry! You are advanced to space "+currentStep+" but have not reached "+TotalNoOfSpaces+" spaces! You have lost.");
                break;
            }else{
                int balanceSteps= TotalNoOfSpaces-currentStep;
                System.out.println("You are advanced to "+currentStep+" and have "+balanceSteps+" more to go!");
            }
        }
    }
}