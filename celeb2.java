import java.util.*;

public class celeb2{
    public static int findCeleb(int[][] m){
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i < m.length; i++){
            st.push(i);
        }
        
        while(st.size()>1){
            int p2 = st.pop();
            int p1 = st.pop();
            if(m[p1][p2] == 1){
                st.push(p2);

            }else{
                st.push(p1);

            }
        }

        int celebrity = st.pop();
        for(int i = 0; i < m.length; i ++){
            if(i !=celebrity &&(m[celebrity][i] ==1 || m[i][celebrity]==0)){
                return -1;
            }
        }
        return celebrity;
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];

        for(int i = 0 ; i < n ; i++){
            for ( int j = 0 ; j <n; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        int celeb = findCeleb(matrix);
        if (celeb == -1) {
            System.out.println("There is no celebrity in the party");
        } else {
            System.out.println(celeb + " is the celebrity in the party");
        }
    }
}
