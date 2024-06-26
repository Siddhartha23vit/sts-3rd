import java.util.Scanner;

public class Leader {

    public static void printlead(int[] arr, int size) {
        int maxFromRight = arr[size - 1];
        int[] leaders = new int[size];
        int leaderIndex = 0;

        leaders[leaderIndex++] = maxFromRight;

        for (int i = size - 2; i >= 0; i--) {
            if (maxFromRight < arr[i]) {
                maxFromRight = arr[i];
                leaders[leaderIndex++] = maxFromRight;
            }
        }

        for (int i = leaderIndex - 1; i >= 0; i--) {
            System.out.print(leaders[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        printlead(arr, n);
        sc.close();
    }
}
