// 10. Write a Java program to read a data from a file by using a FileReader 
// class

import java.io.FileReader;  

public class program_50 {  

    public static void main(String args[])throws Exception{    

        FileReader fr=new FileReader("test.txt");    
        int i;    
        while((i=fr.read())!=-1)    
        System.out.print((char)i);    
        fr.close();    
    }    
}    