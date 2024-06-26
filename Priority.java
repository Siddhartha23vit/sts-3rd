import java.util.*;

public class Priority{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        // Prompt user for input
        System.out.println("Enter the number of elements:");
        int n = scanner.nextInt();
        System.out.println("Enter " + n + " elements:");

        // Add n items to the priority queue
        for (int i = 0; i < n; i++) {
            int data = scanner.nextInt();
            queue.offer(data);
        }

        // Output sorted elements
        System.out.println("Sorted Queue:");
        while (!queue.isEmpty()) {
            System.out.print(queue.poll() + " ");
        }

        scanner.close();
    }
}
