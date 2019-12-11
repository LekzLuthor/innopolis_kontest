import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class me {

    static Scanner s = new Scanner(System.in);
    static Deque<Integer> a = new LinkedList<>();

    public static void main(String[] args) {
        int n = s.nextInt();

        for (int i = 0; i < n ; i++) {
            String op = s.next();
            if(op.equals("pushfront")) {
                a.addFirst(s.nextInt());
            }
            if(op.equals("pushback")) {
                a.addLast(s.nextInt());
            }
            if (op.equals("popfront")) {
                System.out.println(a.removeFirst());
            }
            if(op.equals("popback")) {
                System.out.println(a.removeLast());
            }
        }
    }

}
