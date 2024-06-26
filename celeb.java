import java.util.*;

public class celeb{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int celeb = findceleb(mat);
        
        if (celeb == -1) {
            System.out.print("No celebrity");
        } else {
            System.out.println("Celebrity: " + celeb);
        }
    }
    
    static int findceleb(int[][] mat) {
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < mat.length; i++) {
            st.push(i);
        }
        
        while (st.size() > 1) {
            int person2 = st.pop();
            int person1 = st.pop();
            if (mat[person2][person1] == 1) {
                st.push(person1);
            } else {
                st.push(person2);
            }
        }
        
        int celebcandidate = st.pop();
        
        for (int i = 0; i < mat.length; i++) {
            if (i != celebcandidate && (mat[celebcandidate][i] == 1 || mat[i][celebcandidate] == 0)) {
                return -1;
            }
        }
        
        return celebcandidate;
    }
    sc.close();
    
}
