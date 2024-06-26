import java.util.*;
public class Hanoii2{
    static void hanoi(int n, String src, String hlpr, String dest){
        if(n==1){
            System.out.println("transfer " + n + " from +0 " + src+"to" + dest);
            
        }else{
            hanoi(n-1, src, dest, hlpr);
            System.out.println("t" + n + "f"+ src+"to"+dest);
            hanoi(n-1, hlpr, src, dest);
        }
    

       
    }
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int k = sc.nextInt();
            hanoi(k, "A", "B","c");
            sc.close();
    }

}