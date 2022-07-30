// 2. Write a Java program to demonstrate use of pass objects to methods.

class demo{
    int num;
    demo(int n){
        num = n;
    }
    void display(demo obj){
        obj.num = obj.num*num;
        System.out.println("Your squre is: "+obj.num);
    }
}

class program_12{
    public static void main(String args[])
    {
        demo obj = new demo(5);
        obj.display(obj);
    }
}