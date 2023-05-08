package chapter11;
//Challenge10
// 1. Create a abstract class Animal and declare a abstract method makeSound() and a non abstract method eat to print a msg.
// 2. Create two classes duck and pig and extend them to Animal class
// 3. Create a Farm class to test the implementation.
public class FarmOfPigsAndDucks_Challenge {
    public static void main(String args[]){
        Animal porkie = new Pig();
        porkie.eat();
        System.out.println(porkie.makeSound());
        //I am eating
        //blurrr

        Animal donald = new Duck();
        donald.eat();
        System.out.println(donald.makeSound());
        //I am eating
        //quack
    }
}
