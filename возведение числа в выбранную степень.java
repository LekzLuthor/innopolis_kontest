import java.util.Scanner;

public class me {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        double n1 = in.nextDouble();
        int n2 = in.nextInt();
        System.out.print(a(n1, n2));
    }
    public static double a (double n1 , int n2){
        double q = 1;
        while(n2 > 0) {
            if (n2 % 2 == 1) {
                q *= n1;
                n2--;
            }else{
                n1 *= n1;
                n2/=2;
            }
        }
        return q;
    }
}
