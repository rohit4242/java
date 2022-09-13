// 5. Write a Java program to demonstrate use of super keyword

class first
{
    int num=1;
}
class second extends first
{
    int num=2;
    void display()
    {
        System.out.println(num);
        System.out.println(super.num);
    }
}
public class program_25
{
    public static void main(String[] args)
    {
        second s = new second();

        s.display();
    }
}