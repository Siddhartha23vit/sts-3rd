import java.util.*;

public class Mathmax2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();

        }

        System.out.println(printme(arr, n));
    }

    public static int printme(int[] arr, int n){
        int totalsum = 0;
        for(int i = 0 ; i < n ; i++){
            totalsum += arr[i];

        }

        int prefixsum = 0;
        for(int i = 0 ; i < n ; i++){
            int suffixsum = totalsum - prefixsum - arr[i];
            if(prefixsum == suffixsum){
                return i;
            }
            prefixsum += arr[i];
        }
        return -1;
    }
}