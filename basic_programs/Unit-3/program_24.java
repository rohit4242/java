// 4. Write a Java program to demonstrate use of method overriding.
class a{
    void display()
    {
        System.out.println("class a");
    }
}

class b extends a{
    void display()
    {
        System.out.println("class b");
    }
}

class program_24{
    public static void main(String args[])
    {
        b obj = new b();
        obj.display();
    }
}
