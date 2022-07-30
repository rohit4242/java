// 6. Write a Java program to demonstrate use of Method Overloading.

class demo{
    void display(){
        System.out.println("Hello");
    }
    void display(int n){
        System.out.println("Hello "+n);
    }
}

class program_16{
    public static void main(String[] args)
    {
        demo obj = new demo();
        obj.display();
        obj.display(5);
    }
}
