// Write a java program to enter marks of 3 subjects and find total, percentage, results and class.
import java.util.Scanner;

public class program_05 {
    public static void main(String[] args)
    {
        Scanner obj = new Scanner(System.in);

        int[] sub = new int[3];
        int total=0;

        for(int i=0;i<3;i++)
        {
            System.out.printf("Enter Subject marks %d",i);
            sub[i] = obj.nextInt();
            total += sub[i];
        }

        int per = (total/100);
        
    
    }
}
