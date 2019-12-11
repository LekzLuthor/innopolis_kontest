import java.util.Scanner;

public class me {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        int n = s.nextInt();
        int [] arr = new int[n];
        int trade = 0;

        for (int i = 0; i <n; i++) {
            arr[i] = s.nextInt();
        }

        int key = 0;
        int I = 0;
        for(int j = 1;j<n;j++){
            key = arr[j];
            I = j-1;
            while(I>=0 && arr[I]>key){
                arr[I+1] = arr[I];
                I = I-1;
                arr[I+1]=key;
                trade++;
            }
        }


        System.out.println(trade);


    }
}
