// 3. Write a Java program to add Book IDs and Book Names (Pairs) using a 
// HashSet.

import java.util.*;  

public class program_43{  

 public static void main(String args[]){  

   HashMap<Integer,String> map=new HashMap<Integer,String>();//Creating HashMap    
  
   map.put(1,"Book 1");    
   map.put(2,"Book 2");   
   map.put(3,"Book 3");   
    
   for(Map.Entry m : map.entrySet()){    
    System.out.println(m.getKey()+" "+m.getValue());    
   }  
}  
}  
