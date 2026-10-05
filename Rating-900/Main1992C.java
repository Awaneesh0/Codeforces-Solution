import java.util.*;

public class Main1992C {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) return;
        
        int t = sc.nextInt();
        
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            
            // Using StringBuilder is mandatory here for O(N) time.
            // Calling System.out.print() N times will cause a TLE on large test cases.
            StringBuilder sb = new StringBuilder();
            
            // Block 1: Descending from n down to m + 1
            for (int i = n; i > m; i--) {
                sb.append(i).append(" ");
            }
            
            // Block 2: Ascending from 1 up to m
            for (int i = 1; i <= m; i++) {
                sb.append(i).append(" ");
            }
            
            System.out.println(sb.toString().trim());
        }
        
        sc.close();
    }
}