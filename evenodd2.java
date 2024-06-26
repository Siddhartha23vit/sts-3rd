import java.util.*;

public class evenodd2{
    static LinkedList<Integer> segregate(LinkedList<Integer> list){
        LinkedList<Integer> evenList = new LinkedList<>();
        LinkedList<Integer> oddList = new LinkedList<>();

        for(int num : list){
            if(num%2 ==0)
            evenList.add(num);
            else
            oddList.add(num);
        }
        evenList.addAll(oddList);
        return evenList;
    }
  
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        int n = sc.nextInt();
        for(int i = 0 ; i < n ; i++){
            int data = sc.nextInt();
            list.add(data);
        }
        list = segregate(list);
        for(int num : list){
            System.out.println(num+" ");
        }
    }
}