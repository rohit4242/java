// 7. Write a Java program to create a thread using Thread Class
class program_37 extends Thread {
    public void run() {
        System.out.println("thread is running...");
    }

    public static void main(String args[]) {
        program_37 t1 = new program_37();
        t1.start();
    }
}