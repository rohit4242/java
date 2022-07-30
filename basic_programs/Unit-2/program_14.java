// 4. Write a Java program to demonstrate use of parameterised constructor.

class demo{
    int num;
    demo(int n){
        num = n*n*n;
    }
    void display(){
        System.out.println("Your cube is: "+num);
    }
}

class program_14{
    public static void main(String args[])
    {
        demo obj = new demo(5);
        obj.display();
    }
}
