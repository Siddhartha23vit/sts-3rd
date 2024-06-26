import java.util.*;
import java.lang.*;
import java.io.*;
//21bce7782
class LongestPal
{
    static int expandCenter(String s, int l, int r){
        while(l>=0 && r<s.length() &&s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }
        return r-l-1;
    }
    static String longestPal(String s){
        int start = 0, end = 0;
        for(int i = 0 ; i < s.length(); i++){
            int len1 = expandCenter(s,i,i);
            int len2 = expandCenter(s,i,i+1);
            int len = Math.max(len1,len2);
            if( len > end-start){
                start = i-(len-1)/2;
                end = i + len/2;
            }
        }
        return s.substring(start, end+1);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.print(longestPal(s));

	}
}