// 2. Write a Java program to implement Arithmetic Exception

public class program_32
{
    public static void main(String args[]) 
    {
        try 
        {
             int data = 100/0;
        } 
        catch (ArithmeticException e) 
        {
            System.out.println(e);
        }
        
        System.out.println("re-write your code");
    }
}