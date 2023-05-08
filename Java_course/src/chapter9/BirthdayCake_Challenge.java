package chapter9;
//Challenge 8
public class BirthdayCake_Challenge extends Cake_Challenge {
    private int candles;

    public BirthdayCake_Challenge(){
        super("Chocolate");
    }

    public int getCandles() {
        return candles;
    }

    public void setCandles(int candles) {
        this.candles = candles;
    }
    @Override
    public void orderCake(){
        System.out.println("Your Birthday cake of flavour "+getFlavour()+" with "+getCandles()+" candles is ordered. You have to pay $"+getPrice());
    }
}
