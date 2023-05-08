package chapter9;
//Challenge 8
public class TasteTester_Challenge {
    public static void main(String args[]){
        Cake_Challenge cupCake= new Cake_Challenge("Vanilla");
        cupCake.setPrice(10);
        cupCake.orderCake();
        BirthdayCake_Challenge birthdayCake= new BirthdayCake_Challenge();
        birthdayCake.getFlavour();;
        birthdayCake.setCandles(5);
        birthdayCake.setPrice(100);
        birthdayCake.orderCake();
        WeddingCake_Challenge weddingCake= new WeddingCake_Challenge();
        weddingCake.getFlavour();
        weddingCake.setTiers(3);
        weddingCake.setPrice(500);
        weddingCake.orderCake();
    }
}
