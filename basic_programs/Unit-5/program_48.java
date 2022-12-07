// 8. Write a Java program to read a message (data) from a file by using 
// FileInputStream.

import java.io.FileInputStream;  

public class program_48 {  

     public static void main(String args[]){  

          try{    

            FileInputStream fin=new FileInputStream("test.txt");    
            int i=fin.read();  
            System.out.print((char)i);    
  
            fin.close();    
          }catch(Exception e){System.out.println(e);}    
         }    
        }  