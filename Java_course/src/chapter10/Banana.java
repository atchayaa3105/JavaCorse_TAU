package chapter10;
//Challenge9
public class Banana extends Fruit{

    public Banana(){
        super(25);
    }
    public void peelOuterLayer(){
        System.out.println("The outer layer is peeled.");
    }
    @Override
    public void makeJuice(){
        System.out.println("Banana juice is made!");
    }
}
