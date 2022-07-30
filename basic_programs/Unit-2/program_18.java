// 8. Write a Java program to demonstrate use of static block.

class demo{
    static int n;
    static{
        n = 5;
    }
    void display(){
        System.out.println("Your number is: "+n);
    }
}

class program_18{
    public static void main(String args[])
    {
        demo obj = new demo();
        obj.display();
    }
}