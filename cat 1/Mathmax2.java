//math max closest from left and rifght sum

import java.util.*;

public class Mathmax2{
    public static int printme(int[] arr, int n){
        int res = Integer.MIN_VALUE;
        for(int i =0; i<n; i++){
            int prefixsum = arr[i];
            for(int j=0; j<i ; j++)
                prefixsum += arr[j];

            int suffixsum = arr[i];
            for(int j = n-1 ; j>i ; j--)
                suffixsum += arr[j];
            
            if(prefixsum == suffixsum)
                res = Math.max(res, prefixsum);


            
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for(int i = 0 ; i<n; i++){
            arr[i] = sc.nextInt();


        }
        
        System.out.print(printme(arr, n));

    }
}