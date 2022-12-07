// 4. Write a Java program to store different mapped values (Key-Value) 
// using a TreeMap Class

import java.util.*;  

class program_44{ 

 public static void main(String args[]){  

   TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
      map.put(100,"Amit");    
      map.put(102,"Ravi");    
      map.put(101,"Vijay");    
      map.put(103,"Rahul");    
        
      for(Map.Entry m:map.entrySet()){    
       System.out.println(m.getKey()+" "+m.getValue());    
      }    
 }  
}  