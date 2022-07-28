// 7. Write a Java Program to enter three nos. and find maximum out of it.

import java.util.Scanner;

class program_07{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num1,num2,num3,max=0;

        System.out.println("Enter First Number: ");
        num1 = input.nextInt();
        System.out.println("Enter Second Number: ");
        num2 = input.nextInt();
        System.out.println("Enter Third Number: ");
        num3 = input.nextInt();

        if(num1>num2 && num1>num3)
        {
            max = num1;
            System.out.println("First number is maximum");
        }
        else if(num2>num3)
        {
            max = num2;
            System.out.println("Second number is maximum");
        }
        else
        {
            max = num3;
            System.out.println("Third number is maximum");
        }

        System.out.println("Max is: "+max);
        input.close();
    }
}