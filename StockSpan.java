import java.util.*;

public class StockSpan{

    static void calculateSpan(int price[], int n, int S[]) {
        Stack<Integer> st = new Stack<>();
        st.push(0);

        S[0] = 1;
        for (int i = 1; i < n; i++) {
            while (!st.isEmpty() && price[st.peek()] <= price[i])
                st.pop();
            S[i] = st.isEmpty() ? (i + 1) : (i - st.peek());
            st.push(i);
        }
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of days: ");
        int n = scanner.nextInt();

        int price[] = new int[n];

        System.out.println("Enter the prices for each day:");
        for (int i = 0; i < n; i++) {
            price[i] = scanner.nextInt();
        }

        int S[] = new int[n];

        calculateSpan(price, n, S);

        System.out.println("The stock span for each day is:");
        printArray(S);

        scanner.close();
    }
}
