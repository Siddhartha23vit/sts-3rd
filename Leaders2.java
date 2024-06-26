import java.util.*;

public class Leaders2{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }

        printlead(arr,n);
    }

    public static void printlead(int[] arr, int n ){
        int maxfromright = arr[n-1];
        int[] leaders = new int[n];
        int j = 0;
        
        leaders[j++] = maxfromright;

        for(int i = n-2; i >=0; i--){
            if(maxfromright < arr[i]){
                maxfromright = arr[i];
                leaders[j++] = maxfromright;

            }

        }

        for(int i = j-1; i>=0; i--){
            System.out.print(leaders[i]+" ");
        }
    }
    
}