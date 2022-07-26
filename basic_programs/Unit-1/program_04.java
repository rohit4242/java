// Write a java program to get personal information from user and display on screen.
import java.util.*;

public class program_04 {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = obj.nextLine();

        System.out.println("Enter your Birth plcae: ");
        String birthplace = obj.nextLine();

        System.out.println("Enter your age: ");
        int age = obj.nextInt();
        
        
        System.out.println("Enter your name: "+name);
        System.out.println("Enter your birth place: "+birthplace);
        System.out.println("Enter your age: "+age);
        obj.close();
    }
    
}
