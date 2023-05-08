package chapter12;

import java.util.*;

// Collection Framework with its common interfaces set, List, Queue,Map.
// Ref: https://docs.oracle.com/javase/tutorial/collections/interfaces/index.html
// set: https://docs.oracle.com/javase/8/docs/api/java/util/Set.html
// list: https://docs.oracle.com/javase/8/docs/api/java/util/List.html
// Queue:https://docs.oracle.com/javase/tutorial/collections/interfaces/queue.html
// Map: https://docs.oracle.com/javase/9/docs/api/java/util/Map.html
public class CommonCollections {

  public static void main(String args[]) {
  //Set
      Set fruitSet = new HashSet();//LinkedHashSet(), TreeSet()
     fruitSet.add("Apple");
     fruitSet.add("lemon");
     fruitSet.add("melon");

     fruitSet.add("orange");
     fruitSet.add("Apple");
     fruitSet.add("banana");

      System.out.println(fruitSet.size());
      System.out.println(fruitSet);
      //5
      //[orange, banana, Apple, lemon, melon] // It does not count the duplicates. They are unordered and has no control of order in printing the set.

   //List
      List fruitList= new ArrayList(); //LinkedList(), Stack(), Vector()
      fruitList.add("Apple");
      fruitList.add("lemon");
      fruitList.add("melon");
      fruitList.add("orange");
      fruitList.add("Apple");
      fruitList.add("banana");
      System.out.println(fruitList.size());
      System.out.println(fruitList.get(2));
      System.out.println(fruitList);
      //6
      //melon
      //[Apple, lemon, melon, orange, Apple, banana]//It can have duplicates since list is not unique.

  //Queue
      Queue fruitQueue =new LinkedList(); //PriorityQueue()
      fruitQueue.add("Apple");
      fruitQueue.add("lemon");
      fruitQueue.add("melon");
      fruitQueue.add("orange");
      fruitQueue.add("Apple");
      fruitQueue.add("banana");

      System.out.println(fruitQueue.size());
      System.out.println(fruitQueue);
      fruitQueue.remove();
      System.out.println(fruitQueue);
      System.out.println(fruitQueue.peek());
      //6
      //[Apple, lemon, melon, orange, Apple, banana]
      //[lemon, melon, orange, Apple, banana] // always cuts the head first since it is ordered
      //lemon //returns the head of the queue

   //Map
      Map fruitCalories= new HashMap();//LinkedHashMap(), TreeMap()
      fruitCalories.put("Apple", 95);// Keys are unique but not the value.
      fruitCalories.put("lemon", 20);// put method always take two things, key and value
      fruitCalories.put("melon", 105);
      fruitCalories.put("orange", 45);
      fruitCalories.put("Apple", 35);
      fruitCalories.put("banana", 40);
      fruitCalories.put("Apple", 15);
      System.out.println(fruitCalories.size());
      System.out.println(fruitCalories);
      System.out.println(fruitCalories.get("Apple"));
      System.out.println(fruitCalories.entrySet());
      System.out.println(fruitCalories.remove("orange"));// All operations to an element is done with its key
      System.out.println(fruitCalories);
      //5
      //{orange=45, banana=40, Apple=15, lemon=20, melon=105}   //Unordered and no duplicates
      //15                                                      // Map updates the key with its duplicate values
      //[orange=45, banana=40, Apple=15, lemon=20, melon=105]   // helps to get a set object 
      //45
      //{banana=40, Apple=15, lemon=20, melon=105}
  }
}
