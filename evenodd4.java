import java.util.*;

public class evenodd4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList<Integer> list = new LinkedList<>();
        for(int i = 0 ; i < n ; i++){
            list.add(sc.nextInt());
        }

        LinkedList<Integer> evenlist = new LinkedList<>();
        LinkedList<Integer> oddlist = new LinkedList<>();

        for(int i = 0 ; i < n ; i++){
            if(list.get(i)%2==0){
                evenlist.add(list.get(i));
            }else{
                oddlist.add(list.get(i));
            }

        }

        for(int num : oddlist){
            evenlist.add(num);
        }

        for(int num : evenlist){
            System.out.print(num+ " ");
        }
    }
}