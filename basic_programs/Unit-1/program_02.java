// Write a java program to enter two numbers and perform all 5 arithmetic
// operation
import java.util.Scanner;

class program_02{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter First Number: ");
        int num1 = input.nextInt();
        System.out.println("Enter Second Number: ");
        int num2 = input.nextInt();
        
        System.out.println("Sum of Two Number is: "+(num1+num2));
        System.out.println("Sub of Two Number is: "+(num1-num2));
        System.out.println("mul of Two Number is: "+(num1*num2));
        System.out.println("div of Two Number is: "+(num1/num2));

        input.close();
    }
}