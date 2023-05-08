package chapter10;
//Challenge9
// 1. Create a class Fruit with field calories and method makeJuice and print a message.
// 2. Create two subclasses Apple and Banana with methods removeSeeds and peel resp.
// 3. Set calories within constructors of the subclasses.
// 4. Create Overrides of the makeJuice method in the subclasses and print the resp fruit juice.
public class MarketOfAppleBananaAndOrange_Challenge {
    public static void main(String args[]){
        System.out.println("");
        Apple apple= new Apple();
        apple.removeSeeds();
        squeeze(apple);
        //The seeds are removed.
        //Apple juice is made!
        caloriesDetector(apple);

        System.out.println("");
        Banana banana= new Banana();
        banana.peelOuterLayer();
        squeeze(banana);
        //The outer layer is peeled.
        //Banana smoothie is made!
        caloriesDetector(banana);

        //power of polymorphism
        System.out.println("");
        Fruit appy=new Apple();
        ((Apple) appy).removeSeeds();  //Casting type Fruit as Apple
        squeeze(appy);
        caloriesDetector(appy);

        System.out.println("");
        Fruit banan= new Banana();
        ((Banana)banan).peelOuterLayer(); //Casting type Fruit as Banana
        squeeze(banan);
        caloriesDetector(banan);

        System.out.println("");
        Fruit orange= new Orange();
        ((Orange)orange).removeSeedsAndPeel();
        squeeze(orange);
        caloriesDetector(orange);
    }
    public static void squeeze(Fruit fruit){
        System.out.println("Squeezing..");
        fruit.makeJuice();
    }


    public static void caloriesDetector(Fruit fruit){
        if(fruit instanceof Apple) System.out.println("Your Apple juice has got "+ fruit.calories+" calories!");
        else if (fruit instanceof Banana) System.out.println("Your Banana juice has got "+ fruit.calories+" calories!");
        else if(fruit instanceof Orange) System.out.println("Your Orange juice has got "+ fruit.calories+" calories!");
    }
}
