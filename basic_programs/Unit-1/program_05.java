// Write a java program to enter marks of 3 subjects and find total, percentage, results and class.
import java.util.Scanner;

public class program_05 {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        int[] sub = new int[3];
        float total=0;

        for(int i=0;i<3;i++)
        {
            System.out.printf("Enter Subject marks %d: ",i);
            sub[i] = obj.nextInt();
            total += sub[i];
        }

        float per = (float)(total/3.0);

        System.out.println(total);
        
        System.out.println("A Total Of 3 Subject is :"+total);
        
        System.out.println("A Percentage is :"+per);
        
        if(total<100)
        {
            System.out.println("Student is Fail");
        }
        
        else
        {
            System.out.printf("\nStudent is pass with %d Percentage",per);
            
        }
        
        if(total<100)
        {
            System.out.println("\nStudent Get C Class");
        }
        
        else if(total<=150)
        {
            System.out.println("\nStudent Get B Class");
        }
        
        else
        {
            System.out.println("\nGet A Class");
        }
        obj.close();
    }
}
