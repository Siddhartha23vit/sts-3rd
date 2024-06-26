import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int item) {
        data = item;
        left = right = null;
    }
}

class Main {

    static Node buildTree(int[] arr, int i) {
        if (i >= arr.length || arr[i] == -1) {
            return null;
        }

        Node root = new Node(arr[i]);
        root.left = buildTree(arr, 2 * i + 1);
        root.right = buildTree(arr, 2 * i + 2);
        return root;
    }

    static void printLeaves(Node node) {
        if (node == null)
            return;

        printLeaves(node.left);

        if (node.left == null && node.right == null)
            System.out.print(node.data + " ");
        printLeaves(node.right);
    }

    static void printBoundaryLeft(Node node) {
        if (node == null)
            return;

        if (node.left != null) {
            System.out.print(node.data + " ");
            printBoundaryLeft(node.left);
        } else if (node.right != null) {
            System.out.print(node.data + " ");
            printBoundaryLeft(node.right);
        }
    }

    static void printBoundaryRight(Node node) {
        if (node == null)
            return;

        if (node.right != null) {
            printBoundaryRight(node.right);
            System.out.print(node.data + " ");
        } else if (node.left != null) {
            printBoundaryRight(node.left);
            System.out.print(node.data + " ");
        }
    }

    static void printBoundary(Node node) {
        if (node == null)
            return;

        System.out.print(node.data + " ");

        printBoundaryLeft(node.left);
        printLeaves(node.left);
        printLeaves(node.right);
        printBoundaryRight(node.right);
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of nodes:");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the node values (enter -1 for null nodes):");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Node root = buildTree(arr, 0);
        printBoundary(root);
    }
}
