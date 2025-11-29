package ExceptionHandling;

public class ExceptionDemo {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        try {
            System.out.println(a[6]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("arrayindex out of bound");
        }
        finally {
            System.out.println("done");
            System.out.println("Database closed");
        }

    }
}
