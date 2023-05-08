package chapter12;

import java.util.*;

// Loops:Collection and Maps
public class LoopThroughCollections {

    public static void main(String[] args){
        setDemo();
        System.out.println("------");
        listDemo();
        System.out.println("------");
        queueDemo();
        System.out.println("------");
        mapDemo();
    }

    public static void setDemo(){
        Set fruit = new HashSet();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");
        print(fruit);
    }

    public static void listDemo(){
        List fruit = new ArrayList();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");
        print(fruit);
    }

    public static void queueDemo(){
        Queue fruit = new LinkedList();
        fruit.add("apple");
        fruit.add("lemon");
        fruit.add("banana");
        fruit.add("orange");
        fruit.add("lemon");
        print(fruit);
    }

    public static void mapDemo(){
        Map fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 105);
        fruitCalories.put("orange", 45);
        fruitCalories.put("lemon", 17);
        print(fruitCalories);
    }

    public static void print(Collection<String> collection){
        //Using while loop
//        var i = collection.iterator();
//        while(i.hasNext()){
//            System.out.println(i.next());
//        }
        //Using for loop
//        for(String item : collection){
//            System.out.println(item);
//        }
        //Using for each
        collection.forEach(x-> System.out.println(x));
        //collection.forEach(System.out::println); //similar to the one liner above
    }

    public static void print(Map<String, Integer> map){
        //Print values of a Map
//        for(var entry : map.entrySet()){
//            System.out.println(entry.getValue());
//        }
        //print both key and values
        map.forEach(
                (k,v)->System.out.println("Fruit: " + k + ", Calories: " + v));
    }
}
