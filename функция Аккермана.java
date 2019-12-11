import java.util.Scanner;

public class me {

    static Scanner s = new Scanner(System.in);

    public static int A(int m, int n) {
        if (m == 0) {
            return n+1;
        }
        else if (m > 0 && n == 0) {
            return A(m - 1, 1);
        }
        else if (m > 0 && n > 0 ) {
            return A(m - 1,  A(m, n - 1));
        }
        else
            return 0;
    }

    public static void main(String[] args) {

        int m = s.nextInt();
        int n = s.nextInt();

        int c = A(m, n);

        System.out.println(c);


    }
}
