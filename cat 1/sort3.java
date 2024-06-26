//quick sort and selection sort 

import java.util.*;

public class sort3{
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //add number of elemenets in the array 
        
        int n = sc.nextInt();
        int[] arr = new int[n] ; //declares a new array with the total size on n
        
        for(int i =0; i < n; i++){
            arr[i] = sc.nextInt(); //scnas n inputs and stores in array at index i
        }
        
        Arrays.sort(arr);
        
        for(int num: arr){
            System.out.print(num + " ");
        }
     
        System.out.println(" ");
        for(int i = n -1; i >= 0 ; i--){
            System.out.print(arr[i]+ " ");
        }
        
    }
}