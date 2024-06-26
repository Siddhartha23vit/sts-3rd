import java.util.Scanner;

class LoopDetection {

    static class Node {
        int data;
        Node next;
        int flag;
    };

    static Node push(Node head_ref, int new_data) {
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.flag = 0;
        new_node.next = head_ref;
        head_ref = new_node;
        return head_ref;
    }

    static boolean detectLoop(Node h) {
        while (h != null) {
            if (h.flag == 1)
                return true;
            h.flag = 1;
            h = h.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Node head = null;

        
        int k = scanner.nextInt();

        
        while (k > 0) {
            int data = scanner.nextInt();
            head = push(head, data);
            k--;
        }

        if (detectLoop(head))
            System.out.println("Loop Found");
        else
            System.out.println("No Loop");

        scanner.close();
    }
}
