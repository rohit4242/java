// 3. Write a Java program to demonstrate use of Hierarchical inheritance

class a{
    void displayA(){
        System.out.println("a");
    }
}
class b extends a{
    void displayB(){
        System.out.println("b");
    }
}
class c extends a{
    void displayC(){
        System.out.println("c");
    }
}
class program_23{
    public static void main(String[] args)
    {
        c obj = new c();
        obj.displayA();
        obj.displayC();
    }
}