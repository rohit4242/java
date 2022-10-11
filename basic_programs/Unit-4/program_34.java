// 4. Write a Java program to use Throw Keyword 
public class program_34{   
    public static void validate(int age) {  
        if(age<18) {  
            throw new ArithmeticException("Person is not eligible to vote");    
        }  
        else {  
            System.out.println("Person is eligible to vote!!");  
        }  
    }  
    public static void main(String args[]){  
        validate(19);  
        System.out.println("re-write your code");    
  }    
}    