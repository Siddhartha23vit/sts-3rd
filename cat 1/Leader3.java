// //leader
// import java.util.*;
// public class Leader3{
//     public static void printleader(int[] arr, int size){ 

//         int maxfromright = arr[size-1];
//         ArrayList<Integer> leaderlist = new ArrayList<>();
//         leaderlist.add(maxfromright);

//         for(int i = size-2; i>=0; i--){
//             if(maxfromright<arr[i]){
//                 maxfromright = arr[i];
//                 leaderlist.add(maxfromright);
//             }
//         }

//     //print

//     for(int i= leaderlist.size()-1; i>=0; i--){

//         System.out.print(leaderlist.get(i)+ " ");
//     }



//     }

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = 



//         printleader(arr,n);
//     }
// }