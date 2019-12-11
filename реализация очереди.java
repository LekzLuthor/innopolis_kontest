import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class me {

    static Queue<Integer> a = new LinkedList<>();
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        int m = s.nextInt();

        for (int i = 0; i <m; i++) {
            String op = s.next();
            if(op.equals("+")) {
                a.add(s.nextInt());
            }
            if(op.equals("-")) {
                System.out.println(a.poll());
            }
        }
    }


}
