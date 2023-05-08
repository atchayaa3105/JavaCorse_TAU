package chapter10;
//Challenge9
public class Orange extends Fruit{
    public Orange(){
        super(20);
    }
    public void removeSeedsAndPeel(){
        System.out.println("The Outer layer is peeled and removed seeds.");
    }
    @Override
    public void makeJuice(){
        System.out.println("Orange Juice is made!");
    }
}
