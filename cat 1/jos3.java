//josh , we take n an k where n is the number of people k is poston to start k-1 skipped and killed

import java.util.*;

public class jos3{

    public static int jos(int n, int k){
        if(n==1){
        return 1;}
        else
        return(jos(n-1,k)+k-1)%n+1;

    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.print(jos(n,k));

    }
}