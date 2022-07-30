// 10. Write a Java program to demonstrate use of varargs.

class demo{
    void display(int...n){
        for(int i=0;i<n.length;i++){
            System.out.println(n[i]);
        }
    }
}

class program_20{
    public static void main(String[] args)
    {
        demo obj = new demo();
        obj.display(1,2,3,4,5);
    }
}
