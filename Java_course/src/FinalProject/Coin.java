package FinalProject;

import java.util.Random;

//Project Challenge
// Create a  Coin class which has the following:
//* A field called Side
//* Encapsulation
//* Constant variables for head and Tail
//* A method called flip,which randomly chooses head or tail and assigns value to side.
public class Coin {
    private String side;
    public Coin(){
        this.side="";
    }
    public Coin(String side){
    this.side=side;
    }
    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public int flipCoin(){
        Random randomFlip= new Random();
        Boolean flip=randomFlip.nextBoolean();
        if(flip.equals(true)){
            System.out.println("FlipOutcome: Head");
            return 1;
        }else{
            System.out.println("FlipOutcome: Tail");
            return 0;
        }
    }

}
