
// 9. Write a Java program to set Thread name and priority & test it.
import java.lang.*;

public class program_39 extends Thread {

    public void run() {
        System.out.println("method is running....");
    }

    public static void main(String args[]) {
        program_39 th1 = new program_39();
        program_39 th2 = new program_39();
        program_39 th3 = new program_39();

        System.out.println("Priority of the thread th1 is : " + th1.getPriority());

        System.out.println("Priority of the thread th2 is : " + th2.getPriority());

        System.out.println("Priority of the thread th3 is : " + th2.getPriority());

        th1.setPriority(6);
        th2.setPriority(3);
        th3.setPriority(9);

        System.out.println("Priority of the thread th1 is : " + th1.getPriority());

        System.out.println("Priority of the thread th2 is : " + th2.getPriority());

        System.out.println("Priority of the thread th3 is : " + th3.getPriority());


        System.out.println("Currently Executing The Thread : " + Thread.currentThread().getName());

        System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());

        Thread.currentThread().setPriority(10);

        System.out.println("Priority of the main thread is : " + Thread.currentThread().getPriority());
    }
}