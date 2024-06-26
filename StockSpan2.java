import java.util.*;

public class StockSpan2{
    static void calcSpan(int[] price, int n , int[] s){
        Stack<Integer> st = new Stack<>();
        st.push(0);
        s[0] = 1;

        for(int i = 0; i < n ; i++){
            while(!st.isEmpty() && price[st.peek()]<=price[i])
            st.pop();
            s[i] = st.isEmpty() ? (i+1 ) : ( i - st.peek());
            st.push(i);
        }
        

    }

    static void printArray(int[] arr){
        for(int i = 0; i <  arr.length; i++){
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] price = new int[n];
        for(int i = 0; i < n ; i ++){
            price[i] = sc.nextInt();

        }
        int[] s = new int[n];

        calcSpan(price, n ,s);
        printArray(s);

        sc.close();
        


    }

}