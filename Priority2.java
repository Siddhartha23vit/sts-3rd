import java.util.*;

public class Priority2{
    public static void main(String[] args){
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1; i < n ; i++){
            int data = sc.nextInt();
            queue.offer(data);
        }

        while(!queue.isEmpty()){
            System.out.println(queue.poll()+" ");
        }
    }
}