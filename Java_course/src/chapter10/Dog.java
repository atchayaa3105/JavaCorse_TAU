package chapter10;
//Polymorphism
public class Dog extends Animal{
    @Override
    public void makeSound() {
        System.out.println("bowww");
    }
    public void fetch(){
        System.out.println("I am a dog and fetch is fun!");
    }
}
