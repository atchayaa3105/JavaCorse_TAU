package chapter10;
//Challenge9
public class Apple extends Fruit{
    public Apple(){
     super(15);
    }
    public void removeSeeds(){
        System.out.println("The seeds are removed.");
    }
    @Override
    public void makeJuice(){
        System.out.println("Apple juice is made!");
    }
}
