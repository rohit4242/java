// 9. Write a Java program to demonstrate use of nested classes.

class demo{
    void display(){
        System.out.println("simple display");
    }
    class nested{
        void display(){
            System.out.println("nested display");
        }
    }
}

class program_19{
    public static void main(String[] args)
    {
        demo obj = new demo();
        obj.display();
        demo.nested obj1 = new demo.nested();
        obj1.display();
    }
}