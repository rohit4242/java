// 2. Write a Java program to demonstrate use of multilevel inheritance. 

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
class c extends b{
    void displayC(){
        System.out.println("c");
    }
}
class program_22{
    public static void main(String[] args)
    {
        c obj = new c();
        obj.displayA();
        obj.displayB();
        obj.displayC();
    }
}