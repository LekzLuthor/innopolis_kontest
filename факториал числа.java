import java.util.Scanner;


public class me {

    public static long factor(long n) {
        if(n==1) {
            return 1;
        }
        if(n==0) {
            return 1;
        }

        return n * factor(n - 1);
}

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        long n = s.nextInt();

        long result = factor(n);

        System.out.println(result);

    }
}