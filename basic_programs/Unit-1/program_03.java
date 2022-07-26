// Write java program to enter priciple amount, rate of interest and numbers of years and find simple intrest.
import java.util.Scanner;

public class program_03 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter price: ");
        float price = input.nextInt();
        System.out.println("Enter rate: ");
        float rate = input.nextInt();
        System.out.println("Enter numbers of years: ");
        int years = input.nextInt();
        
        float intrest = (float)(price*rate*years)/100;

        System.out.println("Your simple intrest is: "+intrest);   
        input.close();
    }
}
