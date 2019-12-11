import java.util.Scanner;

public class me {

    static Scanner s = new Scanner(System.in);

    public static int fib(int n) {

        if (n < 2) {
            return n;
        }
        else
            return (fib(n -1) + fib(n-2));

    }

    public static void main(String[] args) {

        int n = s.nextInt();
        int F = fib(n);

        System.out.println(F);

    }
}
