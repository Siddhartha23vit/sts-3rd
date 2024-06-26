import java.util.*;

class Node{
    int data;
    Node left,right;

    public Node(int item){
        data = item;
        left = right = null;
    }
}

public class Rightview2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();

        }
        Node root = buildTree(arr, 0);
        printRightView(root, 1);

    }

    static Node buildTree(int[] arr , int i ){
        if( i >= arr.length || arr[i] == -1){
            return null;
        }

        Node root = new Node(arr[i]);
        root.left = buildTree(arr, 2 * i + 1);
        root.right = buildTree(arr, 2*i + 2);
        return root;
    }

    static int maxlevel = 0;

    static void printRightView(Node root, int level){
        if( root == null)
           return;
        if(maxlevel < level){
            System.out.print(root.data + " ");
            maxlevel = level;
        }

        printRightView(root.right, level + 1);
        printRightView(root.left, level + 1);
    }
}