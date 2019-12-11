import java.util.Random;
import java.util.Scanner;

public class me {
    static Scanner s =  new Scanner(System.in);
    static Random r = new Random();

    static int n = s.nextInt();
    static int [] arr = new int[n];




    public static int par (int arr[], int left, int right) {
       int i = left;
       int j = right;
       int tmp;
       int pivot = arr[(left + right)/2];

       while (i <= j) {
           while(arr[i] < pivot)
               i++;
           while (arr[j] > pivot)
               j--;
           if (i <= j) {
               tmp = arr[i];
               arr[i] = arr[j];
               arr[j] = tmp;
               i++;
               j--;
           }
       }
       return i;
    }

    public static void quickSort (int arr[], int left, int right) {
        int index = par(arr,left,right);
        if (left < index - 1) {
            quickSort(arr,left,index - 1);
        }
        if (index < right) {
            quickSort(arr, index, right);
        }
    }




    public static void main(String[] args) {

        for (int i = 0; i < n; i++) {
            arr[i] = r.nextInt() % 10;
        }

        int left = 0;
        int right = n - 1;

        quickSort(arr,left,right);

        for (int i = 0; i < n ; i++) {
            System.out.print(arr[i] + " ");
        }

    }


}
