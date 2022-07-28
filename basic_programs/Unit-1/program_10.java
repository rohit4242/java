// 10. Write a java program to enter a number and find out sum of digits.
import java.util.Scanner;

class program_10{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num = input.nextInt();
        int sum=0;
        while(num > 0)
        {
            int temp = num%10;
            sum = sum+temp;
            num = num/10;
        }

        System.out.print("Sum of all number is: "+sum);
        input.close();
    }
}
