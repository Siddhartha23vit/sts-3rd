
import java.util.Scanner;
public class Hanoi
{
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		int k = sc.nextInt();
		a(k,"A","B","C");
	}static void a(int n,String src,String hlpr,String dest){
	    if(n ==1){
	        System.out.println("transfer disk "+n+" from "+src+" to "+dest);
	    }else{
	        a(n-1,src,dest,hlpr);
	        System.out.println("transfer disk"+n+" from "+src+" to "+dest);
	        a(n-1,hlpr,src,dest);
	        
	    }
	}
}

