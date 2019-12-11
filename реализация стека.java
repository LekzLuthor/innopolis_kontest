import java.util.Scanner;
import java.util.Stack;

public class me {
    static Scanner s = new Scanner(System.in);
    static Stack<Integer> a = new Stack<>();


    public static void main(String[] args) {

        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            int op = s.nextInt();
            if (op == 1) {
                a.push(s.nextInt());
            }
            if (op == 2) {
                System.out.println(a.pop());
            }
        }

    }



}
