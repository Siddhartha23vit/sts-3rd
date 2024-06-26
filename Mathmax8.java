import java.util.Scanner;

public class Mathmax8 {
    public static int printme(int[] arr, int n) {
        int totalSum = 0;
        for (int i = 0; i < n; i++) {
            totalSum += arr[i];
        }

        int prefixSum = 0;
        for (int i = 0; i < n; i++) {
            int suffixSum = totalSum - prefixSum - arr[i];
            if (prefixSum == suffixSum) {
                return arr[i];
            }
            prefixSum += arr[i];
        }
        return Integer.MIN_VALUE;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(printme(arr, n));
        sc.close();
    }
}
