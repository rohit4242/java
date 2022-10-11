// 3. Write a Java program to use Multiple Catch Block

public class program_33 {

    public static void main(String[] args) {

        try {
            int a[] = new int[5];
            a[5] = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception ");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception ");
        } catch (Exception e) {
            System.out.println("exception");
        }
        System.out.println("re-write your code");
    }
}
