import java.util.*;
class LoopDetection2{

    static class Node{
        int data; 
        Node next;
        int flag;
    };


    static Node push(Node head_ref, int new_data){
        Node new_node = new Node();
        new_node.data = new_data;
        new_node.flag = 0;
        new_node.next = head_ref;
        head_ref = new_node;
        return head_ref;
    }

    static boolean detectLoop(Node h){
        while( h!= null){
            if( h.flag ==1)
            return true;
            h.flag = 1;
            h = h.next;
        }

        return false;
    }

    public static void min(String[] args){
        Scanner sc= new Scanner(System.in);
        Node head = null;
        int k = sc.nextInt();
        while(k>0){
            int data = sc.nextInt();
            head = push(head, data);
            k--;

        }
        if (detectLoop(head))
        System.out.println("exist");

        else

        System.err.println("o loop");
    }
}