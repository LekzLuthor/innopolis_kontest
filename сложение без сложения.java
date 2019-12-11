import java.util.Scanner;

public class me {

    static Scanner s = new Scanner(System.in);

    public static int sum (int a, int b, int k) {
        if (k < b || k == b) {
            k++;
            return sum(a + 1,b,k);
        }
        return a;
    }


    public static void main(String[] args) {


        int a = s.nextInt();
        int b = s.nextInt();
        int k = 1;
        int h = sum(a,b,k);
        System.out.println(h);

    }
}


   /* public static int lal(int n, int k) {


        if (k < n || k == n) {


            int a = s.nextInt();
            return lal(n,k + 1);
        }
        else
            return 0;

    } */