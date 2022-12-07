// 9. Write a Java program to write a data into a file by using a FileWriter 
// class of IO

import java.io.FileWriter; 

public class program_49 {  

    public static void main(String args[]){    

         try{    

           FileWriter fw=new FileWriter("test.txt");    
           fw.write("Hello I Am Rohit");    
           fw.close();    
          }
          catch(Exception e){System.out.println(e);}    
          System.out.println("Success...");    
          
     }    
}  