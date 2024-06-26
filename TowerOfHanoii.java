import java.util.*;

public class TowerOfHanoii
{
    static void towerOfHanoi(int n, char source, char auxiliary, char destination) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        Stack<Integer> s3 = new Stack<>();

        // Push disks onto source tower
        for (int i = n; i >= 1; i--) {
            s1.push(i);
        }

        int totalMoves = (int) (Math.pow(2, n) - 1);

        // If number of disks is even, swap auxiliary and destination towers
        if (n % 2 == 0) {
            char temp = auxiliary;
            auxiliary = destination;
            destination = temp;
        }

        // Perform moves
        for (int i = 1; i <= totalMoves; i++) {
            if (i % 3 == 1) {
                moveDisks(s1, s3, source, destination);
            } else if (i % 3 == 2) {
                moveDisks(s1, s2, source, auxiliary);
            } else if (i % 3 == 0) {
                moveDisks(s2, s3, auxiliary, destination);
            }
        }
    }

    static void moveDisks(Stack<Integer> source, Stack<Integer> destination, char from, char to) {
        if (!source.isEmpty() && (destination.isEmpty() || source.peek() < destination.peek())) {
            int disk = source.pop();
            destination.push(disk);
            System.out.println("Move disk " + disk + " from " + from + " to " + to);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of disks: ");
        int n = scanner.nextInt();

        towerOfHanoi(n, 'A', 'B', 'C');

        scanner.close();
    }
}
