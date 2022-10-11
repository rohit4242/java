// 8. Write a Java program to create a thread using Runnable.
class program_38 implements Runnable {
    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String args[]) {
        program_38 a = new program_38();
        Thread b = new Thread(a);
        b.start();
    }
}