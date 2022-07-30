// 1. Write a Java program to perform simple inheritance.

class demo{
    void display(){
        System.out.println("Hello World");
    }
}

class program_21 extends demo{
    public static void main(String[] args)
    {
        program_21 obj = new program_21();
        obj.display();
    }
}
