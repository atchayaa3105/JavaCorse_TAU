package chapter10;

public class Fruit {
    public int calories;
    // The default constructor can be called with super() without defining it.
    public Fruit(int calories){
        this.calories = calories;
    }

    public void makeJuice(){
        System.out.println("The Juice is made!");
    }
}
