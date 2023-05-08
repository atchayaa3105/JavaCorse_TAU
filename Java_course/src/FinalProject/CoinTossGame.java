package FinalProject;

import java.util.Scanner;

//Project Challenge
//Create a coinTossGame class that has the following:
//-> Create two players
//-> Ask one player to choose Head or Tail
//-> Ensure player 1 guess is valid
//-> Automatically assign player 2 with the opposite of choosen option
//-> Flip the coin
//-> Determine Winner on the coin landed on
//-> Use methods appropriately

//public class CoinTossGame {
//    public static void main(String args[]){
//        Scanner scan=new Scanner(System.in);
////        System.out.println("Enter the name of first player:");
////        String player1= scan.next();
////        System.out.println("Enter the name of second player:");
////        String player2= scan.next();
//        Player player1= new Player("AB");
//        var player1Name= player1.getName();
//        System.out.println("First Player:"+player1Name);
//        Player player2= new Player("BA");
//        var player2Name= player2.getName();
//        System.out.println("Second Player:"+player2Name);
//        System.out.println("Which side of coin does "+player1Name+" choose?");
//        String choosenSide=scan.next();
//        if(!validateSideChoice(choosenSide)){
//            System.out.println("Enter a valid side:");
//            for(int i=0; i<10;i++){
//                choosenSide=scan.next();
//                if(validateSideChoice(choosenSide)) break;
//            }
//        }
//        scan.close();
//        System.out.println("The side choosen by "+player1Name+" is: "+choosenSide);
//        automatePlayer2side(player2Name, choosenSide);
//        Coin coin= new Coin();
//        var flipValue= coin.flipCoin();
//        determineWinner(flipValue);
//    }
//
//
//    private static boolean validateSideChoice( String side) {
//        if(side.equals("Head") || side.equals("Tail") || side.equals("head") || side.equals("tail") || side.equals("HEAD") || side.equals("TAIL")){
//            System.out.println("Valid choice of side");
//            return true;
//        } else {
//            System.out.println("Invalid choice of side");
//            return false;
//        }
//    }
//
//    private static void automatePlayer2side(String player, String side) {
//        String oppSide;
//        if(side.equals("head")|| side.equals("HEAD")||side.equals("Head")){
//           oppSide= "Tail";
//        }else{
//           oppSide= "Head";
//        }
//        System.out.println("The side assigned to "+player+" is: "+ oppSide);
//    }
//
//    private static void determineWinner(int value) {
//      if(value==1) System.out.println("Side Head wins!");
//      else if(value==0) System.out.println("Side Tail wins!!");
//    }
//}
//**Solution**
//First Player:AB
//Second Player:BA
//Which side of coin does Adi choose?
//TAIL
//Valid choice of side
//The side choosen by Adi is: TAIL
//The side assigned to Atchu is: Head
//Head
//Side Head wins!


//**ANOTHER METHOD**

public class CoinTossGame {
    public static Scanner scan=new Scanner(System.in);
    private static final int MAX_TRY = 20;
    public static void main(String args[]){
        //Player1
        Player player1= new Player(getPlayerName(), getSideGuess());
        var player1Name=player1.getName();
        var player1Side= player1.getGuess();
        //validating the player1 side
        if(!validateSideChoice(player1Side)){
            System.out.println("Enter a valid side:");
            for(int i=0; i<MAX_TRY;i++){
                player1Side=scan.next();
                if(validateSideChoice(player1Side)) break;
            }
        }
        System.out.println("The side choosen by "+player1Name+" is: "+player1Side);
        //Player2
        Player player2= new Player(getPlayerName());
        var player2Name= player2.getName();
        //automating player2 side
        var player2Side= automatePlayer2Side(player1Side,player2);
        System.out.println("The side assigned to "+player2Name+" is: "+ player2Side);
        Coin coin= new Coin(player2Side);
        //Coin flip happens
        System.out.println("Now we flip the coin...3...2...1");
        var flipValue= coin.flipCoin();
        //Announce the winner
        determineWinner(flipValue,player1,player2);
        scan.close();
    }

    private static String getPlayerName(){
        System.out.println("Enter the player name:");
        String playerName= scan.next();
        return playerName;
    }
    private static String getSideGuess(){
        System.out.println("Enter the player guess:");
        String playerSide= scan.next();
        return playerSide;
    }
    private static boolean validateSideChoice( String side) {
        if(side.equalsIgnoreCase("Head") || side.equalsIgnoreCase("Tail") ){
            System.out.println("Valid choice of side");
            return true;
        } else {
            System.out.println("Invalid choice of side");
            return false;
        }
    }

    private static String automatePlayer2Side(String player1Side,Player player2) {
        String oppSide;
        if(player1Side.equalsIgnoreCase("Head")){
            oppSide= "Tail";
        }else{
            oppSide= "Head";
        }
        player2.setGuess(oppSide);
        return oppSide;
    }

    private static void determineWinner(int value, Player playerOne, Player playerTwo) {
        if ((value == 1 && playerOne.getGuess().equalsIgnoreCase("head")) || (value == 0 && playerOne.getGuess().equalsIgnoreCase("tail"))) {
            System.out.println(playerOne.getName() + " Wins!");
        } else if ((value == 1 && playerTwo.getGuess().equalsIgnoreCase("head")) || (value == 0 && playerTwo.getGuess().equalsIgnoreCase("tail"))) {
            System.out.println(playerTwo.getName() + " Wins!");
        }
    }
}
//**Solution**
//Enter the player name:
//AB
//Enter the player guess:
//TAIL
//Valid choice of side
//The side choosen by AB is: TAIL
//Enter the player name:
//BA
//The side assigned to BA is: Head
//Now we flip the coin...3...2...1
//FlipOutcome: Tail
//AB Wins!
