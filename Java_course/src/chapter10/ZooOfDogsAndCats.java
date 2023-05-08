package chapter10;
//Polymorphism
public class ZooOfDogsAndCats {
    public static void main(String args[]){
        Dog rocky= new Dog();
        rocky.fetch();
        rocky.makeSound();
        feed(rocky);
        //I am a dog and fetch is fun!
        //bowww
        Cat Dory= new Cat();
        Dory.scratch();
        Dory.makeSound();
        feed(Dory);
        //I am a cat and love scratching
        //Meeeaooow

        //So far it was inheritance, and now we check for how polymorphism works
        Animal sasha= new Dog();// Here shaha is of type Animal but it is an instance of Dog
        sasha.makeSound();
        feed(sasha);
        //sasha.fetch(); is not possible because method fetch() belongs to type Dog and sasha is of type Animal.
        //bowww

        //power of changing the type
        sasha =new Cat();// Since sasha is of type animal, it is possible to change the instance to Cat because class
                         // Cat also inherits Animal class.
        sasha.makeSound();
        //Meeeaooow
        //Similarly, sasha.scratch() is not possible because method scratch() belongs to type Cat and sasha is of type Animal.



        //Casting a type into another
        //Here we cast the object sasha as type Cat from type Animal.
        ((Cat) sasha).scratch();
        feed(sasha);

        }



    //"instanceof" operator
    public static void feed(Animal animal){
        if(animal instanceof Dog) System.out.println("Hey! Here is your Dog food");
        else if(animal instanceof Cat) System.out.println("Hey! Here is your Cat food");
        // I am a dog and fetch is fun!
        //bowww
        //Hey! Here is your Dog food
        //I am a cat and love scratching
        //Meeeaooow
        //Hey! Here is your Cat food
        //bowww
        //Hey! Here is your Dog food
        //Meeeaooow
        //I am a cat and love scratching
        //Hey! Here is your Cat food
    }
}
