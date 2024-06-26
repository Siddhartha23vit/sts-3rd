import java.util.*;
import java.io.*;

public class Sort2 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];


        for(int i=0; i <n; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        for(int num: arr){
            System.out.print(num+" ");
        }

        for(int i = n-1; i>=0 ; i--){
            System.out.print(arr[i]+" ");
        }
        // above code is for decesnding order 


    }
}