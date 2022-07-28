// 6. Write a Java program to enter two nos. and find maximum out of it.

import java.util.Scanner;

class program_06{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num1,num2,max;

        System.out.println("Enter First Number: ");
        num1 = input.nextInt();
        System.out.println("Enter Second Number: ");
        num2 = input.nextInt();

        if(num1>num2)
        {
            max = num1;
            System.out.println("First number is maximum");
        }
        else
        {
            max = num2;
            System.out.println("Second number is maximum");
        }

        System.out.println("your maximum number is: "+max);
        input.close();
    }
}