package FinalProject;
//Project Challenge
//Create a class called Player which has the following:
//* Fields called name and guess
//* Encapsulation
//* A constructor with name

public class Player {
    private String name;
    private String guess;

    public Player(String name, String guess){
        this.name= name;
        this.guess= guess;
    }

    public Player(String name){
        this.name= name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getGuess() {
        return guess;
    }

    public void setGuess(String guess) {
        this.guess = guess;
    }


}
