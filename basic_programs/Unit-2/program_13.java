// 3. Write a Java program to demonstrate use of constructor.

class demo{
    int num;
    demo(int n){
        num = n;
    }
    void display(){
        System.out.println("Your number is: "+num);
    }
}

class program_13{
    public static void main(String args[])
    {
        demo obj = new demo(5);
        obj.display();
    }
}