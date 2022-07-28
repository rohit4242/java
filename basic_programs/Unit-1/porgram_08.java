// 8. Write a Java Program to enter 10 Nos. and find sum and average of it.

import java.util.Scanner;

class program_08{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int sub[] = new int[10];
        int sum=0;
    
        for(int i=0;i<10;i++)
        {
            System.out.println("Enter number "+i+":");
            sub[i] = input.nextInt();
            sum +=sub[i];
        }

        int avg = sum/10;
        System.out.println("Your sum of the value is: "+sum);
        System.out.println("Your average value is: "+avg);
        input.close();
    }
}