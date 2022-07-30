// 7. Write a Java program to demonstrate use of Overloading of Constructor.

class demo{
    int n;
    demo(int n){
        this.n = n;
    }
    demo(){
        this.n = 0;
    }
    void display(){
        System.out.println("Your number is: "+n);
    }
}

class program_17{
    public static void main(String[] args)
    {
        demo obj = new demo(5);
        obj.display();
        demo obj1 = new demo();
        obj1.display();
    }
}