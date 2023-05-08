package chapter9;
//Challenge 8
public class WeddingCake_Challenge extends Cake_Challenge{
    private int tiers;

    public WeddingCake_Challenge(){
        super("Caramel");
    }

    public int getTiers() {
        return tiers;
    }

    public void setTiers(int tiers) {
        this.tiers = tiers;
    }

    @Override
    public void orderCake(){
        System.out.println("Your Wedding cake of flavour "+getFlavour()+" of "+getTiers()+" tiers is ordered. You have to pay $"+getPrice());
    }
}
