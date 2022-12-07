// 7. Write a Java program to write a simple message into a file using a 
// FileOutputStream 

import java.io.FileOutputStream;  

public class program_47 {  

    public static void main(String args[]){    
           try{    
             FileOutputStream fout=new FileOutputStream("D:\\testout.txt");    
             String s="Hello I Am Rohit";    
             byte a[]=s.getBytes();//converting string into byte array    
             fout.write(a);   
             fout.close();    
             System.out.println("success...");    
            }catch(Exception e){System.out.println(e);}    
      }    
}  