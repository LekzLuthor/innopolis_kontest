import java.util.Scanner;

public class me {

    static Scanner s = new Scanner(System.in);



    public static void main(String[] args) {

        int a = s.nextInt();
        int b = s.nextInt();

        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            }
            else
                b = b % a;
        }

        System.out.println(a + b);

    }
}
