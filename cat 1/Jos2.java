import java.util.*;
import java.io.*;

public class Jos2{

    public static int jos(int n, int k){
         if(n==1)
         return 1;
         else
         return(jos(n-1,k)+k-1)%n+1;

    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        System.out.println(jos(n,k));

    }
}
