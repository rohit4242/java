// 2. Write a Java program to demonstrate use of Link List. 

import java.util.LinkedList;

class program_42 {
  public static void main(String[] args){

    // create linkedlist
    LinkedList<String> animals = new LinkedList<>();

    // Add elements to LinkedList
    animals.add("Dog");
    animals.add("Cat");
    animals.add("Cow");
    System.out.println("LinkedList: " + animals);
  }
}