// 1. Write a Java program to implement simple exception 

public class program_31
{
    public static void main(String args[]) 
    {
        try 
        {
             int data = 100/0;
        } 
        catch (Exception e) 
        {
            System.out.println(e);
        }
        
        System.out.println("re-write your code");
    }
}