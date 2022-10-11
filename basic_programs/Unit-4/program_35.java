// 5. Write a Java program to use Throws Keyword

import java.io.IOException;

class program_35{
    void m() throws IOException {
        throw new IOException("device error");
    }

    void p() {
        try {
            m();
        } catch (Exception e) {
            System.out.println("exception handled");
        }
    }

    public static void main(String args[]) {
        program_35 obj = new program_35();
        obj.p();
        System.out.println("ok");
    }
}