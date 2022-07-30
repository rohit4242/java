// 5. Write a Java program to demonstrate use of this keyword.

class demo{
    int n;
    demo(int n){
        this.n = n*n;
    }
    void display(){
        System.out.println("Your square is: "+n);
    }
}

class program_15{
    public static void main(String args[])
    {
        demo obj = new demo(5);
        obj.display();
    }
}