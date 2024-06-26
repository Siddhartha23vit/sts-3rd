//in this we get the main elements of java, m and n now we need to specify the matric and then start the graph can only go right or down , we simply say how many paths thrtr are from there

import java.util.*;

public class Manuevering3{
    public  static int paths(int m, int n){
        if(m==1 || n==1)
        return 1;
        else
        return(paths(m-1,n)+paths(m,n-1));

        
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();

        System.out.println(paths(m,n));
        
    }


}