import java.util.Scanner;

public class me {




    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        int n = s.nextInt();
        int [] arr= new int [n];


        for (int i = 0; i < n ; i++) {
            arr[i] = s.nextInt();
        }


        int tmp = 0;
        for(int i = 0;i<n;i++){
            for(int j = (n-1);j>=(i+1);j--){
                if(arr[j]>arr[j-1]){
                    tmp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=tmp;
                }
            }
        }

        for (int i = 0; i < n ; i++) {
            System.out.print(arr[i] + " ");
        }
    }


}