package chapter9;
//Challenge 8
//1. Create a super class Cake with fields flavour and price. Add getter and setters required.
//2. Create a subclass BirthdayCake inherits from cake with field candles. Add getter and setters required.
//3. Create a another subclass WeddingCake inherits from cake with field tiers. Add getter and setters required.
//4. Create a TasteTester class to test your inheritance.
public class Cake_Challenge {
private String flavour;
private double price;
    public Cake_Challenge(String flavour){
        this.flavour=flavour;
    }
    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void orderCake(){
        System.out.println("Your cup cake of flavour "+getFlavour()+" is ordered. You have to pay $"+getPrice());
    }
}
