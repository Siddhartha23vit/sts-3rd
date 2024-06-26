import java.util.*;

public class evenodd{
    static LinkedList<Integer> segregateEvenOdd(LinkedList<Integer> list) {
        LinkedList<Integer> evenList = new LinkedList<>();
        LinkedList<Integer> oddList = new LinkedList<>();
  
        for (int num : list) {
            if (num % 2 == 0) {
                evenList.add(num);
            } else {
                oddList.add(num);
            }
        }

        evenList.addAll(oddList);
        return evenList;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();

        System.out.println("How many elements do you want to enter?");
        int count = scanner.nextInt();
        System.out.println("Enter " + count + " elements:");

        for (int i = 0; i < count; i++) {
            int data = scanner.nextInt();
            list.add(data);
        }
        list = segregateEvenOdd(list);
        System.out.println("List after segregating even and odd numbers:");
        for (int num : list) {
            System.out.print(num + " ");
        }
        System.out.println();
        scanner.close();
    }
}
